package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

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
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination] = js.native
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2DicomGcsDestination] = js.native
}

object SchemaExportDicomDataRequest {
  @scala.inline
  def apply(
    bigqueryDestination: SchemaGoogleCloudHealthcareV1alpha2DicomBigQueryDestination = null,
    gcsDestination: SchemaGoogleCloudHealthcareV1alpha2DicomGcsDestination = null
  ): SchemaExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestination != null) __obj.updateDynamic("bigqueryDestination")(bigqueryDestination.asInstanceOf[js.Any])
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportDicomDataRequest]
  }
}

