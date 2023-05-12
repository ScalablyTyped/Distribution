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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.gorillaEngine.GorillaEngine.UI.Common because var conflicts: id. Inlined visible, enabled, wantsKeyboardFocus, clickGrabsKeyboardFocus, alpha, alwaysOnTop
- typings.gorillaEngine.GorillaEngine.UI.DragContainerProps because var conflicts: id. Inlined dragGroup, dragContent, externalDragStartAction, externalDragEndAction, destinationCanMoveDraggedFiles, externallyDraggedFiles, onDragging, onExternalDragStart, onExternalDragEnd */ trait DragContainer
  extends StObject
     with Component
     with Bounds
     with Clickable {
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var destinationCanMoveDraggedFiles: Boolean
  
  var dragContent: String
  
  var dragGroup: String
  
  var enabled: Boolean
  
  var externalDragEndAction: String
  
  var externalDragStartAction: String
  
  var externallyDraggedFiles: Any
  
  var onDragging: String
  
  var onExternalDragEnd: String
  
  var onExternalDragStart: String
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object DragContainer {
  
  inline def apply(
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    children: js.Array[Component],
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
    insertBefore: (Component, Component) => Unit,
    interceptsMouseClicks: Boolean,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    on: (String, Any) => Unit,
    onDragging: String,
    onExternalDragEnd: String,
    onExternalDragStart: String,
    parent: Component,
    removeChild: Component => Unit,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): DragContainer = {
    val __obj = js.Dynamic.literal(allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], destinationCanMoveDraggedFiles = destinationCanMoveDraggedFiles.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], dragContent = dragContent.asInstanceOf[js.Any], dragGroup = dragGroup.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], externalDragEndAction = externalDragEndAction.asInstanceOf[js.Any], externalDragStartAction = externalDragStartAction.asInstanceOf[js.Any], externallyDraggedFiles = externallyDraggedFiles.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), onDragging = onDragging.asInstanceOf[js.Any], onExternalDragEnd = onExternalDragEnd.asInstanceOf[js.Any], onExternalDragStart = onExternalDragStart.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragContainer] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setDestinationCanMoveDraggedFiles(value: Boolean): Self = StObject.set(x, "destinationCanMoveDraggedFiles", value.asInstanceOf[js.Any])
    
    inline def setDragContent(value: String): Self = StObject.set(x, "dragContent", value.asInstanceOf[js.Any])
    
    inline def setDragGroup(value: String): Self = StObject.set(x, "dragGroup", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExternalDragEndAction(value: String): Self = StObject.set(x, "externalDragEndAction", value.asInstanceOf[js.Any])
    
    inline def setExternalDragStartAction(value: String): Self = StObject.set(x, "externalDragStartAction", value.asInstanceOf[js.Any])
    
    inline def setExternallyDraggedFiles(value: Any): Self = StObject.set(x, "externallyDraggedFiles", value.asInstanceOf[js.Any])
    
    inline def setOnDragging(value: String): Self = StObject.set(x, "onDragging", value.asInstanceOf[js.Any])
    
    inline def setOnExternalDragEnd(value: String): Self = StObject.set(x, "onExternalDragEnd", value.asInstanceOf[js.Any])
    
    inline def setOnExternalDragStart(value: String): Self = StObject.set(x, "onExternalDragStart", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
