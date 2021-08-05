package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error response of importing resources. This structure will be included in
  * the error details to describe the detailed error. It will only be included
  * when the operation finishes with some failure.
  */
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails extends StObject {
  
  /**
    * The number of resources that had errors.
    */
  var errorCount: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the FHIR store where resources have been imported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of resources included in the source data. This is the
    * sum of the success and error counts.
    */
  var inputSize: js.UndefOr[String] = js.undefined
  
  /**
    * The number of resources that have been imported.
    */
  var successCount: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesErrorDetails](x: Self) {
    
    inline def setErrorCount(value: String): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setFhirStore(value: String): Self = StObject.set(x, "fhirStore", value.asInstanceOf[js.Any])
    
    inline def setFhirStoreUndefined: Self = StObject.set(x, "fhirStore", js.undefined)
    
    inline def setInputSize(value: String): Self = StObject.set(x, "inputSize", value.asInstanceOf[js.Any])
    
    inline def setInputSizeUndefined: Self = StObject.set(x, "inputSize", js.undefined)
    
    inline def setSuccessCount(value: String): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
  }
}
