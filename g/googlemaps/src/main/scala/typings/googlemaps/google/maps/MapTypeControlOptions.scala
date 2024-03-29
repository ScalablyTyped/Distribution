package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the map type control. */
trait MapTypeControlOptions extends StObject {
  
  /** IDs of map types to show in the control. */
  var mapTypeIds: js.UndefOr[js.Array[MapTypeId | String]] = js.undefined
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_RIGHT.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
  
  /** Style id. Used to select what style of map type control to display. */
  var style: js.UndefOr[MapTypeControlStyle] = js.undefined
}
object MapTypeControlOptions {
  
  inline def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  extension [Self <: MapTypeControlOptions](x: Self) {
    
    inline def setMapTypeIds(value: js.Array[MapTypeId | String]): Self = StObject.set(x, "mapTypeIds", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdsUndefined: Self = StObject.set(x, "mapTypeIds", js.undefined)
    
    inline def setMapTypeIdsVarargs(value: (MapTypeId | String)*): Self = StObject.set(x, "mapTypeIds", js.Array(value :_*))
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: MapTypeControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
