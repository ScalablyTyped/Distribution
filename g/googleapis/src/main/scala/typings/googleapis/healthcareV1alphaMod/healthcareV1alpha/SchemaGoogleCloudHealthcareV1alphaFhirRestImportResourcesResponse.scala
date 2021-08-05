package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Final response of importing resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
trait SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse extends StObject {
  
  /**
    * The number of resources that had errors.
    */
  var errorCount: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of resources included in the source data. This is the
    * sum of the success and error counts.
    */
  var inputSize: js.UndefOr[String] = js.undefined
  
  /**
    * The FHIR store name the resources have been imported to, in the format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of resources that have been imported.
    */
  var successCount: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1alphaFhirRestImportResourcesResponse](x: Self) {
    
    inline def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setInputSize(value: String): Self = StObject.set(x, "inputSize", value.asInstanceOf[js.Any])
    
    inline def setInputSizeUndefined: Self = StObject.set(x, "inputSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSuccessCount(value: String): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
