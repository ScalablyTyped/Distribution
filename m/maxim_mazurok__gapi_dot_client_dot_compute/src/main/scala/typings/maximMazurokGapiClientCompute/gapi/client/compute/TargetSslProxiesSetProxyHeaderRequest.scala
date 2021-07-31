package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSslProxiesSetProxyHeaderRequest extends StObject {
  
  /** The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed. */
  var proxyHeader: js.UndefOr[String] = js.undefined
}
object TargetSslProxiesSetProxyHeaderRequest {
  
  @scala.inline
  def apply(): TargetSslProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetProxyHeaderRequest]
  }
  
  @scala.inline
  implicit class TargetSslProxiesSetProxyHeaderRequestMutableBuilder[Self <: TargetSslProxiesSetProxyHeaderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxyHeader(value: String): Self = StObject.set(x, "proxyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyHeaderUndefined: Self = StObject.set(x, "proxyHeader", js.undefined)
  }
}
