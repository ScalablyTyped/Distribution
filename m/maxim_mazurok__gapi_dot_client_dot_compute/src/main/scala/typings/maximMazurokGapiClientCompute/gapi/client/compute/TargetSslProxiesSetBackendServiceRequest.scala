package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSslProxiesSetBackendServiceRequest extends StObject {
  
  /** The URL of the new BackendService resource for the targetSslProxy. */
  var service: js.UndefOr[String] = js.undefined
}
object TargetSslProxiesSetBackendServiceRequest {
  
  @scala.inline
  def apply(): TargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetBackendServiceRequest]
  }
  
  @scala.inline
  implicit class TargetSslProxiesSetBackendServiceRequestMutableBuilder[Self <: TargetSslProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
