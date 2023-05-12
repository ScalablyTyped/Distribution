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

trait AmpEnvProps
  extends StObject
     with Common
     with Bounds
     with Background
     with Font {
  
  var attack: PartialAmpItem
  
  var curve: Partialcolorstringthickne
  
  var decay: PartialAmpItem
  
  var release: PartialAmpItem
  
  var sustain: PartialAmpItem
}
object AmpEnvProps {
  
  inline def apply(
    alpha: Double,
    alwaysOnTop: Boolean,
    attack: PartialAmpItem,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
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
    release: PartialAmpItem,
    sustain: PartialAmpItem,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): AmpEnvProps = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], attack = attack.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], decay = decay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], sustain = sustain.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpEnvProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmpEnvProps] (val x: Self) extends AnyVal {
    
    inline def setAttack(value: PartialAmpItem): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setCurve(value: Partialcolorstringthickne): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setDecay(value: PartialAmpItem): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: PartialAmpItem): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setSustain(value: PartialAmpItem): Self = StObject.set(x, "sustain", value.asInstanceOf[js.Any])
  }
}
