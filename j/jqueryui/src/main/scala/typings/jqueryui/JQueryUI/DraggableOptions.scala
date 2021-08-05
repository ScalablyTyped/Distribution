package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableOptions
  extends StObject
     with DraggableEvents {
  
  var addClasses: js.UndefOr[Boolean] = js.undefined
  
  var appendTo: js.UndefOr[js.Any] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[DraggableClasses] = js.undefined
  
  var connectToSortable: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  var containment: js.UndefOr[js.Any] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  
  var handle: js.UndefOr[js.Any] = js.undefined
  
  var helper: js.UndefOr[js.Any] = js.undefined
  
  var iframeFix: js.UndefOr[js.Any] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var refreshPositions: js.UndefOr[Boolean] = js.undefined
  
  var revert: js.UndefOr[js.Any] = js.undefined
  
  var revertDuration: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var scroll: js.UndefOr[Boolean] = js.undefined
  
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  
  var snap: js.UndefOr[js.Any] = js.undefined
  
  var snapMode: js.UndefOr[String] = js.undefined
  
  var snapTolerance: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object DraggableOptions {
  
  inline def apply(): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOptions]
  }
  
  extension [Self <: DraggableOptions](x: Self) {
    
    inline def setAddClasses(value: Boolean): Self = StObject.set(x, "addClasses", value.asInstanceOf[js.Any])
    
    inline def setAddClassesUndefined: Self = StObject.set(x, "addClasses", js.undefined)
    
    inline def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setClasses(value: DraggableClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setConnectToSortable(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "connectToSortable", value.asInstanceOf[js.Any])
    
    inline def setConnectToSortableUndefined: Self = StObject.set(x, "connectToSortable", js.undefined)
    
    inline def setConnectToSortableVarargs(value: Element*): Self = StObject.set(x, "connectToSortable", js.Array(value :_*))
    
    inline def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorAt(value: js.Any): Self = StObject.set(x, "cursorAt", value.asInstanceOf[js.Any])
    
    inline def setCursorAtUndefined: Self = StObject.set(x, "cursorAt", js.undefined)
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value :_*))
    
    inline def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setHelper(value: js.Any): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setIframeFix(value: js.Any): Self = StObject.set(x, "iframeFix", value.asInstanceOf[js.Any])
    
    inline def setIframeFixUndefined: Self = StObject.set(x, "iframeFix", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRefreshPositions(value: Boolean): Self = StObject.set(x, "refreshPositions", value.asInstanceOf[js.Any])
    
    inline def setRefreshPositionsUndefined: Self = StObject.set(x, "refreshPositions", js.undefined)
    
    inline def setRevert(value: js.Any): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertDuration(value: Double): Self = StObject.set(x, "revertDuration", value.asInstanceOf[js.Any])
    
    inline def setRevertDurationUndefined: Self = StObject.set(x, "revertDuration", js.undefined)
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSnap(value: js.Any): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapMode(value: String): Self = StObject.set(x, "snapMode", value.asInstanceOf[js.Any])
    
    inline def setSnapModeUndefined: Self = StObject.set(x, "snapMode", js.undefined)
    
    inline def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
    
    inline def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
