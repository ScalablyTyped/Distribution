package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServiceReference extends js.Object {
  
  var backendService: js.UndefOr[String] = js.native
}
object BackendServiceReference {
  
  @scala.inline
  def apply(): BackendServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceReference]
  }
  
  @scala.inline
  implicit class BackendServiceReferenceOps[Self <: BackendServiceReference] (val x: Self) extends AnyVal {
    
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
    def setBackendService(value: String): Self = this.set("backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendService: Self = this.set("backendService", js.undefined)
  }
}
