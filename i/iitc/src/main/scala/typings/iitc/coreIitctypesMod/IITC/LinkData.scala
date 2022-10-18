package typings.iitc.coreIitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkData extends StObject {
  
  var dGuid: String
  
  var dLatE6: Double
  
  var dLngE6: Double
  
  var oGuid: String
  
  var oLatE6: Double
  
  var oLngE6: Double
  
  var team: String
}
object LinkData {
  
  inline def apply(
    dGuid: String,
    dLatE6: Double,
    dLngE6: Double,
    oGuid: String,
    oLatE6: Double,
    oLngE6: Double,
    team: String
  ): LinkData = {
    val __obj = js.Dynamic.literal(dGuid = dGuid.asInstanceOf[js.Any], dLatE6 = dLatE6.asInstanceOf[js.Any], dLngE6 = dLngE6.asInstanceOf[js.Any], oGuid = oGuid.asInstanceOf[js.Any], oLatE6 = oLatE6.asInstanceOf[js.Any], oLngE6 = oLngE6.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkData]
  }
  
  extension [Self <: LinkData](x: Self) {
    
    inline def setDGuid(value: String): Self = StObject.set(x, "dGuid", value.asInstanceOf[js.Any])
    
    inline def setDLatE6(value: Double): Self = StObject.set(x, "dLatE6", value.asInstanceOf[js.Any])
    
    inline def setDLngE6(value: Double): Self = StObject.set(x, "dLngE6", value.asInstanceOf[js.Any])
    
    inline def setOGuid(value: String): Self = StObject.set(x, "oGuid", value.asInstanceOf[js.Any])
    
    inline def setOLatE6(value: Double): Self = StObject.set(x, "oLatE6", value.asInstanceOf[js.Any])
    
    inline def setOLngE6(value: Double): Self = StObject.set(x, "oLngE6", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
