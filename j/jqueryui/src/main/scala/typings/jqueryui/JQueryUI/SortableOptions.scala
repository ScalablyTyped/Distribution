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
  
  var appendTo: js.UndefOr[Any] = js.undefined
  
  // jQuery, Element, Selector or string
  var attribute: js.UndefOr[String] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var cancel: js.UndefOr[Any] = js.undefined
  
  // Selector
  var connectWith: js.UndefOr[Any] = js.undefined
  
  // Selector
  var containment: js.UndefOr[Any] = js.undefined
  
  // Element, Selector or string
  var cursor: js.UndefOr[String] = js.undefined
  
  var cursorAt: js.UndefOr[Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var dropOnEmpty: js.UndefOr[Boolean] = js.undefined
  
  var forceHelperSize: js.UndefOr[Boolean] = js.undefined
  
  var forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined
  
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  
  var handle: js.UndefOr[Any] = js.undefined
  
  var helper: js.UndefOr[
    String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])
  ] = js.undefined
  
  // Selector or Element
  var items: js.UndefOr[Any] = js.undefined
  
  // Selector
  var opacity: js.UndefOr[Double] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var revert: js.UndefOr[Any] = js.undefined
  
  // boolean or number
  var scroll: js.UndefOr[Boolean] = js.undefined
  
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  
  var tolerance: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object SortableOptions {
  
  inline def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortableOptions] (val x: Self) extends AnyVal {
    
    inline def setAppendTo(value: Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setCancel(value: Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setConnectWith(value: Any): Self = StObject.set(x, "connectWith", value.asInstanceOf[js.Any])
    
    inline def setConnectWithUndefined: Self = StObject.set(x, "connectWith", js.undefined)
    
    inline def setContainment(value: Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorAt(value: Any): Self = StObject.set(x, "cursorAt", value.asInstanceOf[js.Any])
    
    inline def setCursorAtUndefined: Self = StObject.set(x, "cursorAt", js.undefined)
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDropOnEmpty(value: Boolean): Self = StObject.set(x, "dropOnEmpty", value.asInstanceOf[js.Any])
    
    inline def setDropOnEmptyUndefined: Self = StObject.set(x, "dropOnEmpty", js.undefined)
    
    inline def setForceHelperSize(value: Boolean): Self = StObject.set(x, "forceHelperSize", value.asInstanceOf[js.Any])
    
    inline def setForceHelperSizeUndefined: Self = StObject.set(x, "forceHelperSize", js.undefined)
    
    inline def setForcePlaceholderSize(value: Boolean): Self = StObject.set(x, "forcePlaceholderSize", value.asInstanceOf[js.Any])
    
    inline def setForcePlaceholderSizeUndefined: Self = StObject.set(x, "forcePlaceholderSize", js.undefined)
    
    inline def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value*))
    
    inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setHelper(value: String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperFunction2(value: (/* event */ JQueryEventObject, /* element */ Sortable) => Element): Self = StObject.set(x, "helper", js.Any.fromFunction2(value))
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRevert(value: Any): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    inline def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
