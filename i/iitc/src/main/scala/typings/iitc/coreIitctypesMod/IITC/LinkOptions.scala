package typings.iitc.coreIitctypesMod.IITC

import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkOptions
  extends StObject
     with PathOptions {
  
  var data: LinkData
  
  var guid: String
  
  var team: Double
  
  var timestamp: Double
}
object LinkOptions {
  
  inline def apply(data: LinkData, guid: String, team: Double, timestamp: Double): LinkOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOptions]
  }
  
  extension [Self <: LinkOptions](x: Self) {
    
    inline def setData(value: LinkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
