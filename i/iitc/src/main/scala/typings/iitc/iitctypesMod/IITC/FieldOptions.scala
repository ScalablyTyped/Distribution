package typings.iitc.iitctypesMod.IITC

import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOptions
  extends StObject
     with PathOptions {
  
  var data: FieldData
  
  var guid: String
  
  var team: Double
  
  var timestamp: Double
}
object FieldOptions {
  
  inline def apply(data: FieldData, guid: String, team: Double, timestamp: Double): FieldOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions]
  }
  
  extension [Self <: FieldOptions](x: Self) {
    
    inline def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
