package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialMidiKeyboardKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.MidiKeyboardProps because var conflicts: id. Inlined lowKey, highKey, disableNKSColors, keys */ trait MidiKeyboard
  extends StObject
     with Component
     with Bounds
     with Background {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var disableNKSColors: Boolean
  
  var enabled: Boolean
  
  var highKey: Double
  
  var keys: PartialMidiKeyboardKeys
  
  var lowKey: Double
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object MidiKeyboard {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    cornerRadius: Double,
    disableNKSColors: Boolean,
    enabled: Boolean,
    height: Double,
    highKey: Double,
    id: String,
    insertBefore: (Component, Component) => Unit,
    keys: PartialMidiKeyboardKeys,
    lowKey: Double,
    on: (String, Any) => Unit,
    parent: Component,
    removeChild: Component => Unit,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): MidiKeyboard = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], disableNKSColors = disableNKSColors.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highKey = highKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), keys = keys.asInstanceOf[js.Any], lowKey = lowKey.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiKeyboard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MidiKeyboard] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableNKSColors(value: Boolean): Self = StObject.set(x, "disableNKSColors", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHighKey(value: Double): Self = StObject.set(x, "highKey", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: PartialMidiKeyboardKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setLowKey(value: Double): Self = StObject.set(x, "lowKey", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
