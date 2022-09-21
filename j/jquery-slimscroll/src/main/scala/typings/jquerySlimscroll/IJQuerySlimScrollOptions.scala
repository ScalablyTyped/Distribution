package typings.jquerySlimscroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJQuerySlimScrollOptions extends StObject {
  
  /**
    * check if mousewheel should scroll the window if we reach top/bottom
    */
  var allowPageScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * enables always-on mode for the scrollbar
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * default CSS class of the slimscroll bar
    */
  var barClass: js.UndefOr[String] = js.undefined
  
  /**
    * sets border radius
    */
  var borderRadius: js.UndefOr[String] = js.undefined
  
  /**
    * scrollbar color, accepts any hex/color value
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * release resources held by the plugin
    */
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * check if we should hide the scrollbar when user is hovering over
    */
  var disableFadeOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * distance in pixels between the side edge and the scrollbar
    */
  var distance: js.UndefOr[String] = js.undefined
  
  /**
    * height in pixels of the visible scroll area
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * sets scrollbar opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * scrollbar position - left/right
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * sets border radius of the rail
    */
  var railBorderRadius: js.UndefOr[String] = js.undefined
  
  /**
    * default CSS class of the slimscroll rail
    */
  var railClass: js.UndefOr[String] = js.undefined
  
  /**
    * sets rail color
    */
  var railColor: js.UndefOr[String] = js.undefined
  
  /**
    * whether  we should use jQuery UI Draggable to enable bar dragging
    */
  var railDraggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * sets rail opacity
    */
  var railOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * sets visibility of the rail
    */
  var railVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * increases/decreases current scroll value by specified amount
    */
  var scrollBy: js.UndefOr[String] = js.undefined
  
  /**
    * jumps to the specified scroll value
    */
  var scrollTo: js.UndefOr[String] = js.undefined
  
  /**
    * width in pixels of the scrollbar and rail
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * default scroll position on load - top / bottom / $('selector')
    */
  var start: js.UndefOr[Any] = js.undefined
  
  /**
    * scroll amount applied when user is using gestures
    */
  var touchScrollStep: js.UndefOr[Double] = js.undefined
  
  /**
    * scroll amount applied to each mouse wheel step
    */
  var wheelStep: js.UndefOr[Double] = js.undefined
  
  /**
    * width in pixels of the visible scroll area
    */
  var width: js.UndefOr[String] = js.undefined
  
  /**
    * default CSS class of the slimscroll wrapper
    */
  var wrapperClass: js.UndefOr[String] = js.undefined
}
object IJQuerySlimScrollOptions {
  
  inline def apply(): IJQuerySlimScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJQuerySlimScrollOptions]
  }
  
  extension [Self <: IJQuerySlimScrollOptions](x: Self) {
    
    inline def setAllowPageScroll(value: Boolean): Self = StObject.set(x, "allowPageScroll", value.asInstanceOf[js.Any])
    
    inline def setAllowPageScrollUndefined: Self = StObject.set(x, "allowPageScroll", js.undefined)
    
    inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    inline def setBarClass(value: String): Self = StObject.set(x, "barClass", value.asInstanceOf[js.Any])
    
    inline def setBarClassUndefined: Self = StObject.set(x, "barClass", js.undefined)
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDisableFadeOut(value: Boolean): Self = StObject.set(x, "disableFadeOut", value.asInstanceOf[js.Any])
    
    inline def setDisableFadeOutUndefined: Self = StObject.set(x, "disableFadeOut", js.undefined)
    
    inline def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRailBorderRadius(value: String): Self = StObject.set(x, "railBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setRailBorderRadiusUndefined: Self = StObject.set(x, "railBorderRadius", js.undefined)
    
    inline def setRailClass(value: String): Self = StObject.set(x, "railClass", value.asInstanceOf[js.Any])
    
    inline def setRailClassUndefined: Self = StObject.set(x, "railClass", js.undefined)
    
    inline def setRailColor(value: String): Self = StObject.set(x, "railColor", value.asInstanceOf[js.Any])
    
    inline def setRailColorUndefined: Self = StObject.set(x, "railColor", js.undefined)
    
    inline def setRailDraggable(value: Boolean): Self = StObject.set(x, "railDraggable", value.asInstanceOf[js.Any])
    
    inline def setRailDraggableUndefined: Self = StObject.set(x, "railDraggable", js.undefined)
    
    inline def setRailOpacity(value: Double): Self = StObject.set(x, "railOpacity", value.asInstanceOf[js.Any])
    
    inline def setRailOpacityUndefined: Self = StObject.set(x, "railOpacity", js.undefined)
    
    inline def setRailVisible(value: Boolean): Self = StObject.set(x, "railVisible", value.asInstanceOf[js.Any])
    
    inline def setRailVisibleUndefined: Self = StObject.set(x, "railVisible", js.undefined)
    
    inline def setScrollBy(value: String): Self = StObject.set(x, "scrollBy", value.asInstanceOf[js.Any])
    
    inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
    
    inline def setScrollTo(value: String): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
    
    inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTouchScrollStep(value: Double): Self = StObject.set(x, "touchScrollStep", value.asInstanceOf[js.Any])
    
    inline def setTouchScrollStepUndefined: Self = StObject.set(x, "touchScrollStep", js.undefined)
    
    inline def setWheelStep(value: Double): Self = StObject.set(x, "wheelStep", value.asInstanceOf[js.Any])
    
    inline def setWheelStepUndefined: Self = StObject.set(x, "wheelStep", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
    
    inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
  }
}
