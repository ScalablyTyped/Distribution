package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServicesScopedList extends StObject {
  
  /** A list of BackendServices contained in this scope. */
  var backendServices: js.UndefOr[js.Array[BackendService]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object BackendServicesScopedList {
  
  @scala.inline
  def apply(): BackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServicesScopedList]
  }
  
  @scala.inline
  implicit class BackendServicesScopedListMutableBuilder[Self <: BackendServicesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendServices(value: js.Array[BackendService]): Self = StObject.set(x, "backendServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServicesUndefined: Self = StObject.set(x, "backendServices", js.undefined)
    
    @scala.inline
    def setBackendServicesVarargs(value: BackendService*): Self = StObject.set(x, "backendServices", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
