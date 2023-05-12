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
- typings.gorillaEngine.GorillaEngine.UI.DropZoneProps because var conflicts: id. Inlined acceptedFileTypes, onDraggedFiles, onDroppedFile */ trait DropZone
  extends StObject
     with Component
     with Bounds
     with Clickable {
  
  var acceptedFileTypes: js.Array[String] | String
  
  var alpha: Double
  
  var alwaysOnTop: Boolean
  
  var clickGrabsKeyboardFocus: Boolean
  
  var enabled: Boolean
  
  var onDraggedFiles: String
  
  var onDroppedFile: String
  
  var visible: Boolean
  
  var wantsKeyboardFocus: Boolean
}
object DropZone {
  
  inline def apply(
    acceptedFileTypes: js.Array[String] | String,
    allowClicksOnChildren: Boolean,
    alpha: Double,
    alwaysOnTop: Boolean,
    appendChild: Component => Unit,
    children: js.Array[Component],
    clickGrabsKeyboardFocus: Boolean,
    clickMask: String,
    doubleClickAction: String,
    enabled: Boolean,
    height: Double,
    id: String,
    insertBefore: (Component, Component) => Unit,
    interceptsMouseClicks: Boolean,
    modifiedClickAction: String,
    mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`),
    mouseEnterAction: String,
    mouseExitAction: String,
    on: (String, Any) => Unit,
    onDraggedFiles: String,
    onDroppedFile: String,
    parent: Component,
    removeChild: Component => Unit,
    visible: Boolean,
    wantsKeyboardFocus: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): DropZone = {
    val __obj = js.Dynamic.literal(acceptedFileTypes = acceptedFileTypes.asInstanceOf[js.Any], allowClicksOnChildren = allowClicksOnChildren.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), children = children.asInstanceOf[js.Any], clickGrabsKeyboardFocus = clickGrabsKeyboardFocus.asInstanceOf[js.Any], clickMask = clickMask.asInstanceOf[js.Any], doubleClickAction = doubleClickAction.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), interceptsMouseClicks = interceptsMouseClicks.asInstanceOf[js.Any], modifiedClickAction = modifiedClickAction.asInstanceOf[js.Any], mouseCursorType = mouseCursorType.asInstanceOf[js.Any], mouseEnterAction = mouseEnterAction.asInstanceOf[js.Any], mouseExitAction = mouseExitAction.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), onDraggedFiles = onDraggedFiles.asInstanceOf[js.Any], onDroppedFile = onDroppedFile.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), visible = visible.asInstanceOf[js.Any], wantsKeyboardFocus = wantsKeyboardFocus.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropZone] (val x: Self) extends AnyVal {
    
    inline def setAcceptedFileTypes(value: js.Array[String] | String): Self = StObject.set(x, "acceptedFileTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedFileTypesVarargs(value: String*): Self = StObject.set(x, "acceptedFileTypes", js.Array(value*))
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setClickGrabsKeyboardFocus(value: Boolean): Self = StObject.set(x, "clickGrabsKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setOnDraggedFiles(value: String): Self = StObject.set(x, "onDraggedFiles", value.asInstanceOf[js.Any])
    
    inline def setOnDroppedFile(value: String): Self = StObject.set(x, "onDroppedFile", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWantsKeyboardFocus(value: Boolean): Self = StObject.set(x, "wantsKeyboardFocus", value.asInstanceOf[js.Any])
  }
}
