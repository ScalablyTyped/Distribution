package typings.heremaps.anon

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: TileLayer
  
  var traffic: TileLayer
  
  var trafficincidents: MarkerTileLayer
}
object Map {
  
  inline def apply(map: TileLayer, traffic: TileLayer, trafficincidents: MarkerTileLayer): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any], trafficincidents = trafficincidents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    inline def setMap(value: TileLayer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setTraffic(value: TileLayer): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficincidents(value: MarkerTileLayer): Self = StObject.set(x, "trafficincidents", value.asInstanceOf[js.Any])
  }
}
