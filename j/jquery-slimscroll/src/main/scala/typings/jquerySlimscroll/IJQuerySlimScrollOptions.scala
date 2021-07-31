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
  var start: js.UndefOr[js.Any] = js.undefined
  
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
  
  @scala.inline
  def apply(): IJQuerySlimScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJQuerySlimScrollOptions]
  }
  
  @scala.inline
  implicit class IJQuerySlimScrollOptionsMutableBuilder[Self <: IJQuerySlimScrollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPageScroll(value: Boolean): Self = StObject.set(x, "allowPageScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPageScrollUndefined: Self = StObject.set(x, "allowPageScroll", js.undefined)
    
    @scala.inline
    def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysVisibleUndefined: Self = StObject.set(x, "alwaysVisible", js.undefined)
    
    @scala.inline
    def setBarClass(value: String): Self = StObject.set(x, "barClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarClassUndefined: Self = StObject.set(x, "barClass", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDisableFadeOut(value: Boolean): Self = StObject.set(x, "disableFadeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFadeOutUndefined: Self = StObject.set(x, "disableFadeOut", js.undefined)
    
    @scala.inline
    def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRailBorderRadius(value: String): Self = StObject.set(x, "railBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailBorderRadiusUndefined: Self = StObject.set(x, "railBorderRadius", js.undefined)
    
    @scala.inline
    def setRailClass(value: String): Self = StObject.set(x, "railClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailClassUndefined: Self = StObject.set(x, "railClass", js.undefined)
    
    @scala.inline
    def setRailColor(value: String): Self = StObject.set(x, "railColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailColorUndefined: Self = StObject.set(x, "railColor", js.undefined)
    
    @scala.inline
    def setRailDraggable(value: Boolean): Self = StObject.set(x, "railDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailDraggableUndefined: Self = StObject.set(x, "railDraggable", js.undefined)
    
    @scala.inline
    def setRailOpacity(value: Double): Self = StObject.set(x, "railOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailOpacityUndefined: Self = StObject.set(x, "railOpacity", js.undefined)
    
    @scala.inline
    def setRailVisible(value: Boolean): Self = StObject.set(x, "railVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailVisibleUndefined: Self = StObject.set(x, "railVisible", js.undefined)
    
    @scala.inline
    def setScrollBy(value: String): Self = StObject.set(x, "scrollBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
    
    @scala.inline
    def setScrollTo(value: String): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTouchScrollStep(value: Double): Self = StObject.set(x, "touchScrollStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchScrollStepUndefined: Self = StObject.set(x, "touchScrollStep", js.undefined)
    
    @scala.inline
    def setWheelStep(value: Double): Self = StObject.set(x, "wheelStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelStepUndefined: Self = StObject.set(x, "wheelStep", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
  }
}
