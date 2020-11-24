package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagerStatusStateful extends js.Object {
  
  /**
    * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance
    * configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not
    * yet applied those deletions.
    */
  var hasStatefulConfig: js.UndefOr[Boolean] = js.native
  
  /** [Output Only] Status of per-instance configs on the instance. */
  var perInstanceConfigs: js.UndefOr[InstanceGroupManagerStatusStatefulPerInstanceConfigs] = js.native
}
object InstanceGroupManagerStatusStateful {
  
  @scala.inline
  def apply(): InstanceGroupManagerStatusStateful = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatusStateful]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerStatusStatefulOps[Self <: InstanceGroupManagerStatusStateful] (val x: Self) extends AnyVal {
    
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
    def setHasStatefulConfig(value: Boolean): Self = this.set("hasStatefulConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasStatefulConfig: Self = this.set("hasStatefulConfig", js.undefined)
    
    @scala.inline
    def setPerInstanceConfigs(value: InstanceGroupManagerStatusStatefulPerInstanceConfigs): Self = this.set("perInstanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerInstanceConfigs: Self = this.set("perInstanceConfigs", js.undefined)
  }
}
