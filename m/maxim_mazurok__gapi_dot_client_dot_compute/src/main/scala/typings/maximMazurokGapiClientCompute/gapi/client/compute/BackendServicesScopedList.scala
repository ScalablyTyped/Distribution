package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServicesScopedList extends js.Object {
  
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
  implicit class BackendServicesScopedListOps[Self <: BackendServicesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackendServicesVarargs(value: BackendService*): Self = this.set("backendServices", js.Array(value :_*))
    
    @scala.inline
    def setBackendServices(value: js.Array[BackendService]): Self = this.set("backendServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendServices: Self = this.set("backendServices", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
