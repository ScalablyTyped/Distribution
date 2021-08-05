package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource constituting the TenancyUnit.
  */
trait SchemaTenantResource extends StObject {
  
  /**
    * @OutputOnly Identifier of the tenant resource. For cloud projects, it is
    * in the form &#39;projects/{number}&#39;. For example
    * &#39;projects/123456&#39;.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * Status of tenant resource.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Unique per single tenancy unit.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaTenantResource {
  
  inline def apply(): SchemaTenantResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantResource]
  }
  
  extension [Self <: SchemaTenantResource](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
