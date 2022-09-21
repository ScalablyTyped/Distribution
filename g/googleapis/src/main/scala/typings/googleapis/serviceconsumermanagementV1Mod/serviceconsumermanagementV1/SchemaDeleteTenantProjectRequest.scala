package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteTenantProjectRequest extends StObject {
  
  /**
    * Required. Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteTenantProjectRequest {
  
  inline def apply(): SchemaDeleteTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTenantProjectRequest]
  }
  
  extension [Self <: SchemaDeleteTenantProjectRequest](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
