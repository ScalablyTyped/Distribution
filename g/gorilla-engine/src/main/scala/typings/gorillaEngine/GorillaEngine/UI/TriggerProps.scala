package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.Down
import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.`0`
import typings.gorillaEngine.gorillaEngineStrings.IBeam
import typings.gorillaEngine.gorillaEngineStrings.`bottom center`
import typings.gorillaEngine.gorillaEngineStrings.`bottom edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right`
import typings.gorillaEngine.gorillaEngineStrings.`centered left`
import typings.gorillaEngine.gorillaEngineStrings.`centered right`
import typings.gorillaEngine.gorillaEngineStrings.`cross hair`
import typings.gorillaEngine.gorillaEngineStrings.`dragging hand`
import typings.gorillaEngine.gorillaEngineStrings.`left edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`pointing hand`
import typings.gorillaEngine.gorillaEngineStrings.`right edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top center`
import typings.gorillaEngine.gorillaEngineStrings.`top edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left`
import typings.gorillaEngine.gorillaEngineStrings.`top right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top right`
import typings.gorillaEngine.gorillaEngineStrings.`up down left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down resize`
import typings.gorillaEngine.gorillaEngineStrings.center
import typings.gorillaEngine.gorillaEngineStrings.copying
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.none
import typings.gorillaEngine.gorillaEngineStrings.normal
import typings.gorillaEngine.gorillaEngineStrings.right
import typings.gorillaEngine.gorillaEngineStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerProps
  extends StObject
     with Common
     with Bounds
     with Font
     with Clickable
     with Background
     with KeyboardFocus {
  
  var animation: LottieAnimation
  
  var images: Down
  
  var text: String
}
object TriggerProps {
  
  inline def apply(
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    animation: LottieAnimation,
    backgroundColor: String,
    backgroundImage: String,
    border: FocusColor,
    clickGrabsKeyboardFocus: Boolean,
    clickMask: String,
    cornerRadius: Double,
    doubleClickAction: String,
    enabled: Boolean,
    font: String,
    fontKerning: Double,
    fontSize: Double,
    height: Double,
    id: String,
    images: Down,
    interceptsMouseClicks: Boolean,
    keyboardFocus: `0`,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    text: String,
    textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`),
    textColor: String,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): TriggerProps = {
    val __obj = js.Dynamic.literal(allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], keyboardFocus = keyboardFocus.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerProps] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: LottieAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setImages(value: Down): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
