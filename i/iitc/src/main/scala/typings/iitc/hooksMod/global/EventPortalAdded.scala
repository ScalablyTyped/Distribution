package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalAdded extends js.Object {
  
  var portal: Portal = js.native
  
  var previousData: PortalData = js.native
}
object EventPortalAdded {
  
  @scala.inline
  def apply(portal: Portal, previousData: PortalData): EventPortalAdded = {
    val __obj = js.Dynamic.literal(portal = portal.asInstanceOf[js.Any], previousData = previousData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalAdded]
  }
  
  @scala.inline
  implicit class EventPortalAddedOps[Self <: EventPortalAdded] (val x: Self) extends AnyVal {
    
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
    def setPortal(value: Portal): Self = this.set("portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousData(value: PortalData): Self = this.set("previousData", value.asInstanceOf[js.Any])
  }
}
