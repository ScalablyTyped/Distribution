package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystemTargeting extends js.Object {
  
  /** IDs of operating systems to be included/excluded. */
  var operatingSystemCriteria: js.UndefOr[CriteriaTargeting] = js.native
  
  /** IDs of operating system versions to be included/excluded. */
  var operatingSystemVersionCriteria: js.UndefOr[CriteriaTargeting] = js.native
}
object OperatingSystemTargeting {
  
  @scala.inline
  def apply(): OperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemTargeting]
  }
  
  @scala.inline
  implicit class OperatingSystemTargetingOps[Self <: OperatingSystemTargeting] (val x: Self) extends AnyVal {
    
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
    def setOperatingSystemCriteria(value: CriteriaTargeting): Self = this.set("operatingSystemCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemCriteria: Self = this.set("operatingSystemCriteria", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersionCriteria(value: CriteriaTargeting): Self = this.set("operatingSystemVersionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemVersionCriteria: Self = this.set("operatingSystemVersionCriteria", js.undefined)
  }
}
