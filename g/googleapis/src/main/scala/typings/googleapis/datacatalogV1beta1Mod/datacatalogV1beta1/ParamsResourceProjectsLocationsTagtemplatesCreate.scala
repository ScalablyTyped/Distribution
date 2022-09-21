package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the project and the template location [region](https://cloud.google.com/data-catalog/docs/concepts/regions. Example: * projects/{project_id\}/locations/us-central1
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1TagTemplate] = js.undefined
  
  /**
    * Required. The id of the tag template to create.
    */
  var tagTemplateId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1beta1TagTemplate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTagTemplateId(value: String): Self = StObject.set(x, "tagTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTagTemplateIdUndefined: Self = StObject.set(x, "tagTemplateId", js.undefined)
  }
}
