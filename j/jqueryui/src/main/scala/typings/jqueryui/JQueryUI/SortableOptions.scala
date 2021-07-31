package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Sortable //////////////////////////////////////////////////
trait SortableOptions
  extends StObject
     with SortableEvents {
  
  var appendTo: js.UndefOr[js.Any] = js.undefined
  
  // jQuery, Element, Selector or string
  var attribute: js.UndefOr[String] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var cancel: js.UndefOr[js.Any] = js.undefined
  
  // Selector
  var connectWith: js.UndefOr[js.Any] = js.undefined
  
  // Selector
  var containment: js.UndefOr[js.Any] = js.undefined
  
  // Element, Selector or string
  var cursor: js.UndefOr[String] = js.undefined
  
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var dropOnEmpty: js.UndefOr[Boolean] = js.undefined
  
  var forceHelperSize: js.UndefOr[Boolean] = js.undefined
  
  var forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined
  
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  
  var handle: js.UndefOr[js.Any] = js.undefined
  
  var helper: js.UndefOr[
    String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])
  ] = js.undefined
  
  // Selector or Element
  var items: js.UndefOr[js.Any] = js.undefined
  
  // Selector
  var opacity: js.UndefOr[Double] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var revert: js.UndefOr[js.Any] = js.undefined
  
  // boolean or number
  var scroll: js.UndefOr[Boolean] = js.undefined
  
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  
  var tolerance: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object SortableOptions {
  
  @scala.inline
  def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  
  @scala.inline
  implicit class SortableOptionsMutableBuilder[Self <: SortableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setCancel(value: js.Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setConnectWith(value: js.Any): Self = StObject.set(x, "connectWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectWithUndefined: Self = StObject.set(x, "connectWith", js.undefined)
    
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
    def setDropOnEmpty(value: Boolean): Self = StObject.set(x, "dropOnEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropOnEmptyUndefined: Self = StObject.set(x, "dropOnEmpty", js.undefined)
    
    @scala.inline
    def setForceHelperSize(value: Boolean): Self = StObject.set(x, "forceHelperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceHelperSizeUndefined: Self = StObject.set(x, "forceHelperSize", js.undefined)
    
    @scala.inline
    def setForcePlaceholderSize(value: Boolean): Self = StObject.set(x, "forcePlaceholderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePlaceholderSizeUndefined: Self = StObject.set(x, "forcePlaceholderSize", js.undefined)
    
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
    def setHelper(value: String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperFunction2(value: (/* event */ JQueryEventObject, /* element */ Sortable) => Element): Self = StObject.set(x, "helper", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRevert(value: js.Any): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    
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
    def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
