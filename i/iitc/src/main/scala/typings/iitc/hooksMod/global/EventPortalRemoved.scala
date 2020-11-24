package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalRemoved extends js.Object {
  
  var data: PortalData = js.native
  
  var portal: Portal = js.native
}
object EventPortalRemoved {
  
  @scala.inline
  def apply(data: PortalData, portal: Portal): EventPortalRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalRemoved]
  }
  
  @scala.inline
  implicit class EventPortalRemovedOps[Self <: EventPortalRemoved] (val x: Self) extends AnyVal {
    
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
    def setData(value: PortalData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortal(value: Portal): Self = this.set("portal", value.asInstanceOf[js.Any])
  }
}
