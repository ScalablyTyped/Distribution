package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Final response of importing resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes successfully.
  */
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse extends StObject {
  
  /**
    * The name of the FHIR store where the resources have been imported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of resources included in the source data.
    */
  var inputSize: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestImportResourcesResponse](x: Self) {
    
    inline def setFhirStore(value: String): Self = StObject.set(x, "fhirStore", value.asInstanceOf[js.Any])
    
    inline def setFhirStoreUndefined: Self = StObject.set(x, "fhirStore", js.undefined)
    
    inline def setInputSize(value: String): Self = StObject.set(x, "inputSize", value.asInstanceOf[js.Any])
    
    inline def setInputSizeUndefined: Self = StObject.set(x, "inputSize", js.undefined)
  }
}
