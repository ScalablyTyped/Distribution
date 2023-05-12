package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.gorillaEngineStrings.IBeam
import typings.gorillaEngine.gorillaEngineStrings.`bottom edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`cross hair`
import typings.gorillaEngine.gorillaEngineStrings.`dragging hand`
import typings.gorillaEngine.gorillaEngineStrings.`left edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`pointing hand`
import typings.gorillaEngine.gorillaEngineStrings.`right edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down resize`
import typings.gorillaEngine.gorillaEngineStrings.copying
import typings.gorillaEngine.gorillaEngineStrings.none
import typings.gorillaEngine.gorillaEngineStrings.normal
import typings.gorillaEngine.gorillaEngineStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clickable extends StObject {
  
  var allowClicksOnChildren: Boolean
  
  var clickMask: String
  
  var doubleClickAction: String
  
  var interceptsMouseClicks: Boolean
  
  var modifiedClickAction: String
  
  var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
  
  var mouseEnterAction: String
  
  var mouseExitAction: String
}
object Clickable {
  
  inline def apply(
    allowClicksOnChildren: Boolean,
    clickMask: String,
    doubleClickAction: String,
    interceptsMouseClicks: Boolean,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String
  ): Clickable = {
    val __obj = js.Dynamic.literal(allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clickable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clickable] (val x: Self) extends AnyVal {
    
    inline def setAllowClicksOnChildren(value: Boolean): Self = StObject.set(x, "allowClicksOnChildren", value.asInstanceOf[js.Any])
    
    inline def setClickMask(value: String): Self = StObject.set(x, "clickMask", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickAction(value: String): Self = StObject.set(x, "doubleClickAction", value.asInstanceOf[js.Any])
    
    inline def setInterceptsMouseClicks(value: Boolean): Self = StObject.set(x, "interceptsMouseClicks", value.asInstanceOf[js.Any])
    
    inline def setModifiedClickAction(value: String): Self = StObject.set(x, "modifiedClickAction", value.asInstanceOf[js.Any])
    
    inline def setMouseCursorType(
      value: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`)
    ): Self = StObject.set(x, "mouseCursorType", value.asInstanceOf[js.Any])
    
    inline def setMouseEnterAction(value: String): Self = StObject.set(x, "mouseEnterAction", value.asInstanceOf[js.Any])
    
    inline def setMouseExitAction(value: String): Self = StObject.set(x, "mouseExitAction", value.asInstanceOf[js.Any])
  }
}
