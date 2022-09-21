package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTenantResource extends StObject {
  
  /**
    * Output only. @OutputOnly Identifier of the tenant resource. For cloud projects, it is in the form 'projects/{number\}'. For example 'projects/123456'.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of tenant resource.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique per single tenancy unit.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaTenantResource {
  
  inline def apply(): SchemaTenantResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantResource]
  }
  
  extension [Self <: SchemaTenantResource](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
