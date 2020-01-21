package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns the errors encountered during DICOM store import.
  */
@js.native
trait SchemaImportDicomDataErrorDetails extends js.Object {
  /**
    * Contains errors encountered in imports of individual resources (e.g., a
    * Google Cloud Storage object).
    */
  var errors: js.UndefOr[js.Array[SchemaImportError]] = js.native
}

object SchemaImportDicomDataErrorDetails {
  @scala.inline
  def apply(errors: js.Array[SchemaImportError] = null): SchemaImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportDicomDataErrorDetails]
  }
}

