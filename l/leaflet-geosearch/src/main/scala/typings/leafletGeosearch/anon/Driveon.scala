package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Driveon extends StObject {
  
  var drive_on: String
  
  var road: String
  
  var road_type: String
  
  var speed_in: String
}
object Driveon {
  
  inline def apply(drive_on: String, road: String, road_type: String, speed_in: String): Driveon = {
    val __obj = js.Dynamic.literal(drive_on = drive_on.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], road_type = road_type.asInstanceOf[js.Any], speed_in = speed_in.asInstanceOf[js.Any])
    __obj.asInstanceOf[Driveon]
  }
  
  extension [Self <: Driveon](x: Self) {
    
    inline def setDrive_on(value: String): Self = StObject.set(x, "drive_on", value.asInstanceOf[js.Any])
    
    inline def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
    
    inline def setRoad_type(value: String): Self = StObject.set(x, "road_type", value.asInstanceOf[js.Any])
    
    inline def setSpeed_in(value: String): Self = StObject.set(x, "speed_in", value.asInstanceOf[js.Any])
  }
}
