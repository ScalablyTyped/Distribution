package typings.iitc.coreHooksMod.global

import typings.iitc.coreIitctypesMod.IITC.Portal
import typings.iitc.coreIitctypesMod.IITC.PortalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPortalDetailsUpdated extends StObject {
  
  var guid: String
  
  var portal: Portal
  
  var portalData: PortalData
  
  var portalDetails: Any
}
object EventPortalDetailsUpdated {
  
  inline def apply(guid: String, portal: Portal, portalData: PortalData, portalDetails: Any): EventPortalDetailsUpdated = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], portalData = portalData.asInstanceOf[js.Any], portalDetails = portalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalDetailsUpdated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventPortalDetailsUpdated] (val x: Self) extends AnyVal {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalData(value: PortalData): Self = StObject.set(x, "portalData", value.asInstanceOf[js.Any])
    
    inline def setPortalDetails(value: Any): Self = StObject.set(x, "portalDetails", value.asInstanceOf[js.Any])
  }
}
