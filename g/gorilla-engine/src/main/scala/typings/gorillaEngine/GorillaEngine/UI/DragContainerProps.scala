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

trait DragContainerProps
  extends StObject
     with Common
     with Bounds
     with Clickable {
  
  var destinationCanMoveDraggedFiles: Boolean
  
  var dragContent: String
  
  var dragGroup: String
  
  var externalDragEndAction: String
  
  var externalDragStartAction: String
  
  var externallyDraggedFiles: Any
  
  var onDragging: String
  
  var onExternalDragEnd: String
  
  var onExternalDragStart: String
}
object DragContainerProps {
  
  inline def apply(
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    clickGrabsKeyboardFocus: Boolean,
    clickMask: String,
    destinationCanMoveDraggedFiles: Boolean,
    doubleClickAction: String,
    dragContent: String,
    dragGroup: String,
    enabled: Boolean,
    externalDragEndAction: String,
    externalDragStartAction: String,
    externallyDraggedFiles: Any,
    height: Double,
    id: String,
    interceptsMouseClicks: Boolean,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    onDragging: String,
    onExternalDragEnd: String,
    onExternalDragStart: String,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): DragContainerProps = {
    val __obj = js.Dynamic.literal(allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], destinationCanMoveDraggedFiles = destinationCanMoveDraggedFiles.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], dragContent = dragContent.asInstanceOf[js.Any], dragGroup = dragGroup.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], externalDragEndAction = externalDragEndAction.asInstanceOf[js.Any], externalDragStartAction = externalDragStartAction.asInstanceOf[js.Any], externallyDraggedFiles = externallyDraggedFiles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], onDragging = onDragging.asInstanceOf[js.Any], onExternalDragEnd = onExternalDragEnd.asInstanceOf[js.Any], onExternalDragStart = onExternalDragStart.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragContainerProps] (val x: Self) extends AnyVal {
    
    inline def setDestinationCanMoveDraggedFiles(value: Boolean): Self = StObject.set(x, "destinationCanMoveDraggedFiles", value.asInstanceOf[js.Any])
    
    inline def setDragContent(value: String): Self = StObject.set(x, "dragContent", value.asInstanceOf[js.Any])
    
    inline def setDragGroup(value: String): Self = StObject.set(x, "dragGroup", value.asInstanceOf[js.Any])
    
    inline def setExternalDragEndAction(value: String): Self = StObject.set(x, "externalDragEndAction", value.asInstanceOf[js.Any])
    
    inline def setExternalDragStartAction(value: String): Self = StObject.set(x, "externalDragStartAction", value.asInstanceOf[js.Any])
    
    inline def setExternallyDraggedFiles(value: Any): Self = StObject.set(x, "externallyDraggedFiles", value.asInstanceOf[js.Any])
    
    inline def setOnDragging(value: String): Self = StObject.set(x, "onDragging", value.asInstanceOf[js.Any])
    
    inline def setOnExternalDragEnd(value: String): Self = StObject.set(x, "onExternalDragEnd", value.asInstanceOf[js.Any])
    
    inline def setOnExternalDragStart(value: String): Self = StObject.set(x, "onExternalDragStart", value.asInstanceOf[js.Any])
  }
}
