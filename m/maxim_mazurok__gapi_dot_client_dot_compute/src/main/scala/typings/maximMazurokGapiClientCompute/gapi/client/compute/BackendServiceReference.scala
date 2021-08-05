package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServiceReference extends StObject {
  
  var backendService: js.UndefOr[String] = js.undefined
}
object BackendServiceReference {
  
  inline def apply(): BackendServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceReference]
  }
  
  extension [Self <: BackendServiceReference](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
