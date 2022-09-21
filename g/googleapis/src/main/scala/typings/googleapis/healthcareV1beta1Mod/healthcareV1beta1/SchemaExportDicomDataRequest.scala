package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportDicomDataRequest extends StObject {
  
  /**
    * The BigQuery output destination. You can only export to a BigQuery dataset that's in the same project as the DICOM store you're exporting from. The Cloud Healthcare Service Agent requires two IAM roles on the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination] = js.undefined
  
  /**
    * Specifies the filter configuration.
    */
  var filterConfig: js.UndefOr[SchemaDicomFilterConfig] = js.undefined
  
  /**
    * The Cloud Storage output destination. The Cloud Healthcare Service Agent requires the `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination] = js.undefined
}
object SchemaExportDicomDataRequest {
  
  inline def apply(): SchemaExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportDicomDataRequest]
  }
  
  extension [Self <: SchemaExportDicomDataRequest](x: Self) {
    
    inline def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setFilterConfig(value: SchemaDicomFilterConfig): Self = StObject.set(x, "filterConfig", value.asInstanceOf[js.Any])
    
    inline def setFilterConfigUndefined: Self = StObject.set(x, "filterConfig", js.undefined)
    
    inline def setGcsDestination(value: SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
