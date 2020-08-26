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
  def apply(): SchemaImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataRequest]
  }
  @scala.inline
  implicit class SchemaImportDicomDataRequestOps[Self <: SchemaImportDicomDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGcsSource(value: SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
  
}

