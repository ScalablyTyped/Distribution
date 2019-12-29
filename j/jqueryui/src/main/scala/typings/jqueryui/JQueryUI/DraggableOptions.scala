package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableOptions extends DraggableEvents {
  var addClasses: js.UndefOr[Boolean] = js.undefined
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[DraggableClasses] = js.undefined
  var connectToSortable: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  var containment: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  var handle: js.UndefOr[js.Any] = js.undefined
  var helper: js.UndefOr[js.Any] = js.undefined
  var iframeFix: js.UndefOr[js.Any] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var refreshPositions: js.UndefOr[Boolean] = js.undefined
  var revert: js.UndefOr[js.Any] = js.undefined
  var revertDuration: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  var snap: js.UndefOr[js.Any] = js.undefined
  var snapMode: js.UndefOr[String] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DraggableOptions {
  @scala.inline
  def apply(
    addClasses: js.UndefOr[Boolean] = js.undefined,
    appendTo: js.Any = null,
    axis: String = null,
    cancel: String = null,
    classes: DraggableClasses = null,
    connectToSortable: Element | js.Array[Element] | JQuery | String = null,
    containment: js.Any = null,
    create: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    cursor: String = null,
    cursorAt: js.Any = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    drag: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    grid: js.Array[Double] = null,
    handle: js.Any = null,
    helper: js.Any = null,
    iframeFix: js.Any = null,
    opacity: Int | Double = null,
    refreshPositions: js.UndefOr[Boolean] = js.undefined,
    revert: js.Any = null,
    revertDuration: Int | Double = null,
    scope: String = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    snap: js.Any = null,
    snapMode: String = null,
    snapTolerance: Int | Double = null,
    stack: String = null,
    start: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams) => Unit = null,
    zIndex: Int | Double = null
  ): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addClasses)) __obj.updateDynamic("addClasses")(addClasses.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (connectToSortable != null) __obj.updateDynamic("connectToSortable")(connectToSortable.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2(drag))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (iframeFix != null) __obj.updateDynamic("iframeFix")(iframeFix.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshPositions)) __obj.updateDynamic("refreshPositions")(refreshPositions.asInstanceOf[js.Any])
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    if (revertDuration != null) __obj.updateDynamic("revertDuration")(revertDuration.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapMode != null) __obj.updateDynamic("snapMode")(snapMode.asInstanceOf[js.Any])
    if (snapTolerance != null) __obj.updateDynamic("snapTolerance")(snapTolerance.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
}

