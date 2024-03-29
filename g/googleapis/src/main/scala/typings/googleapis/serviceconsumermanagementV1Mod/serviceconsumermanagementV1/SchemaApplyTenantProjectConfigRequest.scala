package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplyTenantProjectConfigRequest extends StObject {
  
  /**
    * Configuration that should be applied to the existing tenant project.
    */
  var projectConfig: js.UndefOr[SchemaTenantProjectConfig] = js.undefined
  
  /**
    * Required. Tag of the project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplyTenantProjectConfigRequest {
  
  inline def apply(): SchemaApplyTenantProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplyTenantProjectConfigRequest]
  }
  
  extension [Self <: SchemaApplyTenantProjectConfigRequest](x: Self) {
    
    inline def setProjectConfig(value: SchemaTenantProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
