package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagerStatus extends js.Object {
  
  /** [Output Only] The URL of the Autoscaler that targets this instance group manager. */
  var autoscaler: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently
    * undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.native
  
  /** [Output Only] Stateful status of the given Instance Group Manager. */
  var stateful: js.UndefOr[InstanceGroupManagerStatusStateful] = js.native
  
  /** [Output Only] A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager. */
  var versionTarget: js.UndefOr[InstanceGroupManagerStatusVersionTarget] = js.native
}
object InstanceGroupManagerStatus {
  
  @scala.inline
  def apply(): InstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatus]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerStatusOps[Self <: InstanceGroupManagerStatus] (val x: Self) extends AnyVal {
    
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
    def setAutoscaler(value: String): Self = this.set("autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaler: Self = this.set("autoscaler", js.undefined)
    
    @scala.inline
    def setIsStable(value: Boolean): Self = this.set("isStable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStable: Self = this.set("isStable", js.undefined)
    
    @scala.inline
    def setStateful(value: InstanceGroupManagerStatusStateful): Self = this.set("stateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateful: Self = this.set("stateful", js.undefined)
    
    @scala.inline
    def setVersionTarget(value: InstanceGroupManagerStatusVersionTarget): Self = this.set("versionTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionTarget: Self = this.set("versionTarget", js.undefined)
  }
}
