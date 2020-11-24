package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagerVersion extends js.Object {
  
  /**
    * The URL of the instance template that is specified for this managed instance group. The group uses this template to create new instances in the managed instance group until the
    * `targetSize` for this version is reached. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the
    * group's updatePolicy.type to PROACTIVE; in those cases, existing instances are updated until the `targetSize` for this version is reached.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  
  /** Name of the version. Unique among all versions in the scope of this managed instance group. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies the intended number of instances to be created from the instanceTemplate. The final number of instances created from the template will be equal to:
    * - If expressed as a fixed number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used.
    * - if expressed as a percent, the targetSize would be (targetSize.percent/100 * InstanceGroupManager.targetSize) If there is a remainder, the number is rounded up.  If unset, this
    * version will update any remaining instances not updated by another version. Read Starting a canary update for more information.
    */
  var targetSize: js.UndefOr[FixedOrPercent] = js.native
}
object InstanceGroupManagerVersion {
  
  @scala.inline
  def apply(): InstanceGroupManagerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerVersion]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerVersionOps[Self <: InstanceGroupManagerVersion] (val x: Self) extends AnyVal {
    
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
    def setInstanceTemplate(value: String): Self = this.set("instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetSize(value: FixedOrPercent): Self = this.set("targetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSize: Self = this.set("targetSize", js.undefined)
  }
}
