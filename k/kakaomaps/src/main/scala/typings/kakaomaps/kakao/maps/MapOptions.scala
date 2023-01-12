package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// # Core
trait MapOptions extends StObject {
  
  var center: LatLng
  
  var disableDoubleClick: js.UndefOr[Boolean] = js.undefined
  
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var keyboardShortcuts: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var mapTypeId: js.UndefOr[MapTypeId] = js.undefined
  
  var projectionId: js.UndefOr[String] = js.undefined
  
  var scrollwheel: js.UndefOr[Boolean] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var tileAnimation: js.UndefOr[Boolean] = js.undefined
}
object MapOptions {
  
  inline def apply(center: LatLng): MapOptions = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClick(value: Boolean): Self = StObject.set(x, "disableDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickUndefined: Self = StObject.set(x, "disableDoubleClick", js.undefined)
    
    inline def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setKeyboardShortcuts(value: Boolean | js.Object): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcutsUndefined: Self = StObject.set(x, "keyboardShortcuts", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMapTypeId(value: MapTypeId): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    inline def setProjectionId(value: String): Self = StObject.set(x, "projectionId", value.asInstanceOf[js.Any])
    
    inline def setProjectionIdUndefined: Self = StObject.set(x, "projectionId", js.undefined)
    
    inline def setScrollwheel(value: Boolean): Self = StObject.set(x, "scrollwheel", value.asInstanceOf[js.Any])
    
    inline def setScrollwheelUndefined: Self = StObject.set(x, "scrollwheel", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setTileAnimation(value: Boolean): Self = StObject.set(x, "tileAnimation", value.asInstanceOf[js.Any])
    
    inline def setTileAnimationUndefined: Self = StObject.set(x, "tileAnimation", js.undefined)
  }
}
