package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSslProxiesSetBackendServiceRequest extends StObject {
  
  /** The URL of the new BackendService resource for the targetSslProxy. */
  var service: js.UndefOr[String] = js.undefined
}
object TargetSslProxiesSetBackendServiceRequest {
  
  inline def apply(): TargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSslProxiesSetBackendServiceRequest]
  }
  
  extension [Self <: TargetSslProxiesSetBackendServiceRequest](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
