package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMirrorPolicy extends StObject {
  
  /** The full or partial URL to the BackendService resource being mirrored to. */
  var backendService: js.UndefOr[String] = js.undefined
}
object RequestMirrorPolicy {
  
  inline def apply(): RequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMirrorPolicy]
  }
  
  extension [Self <: RequestMirrorPolicy](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
