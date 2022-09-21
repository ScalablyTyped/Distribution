package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportAnnotationsRequest extends StObject {
  
  /**
    * The BigQuery output destination, which requires two IAM roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination] = js.undefined
  
  /**
    * The Cloud Storage destination, which requires the `roles/storage.objectAdmin` Cloud IAM role.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1AnnotationGcsDestination] = js.undefined
}
object SchemaExportAnnotationsRequest {
  
  inline def apply(): SchemaExportAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportAnnotationsRequest]
  }
  
  extension [Self <: SchemaExportAnnotationsRequest](x: Self) {
    
    inline def setBigqueryDestination(value: SchemaGoogleCloudHealthcareV1beta1AnnotationBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: SchemaGoogleCloudHealthcareV1beta1AnnotationGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
