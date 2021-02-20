package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Final response of exporting resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse extends StObject {
  
  /**
    * The name of the FHIR store where resources have been exported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  
  /**
    * The total number of resources exported from the requested FHIR store.
    */
  var resourceCount: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponseMutableBuilder[Self <: SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse] (val x: Self) extends AnyVal {
    
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
