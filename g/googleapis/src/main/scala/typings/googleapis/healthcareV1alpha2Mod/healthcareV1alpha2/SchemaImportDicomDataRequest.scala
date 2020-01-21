package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

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
    * Cloud Storage source data location and import configuration.  The Cloud
    * Storage location requires the `roles/storage.objectViewer` Cloud IAM
    * role.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource] = js.native
}

object SchemaImportDicomDataRequest {
  @scala.inline
  def apply(gcsSource: SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource = null): SchemaImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportDicomDataRequest]
  }
}

