package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the map type control. */
@js.native
trait MapTypeControlOptions extends StObject {
  
  /** IDs of map types to show in the control. */
  var mapTypeIds: js.UndefOr[js.Array[MapTypeId | String]] = js.native
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_RIGHT.
    */
  var position: js.UndefOr[ControlPosition] = js.native
  
  /** Style id. Used to select what style of map type control to display. */
  var style: js.UndefOr[MapTypeControlStyle] = js.native
}
object MapTypeControlOptions {
  
  @scala.inline
  def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  @scala.inline
  implicit class MapTypeControlOptionsMutableBuilder[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapTypeIds(value: js.Array[MapTypeId | String]): Self = StObject.set(x, "mapTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeIdsUndefined: Self = StObject.set(x, "mapTypeIds", js.undefined)
    
    @scala.inline
    def setMapTypeIdsVarargs(value: (MapTypeId | String)*): Self = StObject.set(x, "mapTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: MapTypeControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
