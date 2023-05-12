package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.Partialnormalstringhovers
import typings.gorillaEngine.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.PadProps because var conflicts: id. Inlined midiNote, velocity, padState, images */ trait Pad
  extends StObject
     with Component
     with Bounds
     with Background
     with KeyboardFocus {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var enabled: Boolean
  
  var images: Partialnormalstringhovers
  
  var midiNote: Double
  
  var padState: Boolean
  
  var velocity: Double
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object Pad {
  
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
    enabled: Boolean,
    height: Double,
    id: String,
    images: Partialnormalstringhovers,
    insertBefore: (Component, Component) => Unit,
    keyboardFocus: `0`,
    midiNote: Double,
    on: (String, Any) => Unit,
    padState: Boolean,
    parent: Component,
    removeChild: Component => Unit,
    velocity: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): Pad = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), keyboardFocus = keyboardFocus.asInstanceOf[js.Any], midiNote = midiNote.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), padState = padState.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), velocity = velocity.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pad] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Partialnormalstringhovers): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setMidiNote(value: Double): Self = StObject.set(x, "midiNote", value.asInstanceOf[js.Any])
    
    inline def setPadState(value: Boolean): Self = StObject.set(x, "padState", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
