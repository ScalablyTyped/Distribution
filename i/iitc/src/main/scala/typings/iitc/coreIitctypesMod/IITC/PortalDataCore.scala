package typings.iitc.coreIitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalDataCore extends StObject {
  
  var latE6: Double
  
  var lngE6: Double
  
  var team: String
}
object PortalDataCore {
  
  inline def apply(latE6: Double, lngE6: Double, team: String): PortalDataCore = {
    val __obj = js.Dynamic.literal(latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalDataCore]
  }
  
  extension [Self <: PortalDataCore](x: Self) {
    
    inline def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
    
    inline def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
