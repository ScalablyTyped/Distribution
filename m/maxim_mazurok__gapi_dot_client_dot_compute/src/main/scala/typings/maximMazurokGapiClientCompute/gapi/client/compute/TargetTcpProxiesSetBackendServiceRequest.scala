package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTcpProxiesSetBackendServiceRequest extends StObject {
  
  /** The URL of the new BackendService resource for the targetTcpProxy. */
  var service: js.UndefOr[String] = js.native
}
object TargetTcpProxiesSetBackendServiceRequest {
  
  @scala.inline
  def apply(): TargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetTcpProxiesSetBackendServiceRequest]
  }
  
  @scala.inline
  implicit class TargetTcpProxiesSetBackendServiceRequestMutableBuilder[Self <: TargetTcpProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
