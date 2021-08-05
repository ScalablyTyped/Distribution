package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServicesScopedList extends StObject {
  
  /** A list of BackendServices contained in this scope. */
  var backendServices: js.UndefOr[js.Array[BackendService]] = js.undefined
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object BackendServicesScopedList {
  
  inline def apply(): BackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServicesScopedList]
  }
  
  extension [Self <: BackendServicesScopedList](x: Self) {
    
    inline def setBackendServices(value: js.Array[BackendService]): Self = StObject.set(x, "backendServices", value.asInstanceOf[js.Any])
    
    inline def setBackendServicesUndefined: Self = StObject.set(x, "backendServices", js.undefined)
    
    inline def setBackendServicesVarargs(value: BackendService*): Self = StObject.set(x, "backendServices", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
