package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficLayerOptions extends StObject {
  
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[Map[Element]] = js.undefined
}
object TrafficLayerOptions {
  
  inline def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  extension [Self <: TrafficLayerOptions](x: Self) {
    
    inline def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
