package typings.iitc.coreHooksMod.global

import typings.iitc.coreIitctypesMod.IITC.Portal
import typings.iitc.coreIitctypesMod.IITC.PortalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPortalRemoved extends StObject {
  
  var data: PortalData
  
  var portal: Portal
}
object EventPortalRemoved {
  
  inline def apply(data: PortalData, portal: Portal): EventPortalRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventPortalRemoved] (val x: Self) extends AnyVal {
    
    inline def setData(value: PortalData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
  }
}
