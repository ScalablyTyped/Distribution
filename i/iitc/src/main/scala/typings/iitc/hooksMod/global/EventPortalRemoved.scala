package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalRemoved extends StObject {
  
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
  implicit class EventPortalRemovedMutableBuilder[Self <: EventPortalRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PortalData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
  }
}
