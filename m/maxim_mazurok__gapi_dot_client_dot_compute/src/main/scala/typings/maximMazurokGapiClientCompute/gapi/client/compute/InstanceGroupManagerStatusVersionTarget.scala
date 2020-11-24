package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagerStatusVersionTarget extends js.Object {
  
  /**
    * [Output Only] A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are
    * specified by version field on Instance Group Manager.
    */
  var isReached: js.UndefOr[Boolean] = js.native
}
object InstanceGroupManagerStatusVersionTarget {
  
  @scala.inline
  def apply(): InstanceGroupManagerStatusVersionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatusVersionTarget]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerStatusVersionTargetOps[Self <: InstanceGroupManagerStatusVersionTarget] (val x: Self) extends AnyVal {
    
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
    def setIsReached(value: Boolean): Self = this.set("isReached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReached: Self = this.set("isReached", js.undefined)
  }
}
