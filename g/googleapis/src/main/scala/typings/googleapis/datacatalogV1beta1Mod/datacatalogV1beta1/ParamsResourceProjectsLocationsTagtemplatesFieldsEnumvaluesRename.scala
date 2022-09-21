package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the enum field value. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\}/fields/{tag_template_field_id\}/enumValues/{enum_value_display_name\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
