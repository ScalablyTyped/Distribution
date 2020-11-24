package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagersDeletePerInstanceConfigsReq extends js.Object {
  
  /** The list of instance names for which we want to delete per-instance configs on this managed instance group. */
  var names: js.UndefOr[js.Array[String]] = js.native
}
object InstanceGroupManagersDeletePerInstanceConfigsReq {
  
  @scala.inline
  def apply(): InstanceGroupManagersDeletePerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersDeletePerInstanceConfigsReq]
  }
  
  @scala.inline
  implicit class InstanceGroupManagersDeletePerInstanceConfigsReqOps[Self <: InstanceGroupManagersDeletePerInstanceConfigsReq] (val x: Self) extends AnyVal {
    
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
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
  }
}
