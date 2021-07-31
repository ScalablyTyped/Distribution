package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Final response of exporting resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
trait SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse extends StObject {
  
  /**
    * The name of the FHIR store where resources have been exported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of resources exported from the requested FHIR store.
    */
  var resourceCount: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponseMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFhirStore(value: String): Self = StObject.set(x, "fhirStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhirStoreUndefined: Self = StObject.set(x, "fhirStore", js.undefined)
    
    @scala.inline
    def setResourceCount(value: String): Self = StObject.set(x, "resourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCountUndefined: Self = StObject.set(x, "resourceCount", js.undefined)
  }
}
