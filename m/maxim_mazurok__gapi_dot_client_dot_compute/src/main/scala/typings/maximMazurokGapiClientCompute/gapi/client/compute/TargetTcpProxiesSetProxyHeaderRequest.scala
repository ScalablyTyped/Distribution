package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTcpProxiesSetProxyHeaderRequest extends StObject {
  
  /** The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed. */
  var proxyHeader: js.UndefOr[String] = js.native
}
object TargetTcpProxiesSetProxyHeaderRequest {
  
  @scala.inline
  def apply(): TargetTcpProxiesSetProxyHeaderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetTcpProxiesSetProxyHeaderRequest]
  }
  
  @scala.inline
  implicit class TargetTcpProxiesSetProxyHeaderRequestMutableBuilder[Self <: TargetTcpProxiesSetProxyHeaderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxyHeader(value: String): Self = StObject.set(x, "proxyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyHeaderUndefined: Self = StObject.set(x, "proxyHeader", js.undefined)
  }
}
