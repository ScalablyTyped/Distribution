package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOptions extends DraggableEvents {
  var addClasses: js.UndefOr[scala.Boolean] = js.undefined
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var connectToSortable: js.UndefOr[
    stdLib.Element | js.Array[stdLib.Element] | jqueryuiLib.JQuery | java.lang.String
  ] = js.undefined
  var containment: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var grid: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var handle: js.UndefOr[js.Any] = js.undefined
  var helper: js.UndefOr[js.Any] = js.undefined
  var iframeFix: js.UndefOr[js.Any] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var refreshPositions: js.UndefOr[scala.Boolean] = js.undefined
  var revert: js.UndefOr[js.Any] = js.undefined
  var revertDuration: js.UndefOr[scala.Double] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  var snap: js.UndefOr[js.Any] = js.undefined
  var snapMode: js.UndefOr[java.lang.String] = js.undefined
  var snapTolerance: js.UndefOr[scala.Double] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object DraggableOptions {
  @scala.inline
  def apply(
    addClasses: js.UndefOr[scala.Boolean] = js.undefined,
    appendTo: js.Any = null,
    axis: java.lang.String = null,
    cancel: java.lang.String = null,
    connectToSortable: stdLib.Element | js.Array[stdLib.Element] | jqueryuiLib.JQuery | java.lang.String = null,
    containment: js.Any = null,
    create: DraggableEvent = null,
    cursor: java.lang.String = null,
    cursorAt: js.Any = null,
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    drag: DraggableEvent = null,
    grid: js.Array[scala.Double] = null,
    handle: js.Any = null,
    helper: js.Any = null,
    iframeFix: js.Any = null,
    opacity: scala.Int | scala.Double = null,
    refreshPositions: js.UndefOr[scala.Boolean] = js.undefined,
    revert: js.Any = null,
    revertDuration: scala.Int | scala.Double = null,
    scope: java.lang.String = null,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollSensitivity: scala.Int | scala.Double = null,
    scrollSpeed: scala.Int | scala.Double = null,
    snap: js.Any = null,
    snapMode: java.lang.String = null,
    snapTolerance: scala.Int | scala.Double = null,
    stack: java.lang.String = null,
    start: DraggableEvent = null,
    stop: DraggableEvent = null,
    zIndex: scala.Int | scala.Double = null
  ): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addClasses)) __obj.updateDynamic("addClasses")(addClasses)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (connectToSortable != null) __obj.updateDynamic("connectToSortable")(connectToSortable.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (helper != null) __obj.updateDynamic("helper")(helper)
    if (iframeFix != null) __obj.updateDynamic("iframeFix")(iframeFix)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshPositions)) __obj.updateDynamic("refreshPositions")(refreshPositions)
    if (revert != null) __obj.updateDynamic("revert")(revert)
    if (revertDuration != null) __obj.updateDynamic("revertDuration")(revertDuration.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap)
    if (snapMode != null) __obj.updateDynamic("snapMode")(snapMode)
    if (snapTolerance != null) __obj.updateDynamic("snapTolerance")(snapTolerance.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
}

