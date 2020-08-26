package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exports data from the specified DICOM store. If a given resource (e.g., a
  * DICOM object with the same SOPInstance UID) already exists in the output,
  * it is overwritten with the version in the source dataset. Exported DICOM
  * data will persist when the DICOM store from which it was exported is
  * deleted.
  */
@js.native
trait SchemaExportDicomDataRequest extends js.Object {
  /**
    * The BigQuery output destination.  For now, only exporting to a dataset in
    * the current project is supported  The BigQuery location requires two IAM
    * roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination] = js.native
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination] = js.native
}

object SchemaExportDicomDataRequest {
  @scala.inline
  def apply(): SchemaExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportDicomDataRequest]
  }
  @scala.inline
  implicit class SchemaExportDicomDataRequestOps[Self <: SchemaExportDicomDataRequest] (val x: Self) extends AnyVal {
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
    def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    @scala.inline
    def setGcsDestination(value: SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
  
}

