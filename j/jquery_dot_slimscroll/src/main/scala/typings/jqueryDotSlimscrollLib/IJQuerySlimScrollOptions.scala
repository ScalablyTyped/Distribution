package typings
package jqueryDotSlimscrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJQuerySlimScrollOptions extends js.Object {
  /**
    * check if mousewheel should scroll the window if we reach top/bottom
    */
  var allowPageScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * enables always-on mode for the scrollbar
    */
  var alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default CSS class of the slimscroll bar
    */
  var barClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * sets border radius
    */
  var borderRadius: js.UndefOr[java.lang.String] = js.undefined
  /**
    * scrollbar color, accepts any hex/color value
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * release resources held by the plugin
    */
  var destroy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * check if we should hide the scrollbar when user is hovering over
    */
  var disableFadeOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * distance in pixels between the side edge and the scrollbar
    */
  var distance: js.UndefOr[java.lang.String] = js.undefined
  /**
    * height in pixels of the visible scroll area
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * sets scrollbar opacity
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * scrollbar position - left/right
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * sets border radius of the rail
    */
  var railBorderRadius: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default CSS class of the slimscroll rail
    */
  var railClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * sets rail color
    */
  var railColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * whether  we should use jQuery UI Draggable to enable bar dragging
    */
  var railDraggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * sets rail opacity
    */
  var railOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * sets visibility of the rail
    */
  var railVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * increases/decreases current scroll value by specified amount
    */
  var scrollBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * jumps to the specified scroll value
    */
  var scrollTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * width in pixels of the scrollbar and rail
    */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default scroll position on load - top / bottom / $('selector')
    */
  var start: js.UndefOr[js.Any] = js.undefined
  /**
    * scroll amount applied when user is using gestures
    */
  var touchScrollStep: js.UndefOr[scala.Double] = js.undefined
  /**
    * scroll amount applied to each mouse wheel step
    */
  var wheelStep: js.UndefOr[scala.Double] = js.undefined
  /**
    * width in pixels of the visible scroll area
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default CSS class of the slimscroll wrapper
    */
  var wrapperClass: js.UndefOr[java.lang.String] = js.undefined
}

object IJQuerySlimScrollOptions {
  @scala.inline
  def apply(
    allowPageScroll: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysVisible: js.UndefOr[scala.Boolean] = js.undefined,
    barClass: java.lang.String = null,
    borderRadius: java.lang.String = null,
    color: java.lang.String = null,
    destroy: js.UndefOr[scala.Boolean] = js.undefined,
    disableFadeOut: js.UndefOr[scala.Boolean] = js.undefined,
    distance: java.lang.String = null,
    height: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    railBorderRadius: java.lang.String = null,
    railClass: java.lang.String = null,
    railColor: java.lang.String = null,
    railDraggable: js.UndefOr[scala.Boolean] = js.undefined,
    railOpacity: scala.Int | scala.Double = null,
    railVisible: js.UndefOr[scala.Boolean] = js.undefined,
    scrollBy: java.lang.String = null,
    scrollTo: java.lang.String = null,
    size: java.lang.String = null,
    start: js.Any = null,
    touchScrollStep: scala.Int | scala.Double = null,
    wheelStep: scala.Int | scala.Double = null,
    width: java.lang.String = null,
    wrapperClass: java.lang.String = null
  ): IJQuerySlimScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPageScroll)) __obj.updateDynamic("allowPageScroll")(allowPageScroll)
    if (!js.isUndefined(alwaysVisible)) __obj.updateDynamic("alwaysVisible")(alwaysVisible)
    if (barClass != null) __obj.updateDynamic("barClass")(barClass)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(destroy)) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(disableFadeOut)) __obj.updateDynamic("disableFadeOut")(disableFadeOut)
    if (distance != null) __obj.updateDynamic("distance")(distance)
    if (height != null) __obj.updateDynamic("height")(height)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (railBorderRadius != null) __obj.updateDynamic("railBorderRadius")(railBorderRadius)
    if (railClass != null) __obj.updateDynamic("railClass")(railClass)
    if (railColor != null) __obj.updateDynamic("railColor")(railColor)
    if (!js.isUndefined(railDraggable)) __obj.updateDynamic("railDraggable")(railDraggable)
    if (railOpacity != null) __obj.updateDynamic("railOpacity")(railOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(railVisible)) __obj.updateDynamic("railVisible")(railVisible)
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(scrollBy)
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo)
    if (size != null) __obj.updateDynamic("size")(size)
    if (start != null) __obj.updateDynamic("start")(start)
    if (touchScrollStep != null) __obj.updateDynamic("touchScrollStep")(touchScrollStep.asInstanceOf[js.Any])
    if (wheelStep != null) __obj.updateDynamic("wheelStep")(wheelStep.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass)
    __obj.asInstanceOf[IJQuerySlimScrollOptions]
  }
}

