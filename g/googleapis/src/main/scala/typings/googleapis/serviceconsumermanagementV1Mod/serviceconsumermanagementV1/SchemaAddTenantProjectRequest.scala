package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to add a newly created and configured tenant project to a tenancy
  * unit.
  */
trait SchemaAddTenantProjectRequest extends StObject {
  
  /**
    * Configuration of the new tenant project to be added to tenancy unit
    * resources.
    */
  var projectConfig: js.UndefOr[SchemaTenantProjectConfig] = js.undefined
  
  /**
    * Tag of the added project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaAddTenantProjectRequest {
  
  inline def apply(): SchemaAddTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddTenantProjectRequest]
  }
  
  extension [Self <: SchemaAddTenantProjectRequest](x: Self) {
    
    inline def setProjectConfig(value: SchemaTenantProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
