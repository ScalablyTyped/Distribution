package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Final response of exporting resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
trait SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse extends StObject {
  
  /**
    * The FHIR store name of the resources that have been exported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of resources exported from the requested FHIR store.
    */
  var resourceCount: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceCount(value: String): Self = StObject.set(x, "resourceCount", value.asInstanceOf[js.Any])
    
    inline def setResourceCountUndefined: Self = StObject.set(x, "resourceCount", js.undefined)
  }
}
