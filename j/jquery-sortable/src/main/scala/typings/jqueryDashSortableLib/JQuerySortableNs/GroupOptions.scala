package typings
package jqueryDashSortableLib.JQuerySortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var afterMove: js.UndefOr[
    js.Function3[
      /* $placeholder */ jqueryDashSortableLib.JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ jqueryDashSortableLib.JQuery, 
      scala.Unit
    ]
  ] = js.undefined
  var containerPath: js.UndefOr[java.lang.String] = js.undefined
  var containerSelector: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var isValidTarget: js.UndefOr[
    js.Function2[/* $item */ jqueryDashSortableLib.JQuery, /* container */ Container, scala.Boolean]
  ] = js.undefined
  var itemPath: js.UndefOr[java.lang.String] = js.undefined
  var itemSelector: js.UndefOr[java.lang.String] = js.undefined
  var onCancel: js.UndefOr[OnCancelHandler] = js.undefined
  var onDrag: js.UndefOr[OnDragEventHandler] = js.undefined
  var onDragStart: js.UndefOr[GenericEventHandler] = js.undefined
  var onDrop: js.UndefOr[GenericEventHandler] = js.undefined
  var onMousedown: js.UndefOr[OnMousedownHandler] = js.undefined
  var placeholder: js.UndefOr[jqueryDashSortableLib.JQuery | js.Array[_] | stdLib.Element | java.lang.String] = js.undefined
  var pullPlaceholder: js.UndefOr[scala.Boolean] = js.undefined
  var serialize: js.UndefOr[SerializeFunc] = js.undefined
  var tolerance: js.UndefOr[scala.Double] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    afterMove: js.Function3[
      /* $placeholder */ jqueryDashSortableLib.JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ jqueryDashSortableLib.JQuery, 
      scala.Unit
    ] = null,
    containerPath: java.lang.String = null,
    containerSelector: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    handle: java.lang.String = null,
    isValidTarget: js.Function2[/* $item */ jqueryDashSortableLib.JQuery, /* container */ Container, scala.Boolean] = null,
    itemPath: java.lang.String = null,
    itemSelector: java.lang.String = null,
    onCancel: OnCancelHandler = null,
    onDrag: OnDragEventHandler = null,
    onDragStart: GenericEventHandler = null,
    onDrop: GenericEventHandler = null,
    onMousedown: OnMousedownHandler = null,
    placeholder: jqueryDashSortableLib.JQuery | js.Array[_] | stdLib.Element | java.lang.String = null,
    pullPlaceholder: js.UndefOr[scala.Boolean] = js.undefined,
    serialize: SerializeFunc = null,
    tolerance: scala.Int | scala.Double = null
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (afterMove != null) __obj.updateDynamic("afterMove")(afterMove)
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (isValidTarget != null) __obj.updateDynamic("isValidTarget")(isValidTarget)
    if (itemPath != null) __obj.updateDynamic("itemPath")(itemPath)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(onMousedown)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(pullPlaceholder)) __obj.updateDynamic("pullPlaceholder")(pullPlaceholder)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

