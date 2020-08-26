package typings.jquerySlimscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJQuerySlimScrollOptions extends js.Object {
  /**
    * check if mousewheel should scroll the window if we reach top/bottom
    */
  var allowPageScroll: js.UndefOr[Boolean] = js.native
  /**
    * enables always-on mode for the scrollbar
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * default CSS class of the slimscroll bar
    */
  var barClass: js.UndefOr[String] = js.native
  /**
    * sets border radius
    */
  var borderRadius: js.UndefOr[String] = js.native
  /**
    * scrollbar color, accepts any hex/color value
    */
  var color: js.UndefOr[String] = js.native
  /**
    * release resources held by the plugin
    */
  var destroy: js.UndefOr[Boolean] = js.native
  /**
    * check if we should hide the scrollbar when user is hovering over
    */
  var disableFadeOut: js.UndefOr[Boolean] = js.native
  /**
    * distance in pixels between the side edge and the scrollbar
    */
  var distance: js.UndefOr[String] = js.native
  /**
    * height in pixels of the visible scroll area
    */
  var height: js.UndefOr[String] = js.native
  /**
    * sets scrollbar opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * scrollbar position - left/right
    */
  var position: js.UndefOr[String] = js.native
  /**
    * sets border radius of the rail
    */
  var railBorderRadius: js.UndefOr[String] = js.native
  /**
    * default CSS class of the slimscroll rail
    */
  var railClass: js.UndefOr[String] = js.native
  /**
    * sets rail color
    */
  var railColor: js.UndefOr[String] = js.native
  /**
    * whether  we should use jQuery UI Draggable to enable bar dragging
    */
  var railDraggable: js.UndefOr[Boolean] = js.native
  /**
    * sets rail opacity
    */
  var railOpacity: js.UndefOr[Double] = js.native
  /**
    * sets visibility of the rail
    */
  var railVisible: js.UndefOr[Boolean] = js.native
  /**
    * increases/decreases current scroll value by specified amount
    */
  var scrollBy: js.UndefOr[String] = js.native
  /**
    * jumps to the specified scroll value
    */
  var scrollTo: js.UndefOr[String] = js.native
  /**
    * width in pixels of the scrollbar and rail
    */
  var size: js.UndefOr[String] = js.native
  /**
    * default scroll position on load - top / bottom / $('selector')
    */
  var start: js.UndefOr[js.Any] = js.native
  /**
    * scroll amount applied when user is using gestures
    */
  var touchScrollStep: js.UndefOr[Double] = js.native
  /**
    * scroll amount applied to each mouse wheel step
    */
  var wheelStep: js.UndefOr[Double] = js.native
  /**
    * width in pixels of the visible scroll area
    */
  var width: js.UndefOr[String] = js.native
  /**
    * default CSS class of the slimscroll wrapper
    */
  var wrapperClass: js.UndefOr[String] = js.native
}

object IJQuerySlimScrollOptions {
  @scala.inline
  def apply(): IJQuerySlimScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJQuerySlimScrollOptions]
  }
  @scala.inline
  implicit class IJQuerySlimScrollOptionsOps[Self <: IJQuerySlimScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowPageScroll(value: Boolean): Self = this.set("allowPageScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPageScroll: Self = this.set("allowPageScroll", js.undefined)
    @scala.inline
    def setAlwaysVisible(value: Boolean): Self = this.set("alwaysVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysVisible: Self = this.set("alwaysVisible", js.undefined)
    @scala.inline
    def setBarClass(value: String): Self = this.set("barClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarClass: Self = this.set("barClass", js.undefined)
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDestroy(value: Boolean): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDisableFadeOut(value: Boolean): Self = this.set("disableFadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFadeOut: Self = this.set("disableFadeOut", js.undefined)
    @scala.inline
    def setDistance(value: String): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRailBorderRadius(value: String): Self = this.set("railBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailBorderRadius: Self = this.set("railBorderRadius", js.undefined)
    @scala.inline
    def setRailClass(value: String): Self = this.set("railClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailClass: Self = this.set("railClass", js.undefined)
    @scala.inline
    def setRailColor(value: String): Self = this.set("railColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailColor: Self = this.set("railColor", js.undefined)
    @scala.inline
    def setRailDraggable(value: Boolean): Self = this.set("railDraggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailDraggable: Self = this.set("railDraggable", js.undefined)
    @scala.inline
    def setRailOpacity(value: Double): Self = this.set("railOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailOpacity: Self = this.set("railOpacity", js.undefined)
    @scala.inline
    def setRailVisible(value: Boolean): Self = this.set("railVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailVisible: Self = this.set("railVisible", js.undefined)
    @scala.inline
    def setScrollBy(value: String): Self = this.set("scrollBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollBy: Self = this.set("scrollBy", js.undefined)
    @scala.inline
    def setScrollTo(value: String): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTouchScrollStep(value: Double): Self = this.set("touchScrollStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchScrollStep: Self = this.set("touchScrollStep", js.undefined)
    @scala.inline
    def setWheelStep(value: Double): Self = this.set("wheelStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheelStep: Self = this.set("wheelStep", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
  }
  
}

