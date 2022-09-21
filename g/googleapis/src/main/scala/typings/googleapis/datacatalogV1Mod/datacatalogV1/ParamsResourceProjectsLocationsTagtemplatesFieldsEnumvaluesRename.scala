package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the enum field value.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest] = js.undefined
}
object ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename {
  
  inline def apply(): ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
