package typings.iitc.iitctypesMod.IITC

import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalOptions
  extends StObject
     with PathOptions {
  
  var data: PortalData
  
  var ent: Any
  
  var guid: PortalGUID
  
  var level: Double
  
  var team: Double
  
  var timestamp: Double
}
object PortalOptions {
  
  inline def apply(data: PortalData, ent: Any, guid: PortalGUID, level: Double, team: Double, timestamp: Double): PortalOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalOptions]
  }
  
  extension [Self <: PortalOptions](x: Self) {
    
    inline def setData(value: PortalData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEnt(value: Any): Self = StObject.set(x, "ent", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: PortalGUID): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
