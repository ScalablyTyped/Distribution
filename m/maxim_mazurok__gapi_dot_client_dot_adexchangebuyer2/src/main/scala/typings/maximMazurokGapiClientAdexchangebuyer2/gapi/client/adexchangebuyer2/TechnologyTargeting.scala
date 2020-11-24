package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TechnologyTargeting extends js.Object {
  
  /** IDs of device capabilities to be included/excluded. */
  var deviceCapabilityTargeting: js.UndefOr[CriteriaTargeting] = js.native
  
  /** IDs of device categories to be included/excluded. */
  var deviceCategoryTargeting: js.UndefOr[CriteriaTargeting] = js.native
  
  /** Operating system related targeting information. */
  var operatingSystemTargeting: js.UndefOr[OperatingSystemTargeting] = js.native
}
object TechnologyTargeting {
  
  @scala.inline
  def apply(): TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnologyTargeting]
  }
  
  @scala.inline
  implicit class TechnologyTargetingOps[Self <: TechnologyTargeting] (val x: Self) extends AnyVal {
    
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
    def setDeviceCapabilityTargeting(value: CriteriaTargeting): Self = this.set("deviceCapabilityTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCapabilityTargeting: Self = this.set("deviceCapabilityTargeting", js.undefined)
    
    @scala.inline
    def setDeviceCategoryTargeting(value: CriteriaTargeting): Self = this.set("deviceCategoryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCategoryTargeting: Self = this.set("deviceCategoryTargeting", js.undefined)
    
    @scala.inline
    def setOperatingSystemTargeting(value: OperatingSystemTargeting): Self = this.set("operatingSystemTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemTargeting: Self = this.set("operatingSystemTargeting", js.undefined)
  }
}
