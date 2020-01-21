package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns the errors encountered during DICOM store import.
  */
@js.native
trait SchemaImportDicomDataErrorDetails extends js.Object {
  /**
    * Deprecated. Use only for debugging purposes.  Contains sample errors
    * encountered in imports of individual resources (for example, a Cloud
    * Storage object).
    */
  var sampleErrors: js.UndefOr[js.Array[SchemaErrorDetail]] = js.native
}

object SchemaImportDicomDataErrorDetails {
  @scala.inline
  def apply(sampleErrors: js.Array[SchemaErrorDetail] = null): SchemaImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (sampleErrors != null) __obj.updateDynamic("sampleErrors")(sampleErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportDicomDataErrorDetails]
  }
}

