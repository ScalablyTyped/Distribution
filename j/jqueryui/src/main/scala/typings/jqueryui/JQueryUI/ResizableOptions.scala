package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Resizable //////////////////////////////////////////////////
trait ResizableOptions
  extends StObject
     with ResizableEvents {
  
  var alsoResize: js.UndefOr[js.Any] = js.undefined
  
  // Selector, JQuery or Element
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var animateDuration: js.UndefOr[js.Any] = js.undefined
  
  // number or string
  var animateEasing: js.UndefOr[String] = js.undefined
  
  var aspectRatio: js.UndefOr[js.Any] = js.undefined
  
  // boolean or number
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var containment: js.UndefOr[js.Any] = js.undefined
  
  // Selector, Element or string
  var delay: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var ghost: js.UndefOr[Boolean] = js.undefined
  
  var grid: js.UndefOr[js.Any] = js.undefined
  
  var handles: js.UndefOr[js.Any] = js.undefined
  
  // string or object
  var helper: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
}
object ResizableOptions {
  
  @scala.inline
  def apply(): ResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableOptions]
  }
  
  @scala.inline
  implicit class ResizableOptionsMutableBuilder[Self <: ResizableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlsoResize(value: js.Any): Self = StObject.set(x, "alsoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlsoResizeUndefined: Self = StObject.set(x, "alsoResize", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateDuration(value: js.Any): Self = StObject.set(x, "animateDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateDurationUndefined: Self = StObject.set(x, "animateDuration", js.undefined)
    
    @scala.inline
    def setAnimateEasing(value: String): Self = StObject.set(x, "animateEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateEasingUndefined: Self = StObject.set(x, "animateEasing", js.undefined)
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: js.Any): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
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
    def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setHandles(value: js.Any): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    @scala.inline
    def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
