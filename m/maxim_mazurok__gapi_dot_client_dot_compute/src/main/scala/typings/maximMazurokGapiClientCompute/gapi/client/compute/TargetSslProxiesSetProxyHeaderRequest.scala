package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSslProxiesSetProxyHeaderRequest extends StObject {
  
  /** The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed. */
  var proxyHeader: js.UndefOr[String] = js.undefined
}
object TargetSslProxiesSetProxyHeaderRequest {
  
  inline def apply(): TargetSslProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetProxyHeaderRequest]
  }
  
  extension [Self <: TargetSslProxiesSetProxyHeaderRequest](x: Self) {
    
    inline def setProxyHeader(value: String): Self = StObject.set(x, "proxyHeader", value.asInstanceOf[js.Any])
    
    inline def setProxyHeaderUndefined: Self = StObject.set(x, "proxyHeader", js.undefined)
  }
}
