package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveTenantProjectRequest extends StObject {
  
  /**
    * Required. Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaRemoveTenantProjectRequest {
  
  inline def apply(): SchemaRemoveTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveTenantProjectRequest]
  }
  
  extension [Self <: SchemaRemoveTenantProjectRequest](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
