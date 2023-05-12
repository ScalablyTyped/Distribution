package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialMidiKeyboardKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MidiKeyboardProps
  extends StObject
     with Common
     with Bounds
     with Background {
  
  var disableNKSColors: Boolean
  
  var highKey: Double
  
  var keys: PartialMidiKeyboardKeys
  
  var lowKey: Double
}
object MidiKeyboardProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    clickGrabsKeyboardFocus: Boolean,
    cornerRadius: Double,
    disableNKSColors: Boolean,
    enabled: Boolean,
    height: Double,
    highKey: Double,
    id: String,
    keys: PartialMidiKeyboardKeys,
    lowKey: Double,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): MidiKeyboardProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], disableNKSColors = disableNKSColors.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highKey = highKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lowKey = lowKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiKeyboardProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MidiKeyboardProps] (val x: Self) extends AnyVal {
    
    inline def setDisableNKSColors(value: Boolean): Self = StObject.set(x, "disableNKSColors", value.asInstanceOf[js.Any])
    
    inline def setHighKey(value: Double): Self = StObject.set(x, "highKey", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: PartialMidiKeyboardKeys): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setLowKey(value: Double): Self = StObject.set(x, "lowKey", value.asInstanceOf[js.Any])
  }
}
