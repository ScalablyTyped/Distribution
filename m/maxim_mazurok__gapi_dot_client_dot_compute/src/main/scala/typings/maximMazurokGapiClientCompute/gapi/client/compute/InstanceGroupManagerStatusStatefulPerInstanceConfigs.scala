package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagerStatusStatefulPerInstanceConfigs extends js.Object {
  
  /** A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs. */
  var allEffective: js.UndefOr[Boolean] = js.native
}
object InstanceGroupManagerStatusStatefulPerInstanceConfigs {
  
  @scala.inline
  def apply(): InstanceGroupManagerStatusStatefulPerInstanceConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatusStatefulPerInstanceConfigs]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerStatusStatefulPerInstanceConfigsOps[Self <: InstanceGroupManagerStatusStatefulPerInstanceConfigs] (val x: Self) extends AnyVal {
    
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
    def setAllEffective(value: Boolean): Self = this.set("allEffective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllEffective: Self = this.set("allEffective", js.undefined)
  }
}
