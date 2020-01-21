package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Imports data into the specified DICOM store. Returns an error if any of the
  * files to import are not DICOM files. This API will accept duplicate DICOM
  * instances, by simply ignoring the newly pushed instance (it will not
  * overwrite).
  */
@js.native
trait SchemaImportDicomDataRequest extends js.Object {
  /**
    * Specifies where the imported data resides.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.native
}

object SchemaImportDicomDataRequest {
  @scala.inline
  def apply(inputConfig: SchemaInputConfig = null): SchemaImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportDicomDataRequest]
  }
}

