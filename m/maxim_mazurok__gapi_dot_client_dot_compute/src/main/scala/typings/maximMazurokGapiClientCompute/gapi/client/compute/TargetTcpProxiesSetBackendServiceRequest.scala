package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTcpProxiesSetBackendServiceRequest extends StObject {
  
  /** The URL of the new BackendService resource for the targetTcpProxy. */
  var service: js.UndefOr[String] = js.undefined
}
object TargetTcpProxiesSetBackendServiceRequest {
  
  inline def apply(): TargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetTcpProxiesSetBackendServiceRequest]
  }
  
  extension [Self <: TargetTcpProxiesSetBackendServiceRequest](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
