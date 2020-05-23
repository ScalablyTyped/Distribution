package typings.jquerySortable.JQuerySortable

import typings.jquerySortable.JQuery
import typings.std.Element
import typings.std.Event
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
    delay: js.UndefOr[Double] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    drag: js.UndefOr[Boolean] = js.undefined,
    drop: js.UndefOr[Boolean] = js.undefined,
    exclude: String = null,
    group: String = null,
    handle: String = null,
    isValidTarget: (/* $item */ JQuery, /* container */ Container) => Boolean = null,
    itemPath: String = null,
    itemSelector: String = null,
    nested: js.UndefOr[Boolean] = js.undefined,
    onCancel: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onDrag: (/* $item */ js.UndefOr[JQuery], /* position */ js.UndefOr[Position], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onDragStart: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onDrop: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onMousedown: (/* $item */ js.UndefOr[JQuery], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    placeholder: JQuery | js.Array[_] | Element | String = null,
    pullPlaceholder: js.UndefOr[Boolean] = js.undefined,
    serialize: (/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean) => Unit = null,
    tolerance: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterMove != null) __obj.updateDynamic("afterMove")(js.Any.fromFunction3(afterMove))
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath.asInstanceOf[js.Any])
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (isValidTarget != null) __obj.updateDynamic("isValidTarget")(js.Any.fromFunction2(isValidTarget))
    if (itemPath != null) __obj.updateDynamic("itemPath")(itemPath.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(nested)) __obj.updateDynamic("nested")(nested.get.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction4(onCancel))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction4(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction4(onDrop))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction3(onMousedown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(pullPlaceholder)) __obj.updateDynamic("pullPlaceholder")(pullPlaceholder.get.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction3(serialize))
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

