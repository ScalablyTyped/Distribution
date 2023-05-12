package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.Partialnormalstringhovers
import typings.gorillaEngine.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PadProps
  extends StObject
     with Common
     with Bounds
     with Background
     with KeyboardFocus {
  
  var images: Partialnormalstringhovers
  
  var midiNote: Double
  
  var padState: Boolean
  
  var velocity: Double
}
object PadProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    clickGrabsKeyboardFocus: Boolean,
    cornerRadius: Double,
    enabled: Boolean,
    height: Double,
    id: String,
    images: Partialnormalstringhovers,
    keyboardFocus: `0`,
    midiNote: Double,
    padState: Boolean,
    velocity: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): PadProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], keyboardFocus = keyboardFocus.asInstanceOf[js.Any], midiNote = midiNote.asInstanceOf[js.Any], padState = padState.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PadProps] (val x: Self) extends AnyVal {
    
    inline def setImages(value: Partialnormalstringhovers): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setMidiNote(value: Double): Self = StObject.set(x, "midiNote", value.asInstanceOf[js.Any])
    
    inline def setPadState(value: Boolean): Self = StObject.set(x, "padState", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
