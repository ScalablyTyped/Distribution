package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialAmpItem
import typings.gorillaEngine.anon.Partialcolorstringthickne
import typings.gorillaEngine.gorillaEngineStrings.`bottom center`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right`
import typings.gorillaEngine.gorillaEngineStrings.`centered left`
import typings.gorillaEngine.gorillaEngineStrings.`centered right`
import typings.gorillaEngine.gorillaEngineStrings.`top center`
import typings.gorillaEngine.gorillaEngineStrings.`top left`
import typings.gorillaEngine.gorillaEngineStrings.`top right`
import typings.gorillaEngine.gorillaEngineStrings.center
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.AmpEnvProps because var conflicts: id. Inlined attack, decay, sustain, release, curve */ trait AmpEnv
  extends StObject
     with Component
     with Bounds
     with Background
     with Font {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var attack: PartialAmpItem
  
  var clickGrabsKeyboardFocus: Boolean
  
  var curve: Partialcolorstringthickne
  
  var decay: PartialAmpItem
  
  var enabled: Boolean
  
  var release: PartialAmpItem
  
  var sustain: PartialAmpItem
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object AmpEnv {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    attack: PartialAmpItem,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    cornerRadius: Double,
    curve: Partialcolorstringthickne,
    decay: PartialAmpItem,
    enabled: Boolean,
    font: String,
    fontKerning: Double,
    fontSize: Double,
    height: Double,
    id: String,
    insertBefore: (Component, Component) => Unit,
    on: (String, Any) => Unit,
    parent: Component,
    release: PartialAmpItem,
    removeChild: Component => Unit,
    sustain: PartialAmpItem,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): AmpEnv = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), attack = attack.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], decay = decay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), on = js.Any.fromFunction2(on), parent = parent.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), sustain = sustain.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpEnv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmpEnv] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setAttack(value: PartialAmpItem): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setCurve(value: Partialcolorstringthickne): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setDecay(value: PartialAmpItem): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: PartialAmpItem): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setSustain(value: PartialAmpItem): Self = StObject.set(x, "sustain", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
