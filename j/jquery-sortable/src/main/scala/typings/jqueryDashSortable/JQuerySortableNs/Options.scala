package typings.jqueryDashSortable.JQuerySortableNs

import typings.jqueryDashSortable.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends GroupOptions
     with ContainerOptions {
  var group: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterMove: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Unit = null,
    containerPath: String = null,
    containerSelector: String = null,
    delay: Int | Double = null,
    distance: Int | Double = null,
    drag: js.UndefOr[Boolean] = js.undefined,
    drop: js.UndefOr[Boolean] = js.undefined,
    exclude: String = null,
    group: String = null,
    handle: String = null,
    isValidTarget: (/* $item */ JQuery, /* container */ Container) => Boolean = null,
    itemPath: String = null,
    itemSelector: String = null,
    nested: js.UndefOr[Boolean] = js.undefined,
    onCancel: OnCancelHandler = null,
    onDrag: OnDragEventHandler = null,
    onDragStart: GenericEventHandler = null,
    onDrop: GenericEventHandler = null,
    onMousedown: OnMousedownHandler = null,
    placeholder: JQuery | js.Array[_] | Element | String = null,
    pullPlaceholder: js.UndefOr[Boolean] = js.undefined,
    serialize: SerializeFunc = null,
    tolerance: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterMove != null) __obj.updateDynamic("afterMove")(js.Any.fromFunction3(afterMove))
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (group != null) __obj.updateDynamic("group")(group)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (isValidTarget != null) __obj.updateDynamic("isValidTarget")(js.Any.fromFunction2(isValidTarget))
    if (itemPath != null) __obj.updateDynamic("itemPath")(itemPath)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(onMousedown)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(pullPlaceholder)) __obj.updateDynamic("pullPlaceholder")(pullPlaceholder)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[Options]
  }
}

