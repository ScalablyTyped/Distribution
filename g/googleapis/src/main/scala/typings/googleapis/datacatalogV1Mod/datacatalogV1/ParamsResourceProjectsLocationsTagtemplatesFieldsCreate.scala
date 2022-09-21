package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesFieldsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the project and the template location [region](https://cloud.google.com/data-catalog/docs/concepts/regions).
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1TagTemplateField] = js.undefined
  
  /**
    * Required. The ID of the tag template field to create. Note: Adding a required field to an existing template is *not* allowed. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9), underscores (_) and dashes (-). Field IDs must be at least 1 character long and at most 128 characters long. Field IDs must also be unique within their template.
    */
  var tagTemplateFieldId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesFieldsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesFieldsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesFieldsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1TagTemplateField): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTagTemplateFieldId(value: String): Self = StObject.set(x, "tagTemplateFieldId", value.asInstanceOf[js.Any])
    
    inline def setTagTemplateFieldIdUndefined: Self = StObject.set(x, "tagTemplateFieldId", js.undefined)
  }
}
