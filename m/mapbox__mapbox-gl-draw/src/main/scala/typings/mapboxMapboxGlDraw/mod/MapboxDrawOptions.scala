package typings.mapboxMapboxGlDraw.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxDrawOptions extends StObject {
  
  var boxSelect: js.UndefOr[Boolean] = js.undefined
  
  var clickBuffer: js.UndefOr[Double] = js.undefined
  
  var controls: js.UndefOr[MapboxDrawControls] = js.undefined
  
  var defaultMode: js.UndefOr[String] = js.undefined
  
  var displayControlsDefault: js.UndefOr[Boolean] = js.undefined
  
  var keybindings: js.UndefOr[Boolean] = js.undefined
  
  var modes: js.UndefOr[StringDictionary[DrawCustomMode[Any, Any]]] = js.undefined
  
  var styles: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var touchBuffer: js.UndefOr[Double] = js.undefined
  
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  
  var userProperties: js.UndefOr[Boolean] = js.undefined
}
object MapboxDrawOptions {
  
  inline def apply(): MapboxDrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapboxDrawOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapboxDrawOptions] (val x: Self) extends AnyVal {
    
    inline def setBoxSelect(value: Boolean): Self = StObject.set(x, "boxSelect", value.asInstanceOf[js.Any])
    
    inline def setBoxSelectUndefined: Self = StObject.set(x, "boxSelect", js.undefined)
    
    inline def setClickBuffer(value: Double): Self = StObject.set(x, "clickBuffer", value.asInstanceOf[js.Any])
    
    inline def setClickBufferUndefined: Self = StObject.set(x, "clickBuffer", js.undefined)
    
    inline def setControls(value: MapboxDrawControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDefaultMode(value: String): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    inline def setDisplayControlsDefault(value: Boolean): Self = StObject.set(x, "displayControlsDefault", value.asInstanceOf[js.Any])
    
    inline def setDisplayControlsDefaultUndefined: Self = StObject.set(x, "displayControlsDefault", js.undefined)
    
    inline def setKeybindings(value: Boolean): Self = StObject.set(x, "keybindings", value.asInstanceOf[js.Any])
    
    inline def setKeybindingsUndefined: Self = StObject.set(x, "keybindings", js.undefined)
    
    inline def setModes(value: StringDictionary[DrawCustomMode[Any, Any]]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setStyles(value: js.Array[js.Object]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: js.Object*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTouchBuffer(value: Double): Self = StObject.set(x, "touchBuffer", value.asInstanceOf[js.Any])
    
    inline def setTouchBufferUndefined: Self = StObject.set(x, "touchBuffer", js.undefined)
    
    inline def setTouchEnabled(value: Boolean): Self = StObject.set(x, "touchEnabled", value.asInstanceOf[js.Any])
    
    inline def setTouchEnabledUndefined: Self = StObject.set(x, "touchEnabled", js.undefined)
    
    inline def setUserProperties(value: Boolean): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
    
    inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
  }
}
