package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeAccessConfig extends StObject {
  
  /**
    * The type of access mode this instance.
    */
  var accessType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The proxy endpoint that is used to access the runtime.
    */
  var proxyUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The owner of this runtime after creation. Format: `alias@example.com` Currently supports one owner only.
    */
  var runtimeOwner: js.UndefOr[String | Null] = js.undefined
}
object SchemaRuntimeAccessConfig {
  
  inline def apply(): SchemaRuntimeAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeAccessConfig]
  }
  
  extension [Self <: SchemaRuntimeAccessConfig](x: Self) {
    
    inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeNull: Self = StObject.set(x, "accessType", null)
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setProxyUri(value: String): Self = StObject.set(x, "proxyUri", value.asInstanceOf[js.Any])
    
    inline def setProxyUriNull: Self = StObject.set(x, "proxyUri", null)
    
    inline def setProxyUriUndefined: Self = StObject.set(x, "proxyUri", js.undefined)
    
    inline def setRuntimeOwner(value: String): Self = StObject.set(x, "runtimeOwner", value.asInstanceOf[js.Any])
    
    inline def setRuntimeOwnerNull: Self = StObject.set(x, "runtimeOwner", null)
    
    inline def setRuntimeOwnerUndefined: Self = StObject.set(x, "runtimeOwner", js.undefined)
  }
}
