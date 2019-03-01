package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Sortable //////////////////////////////////////////////////
trait SortableOptions extends SortableEvents {
  var appendTo: js.UndefOr[js.Any] = js.undefined
   // jQuery, Element, Selector or string
  var attribute: js.UndefOr[java.lang.String] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[js.Any] = js.undefined
   // Selector
  var connectWith: js.UndefOr[js.Any] = js.undefined
   // Selector
  var containment: js.UndefOr[js.Any] = js.undefined
   // Element, Selector or string
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var dropOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var forceHelperSize: js.UndefOr[scala.Boolean] = js.undefined
  var forcePlaceholderSize: js.UndefOr[scala.Boolean] = js.undefined
  var grid: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var handle: js.UndefOr[js.Any] = js.undefined
  var helper: js.UndefOr[
    java.lang.String | (js.Function2[/* event */ stdLib.Event, /* element */ Sortable, stdLib.Element])
  ] = js.undefined
   // Selector or Element
  var items: js.UndefOr[js.Any] = js.undefined
   // Selector
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var revert: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  var tolerance: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object SortableOptions {
  @scala.inline
  def apply(
    activate: SortableEvent = null,
    appendTo: js.Any = null,
    attribute: java.lang.String = null,
    axis: java.lang.String = null,
    beforeStop: SortableEvent = null,
    cancel: js.Any = null,
    change: SortableEvent = null,
    connectWith: js.Any = null,
    containment: js.Any = null,
    cursor: java.lang.String = null,
    cursorAt: js.Any = null,
    deactivate: SortableEvent = null,
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    dropOnEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    forceHelperSize: js.UndefOr[scala.Boolean] = js.undefined,
    forcePlaceholderSize: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.Array[scala.Double] = null,
    handle: js.Any = null,
    helper: java.lang.String | (js.Function2[/* event */ stdLib.Event, /* element */ Sortable, stdLib.Element]) = null,
    items: js.Any = null,
    opacity: scala.Int | scala.Double = null,
    out: SortableEvent = null,
    over: SortableEvent = null,
    placeholder: java.lang.String = null,
    receive: SortableEvent = null,
    remove: SortableEvent = null,
    revert: js.Any = null,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollSensitivity: scala.Int | scala.Double = null,
    scrollSpeed: scala.Int | scala.Double = null,
    sort: SortableEvent = null,
    start: SortableEvent = null,
    stop: SortableEvent = null,
    tolerance: java.lang.String = null,
    update: SortableEvent = null,
    zIndex: scala.Int | scala.Double = null
  ): SortableOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(beforeStop)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (connectWith != null) __obj.updateDynamic("connectWith")(connectWith)
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnEmpty)) __obj.updateDynamic("dropOnEmpty")(dropOnEmpty)
    if (!js.isUndefined(forceHelperSize)) __obj.updateDynamic("forceHelperSize")(forceHelperSize)
    if (!js.isUndefined(forcePlaceholderSize)) __obj.updateDynamic("forcePlaceholderSize")(forcePlaceholderSize)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (receive != null) __obj.updateDynamic("receive")(receive)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (revert != null) __obj.updateDynamic("revert")(revert)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    if (update != null) __obj.updateDynamic("update")(update)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableOptions]
  }
}

