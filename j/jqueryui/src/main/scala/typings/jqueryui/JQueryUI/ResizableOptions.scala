package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Resizable //////////////////////////////////////////////////
trait ResizableOptions
  extends StObject
     with ResizableEvents {
  
  var alsoResize: js.UndefOr[Any] = js.undefined
  
  // Selector, JQuery or Element
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var animateDuration: js.UndefOr[Any] = js.undefined
  
  // number or string
  var animateEasing: js.UndefOr[String] = js.undefined
  
  var aspectRatio: js.UndefOr[Any] = js.undefined
  
  // boolean or number
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var containment: js.UndefOr[Any] = js.undefined
  
  // Selector, Element or string
  var delay: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var ghost: js.UndefOr[Boolean] = js.undefined
  
  var grid: js.UndefOr[Any] = js.undefined
  
  var handles: js.UndefOr[Any] = js.undefined
  
  // string or object
  var helper: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
}
object ResizableOptions {
  
  inline def apply(): ResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizableOptions] (val x: Self) extends AnyVal {
    
    inline def setAlsoResize(value: Any): Self = StObject.set(x, "alsoResize", value.asInstanceOf[js.Any])
    
    inline def setAlsoResizeUndefined: Self = StObject.set(x, "alsoResize", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateDuration(value: Any): Self = StObject.set(x, "animateDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimateDurationUndefined: Self = StObject.set(x, "animateDuration", js.undefined)
    
    inline def setAnimateEasing(value: String): Self = StObject.set(x, "animateEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimateEasingUndefined: Self = StObject.set(x, "animateEasing", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAspectRatio(value: Any): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setContainment(value: Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHandles(value: Any): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
