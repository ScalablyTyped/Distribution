package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetSslProxiesSetProxyHeaderRequest extends StObject {
  
  /**
    * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
    */
  var proxyHeader: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetSslProxiesSetProxyHeaderRequest {
  
  inline def apply(): SchemaTargetSslProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetProxyHeaderRequest]
  }
  
  extension [Self <: SchemaTargetSslProxiesSetProxyHeaderRequest](x: Self) {
    
    inline def setProxyHeader(value: String): Self = StObject.set(x, "proxyHeader", value.asInstanceOf[js.Any])
    
    inline def setProxyHeaderNull: Self = StObject.set(x, "proxyHeader", null)
    
    inline def setProxyHeaderUndefined: Self = StObject.set(x, "proxyHeader", js.undefined)
  }
}
