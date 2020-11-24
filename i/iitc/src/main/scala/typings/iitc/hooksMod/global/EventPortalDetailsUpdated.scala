package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalDetailsUpdated extends js.Object {
  
  var guid: String = js.native
  
  var portal: Portal = js.native
  
  var portalData: PortalData = js.native
  
  var portalDetails: js.Any = js.native
}
object EventPortalDetailsUpdated {
  
  @scala.inline
  def apply(guid: String, portal: Portal, portalData: PortalData, portalDetails: js.Any): EventPortalDetailsUpdated = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], portalData = portalData.asInstanceOf[js.Any], portalDetails = portalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalDetailsUpdated]
  }
  
  @scala.inline
  implicit class EventPortalDetailsUpdatedOps[Self <: EventPortalDetailsUpdated] (val x: Self) extends AnyVal {
    
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortal(value: Portal): Self = this.set("portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalData(value: PortalData): Self = this.set("portalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDetails(value: js.Any): Self = this.set("portalDetails", value.asInstanceOf[js.Any])
  }
}
