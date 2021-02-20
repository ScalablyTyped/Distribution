package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableOptions extends DraggableEvents {
  
  var addClasses: js.UndefOr[Boolean] = js.native
  
  var appendTo: js.UndefOr[js.Any] = js.native
  
  var axis: js.UndefOr[String] = js.native
  
  var cancel: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[DraggableClasses] = js.native
  
  var connectToSortable: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  
  var containment: js.UndefOr[js.Any] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var cursorAt: js.UndefOr[js.Any] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var grid: js.UndefOr[js.Array[Double]] = js.native
  
  var handle: js.UndefOr[js.Any] = js.native
  
  var helper: js.UndefOr[js.Any] = js.native
  
  var iframeFix: js.UndefOr[js.Any] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var refreshPositions: js.UndefOr[Boolean] = js.native
  
  var revert: js.UndefOr[js.Any] = js.native
  
  var revertDuration: js.UndefOr[Double] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
  
  var scrollSensitivity: js.UndefOr[Double] = js.native
  
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  var snap: js.UndefOr[js.Any] = js.native
  
  var snapMode: js.UndefOr[String] = js.native
  
  var snapTolerance: js.UndefOr[Double] = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object DraggableOptions {
  
  @scala.inline
  def apply(): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOptions]
  }
  
  @scala.inline
  implicit class DraggableOptionsMutableBuilder[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddClasses(value: Boolean): Self = StObject.set(x, "addClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddClassesUndefined: Self = StObject.set(x, "addClasses", js.undefined)
    
    @scala.inline
    def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setClasses(value: DraggableClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setConnectToSortable(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "connectToSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectToSortableUndefined: Self = StObject.set(x, "connectToSortable", js.undefined)
    
    @scala.inline
    def setConnectToSortableVarargs(value: Element*): Self = StObject.set(x, "connectToSortable", js.Array(value :_*))
    
    @scala.inline
    def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorAt(value: js.Any): Self = StObject.set(x, "cursorAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorAtUndefined: Self = StObject.set(x, "cursorAt", js.undefined)
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value :_*))
    
    @scala.inline
    def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setHelper(value: js.Any): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setIframeFix(value: js.Any): Self = StObject.set(x, "iframeFix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeFixUndefined: Self = StObject.set(x, "iframeFix", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRefreshPositions(value: Boolean): Self = StObject.set(x, "refreshPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshPositionsUndefined: Self = StObject.set(x, "refreshPositions", js.undefined)
    
    @scala.inline
    def setRevert(value: js.Any): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertDuration(value: Double): Self = StObject.set(x, "revertDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertDurationUndefined: Self = StObject.set(x, "revertDuration", js.undefined)
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setSnap(value: js.Any): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapMode(value: String): Self = StObject.set(x, "snapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapModeUndefined: Self = StObject.set(x, "snapMode", js.undefined)
    
    @scala.inline
    def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
