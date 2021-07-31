package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exports data from the specified DICOM store. If a given resource (e.g., a
  * DICOM object with the same SOPInstance UID) already exists in the output,
  * it is overwritten with the version in the source dataset. Exported DICOM
  * data will persist when the DICOM store from which it was exported is
  * deleted.
  */
trait SchemaExportDicomDataRequest extends StObject {
  
  /**
    * The BigQuery output destination.  For now, only exporting to a dataset in
    * the current project is supported  The BigQuery location requires two IAM
    * roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination] = js.undefined
  
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination] = js.undefined
}
object SchemaExportDicomDataRequest {
  
  @scala.inline
  def apply(): SchemaExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportDicomDataRequest]
  }
  
  @scala.inline
  implicit class SchemaExportDicomDataRequestMutableBuilder[Self <: SchemaExportDicomDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
