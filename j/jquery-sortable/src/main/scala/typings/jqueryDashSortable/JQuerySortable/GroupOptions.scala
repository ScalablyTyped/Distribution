package typings.jqueryDashSortable.JQuerySortable

import typings.jqueryDashSortable.JQuery
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOptions extends js.Object {
  var afterMove: js.UndefOr[
    js.Function3[
      /* $placeholder */ JQuery, 
      /* container */ Container, 
      /* $closestItemOrContainer */ JQuery, 
      Unit
    ]
  ] = js.undefined
  var containerPath: js.UndefOr[String] = js.undefined
  var containerSelector: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var isValidTarget: js.UndefOr[js.Function2[/* $item */ JQuery, /* container */ Container, Boolean]] = js.undefined
  var itemPath: js.UndefOr[String] = js.undefined
  var itemSelector: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[OnCancelHandler] = js.undefined
  var onDrag: js.UndefOr[OnDragEventHandler] = js.undefined
  var onDragStart: js.UndefOr[GenericEventHandler] = js.undefined
  var onDrop: js.UndefOr[GenericEventHandler] = js.undefined
  var onMousedown: js.UndefOr[OnMousedownHandler] = js.undefined
  var placeholder: js.UndefOr[JQuery | js.Array[_] | Element | String] = js.undefined
  var pullPlaceholder: js.UndefOr[Boolean] = js.undefined
  var serialize: js.UndefOr[SerializeFunc] = js.undefined
  var tolerance: js.UndefOr[Double] = js.undefined
}

object GroupOptions {
  @scala.inline
  def apply(
    afterMove: (/* $placeholder */ JQuery, /* container */ Container, /* $closestItemOrContainer */ JQuery) => Unit = null,
    containerPath: String = null,
    containerSelector: String = null,
    delay: Int | Double = null,
    distance: Int | Double = null,
    handle: String = null,
    isValidTarget: (/* $item */ JQuery, /* container */ Container) => Boolean = null,
    itemPath: String = null,
    itemSelector: String = null,
    onCancel: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onDrag: (/* $item */ js.UndefOr[JQuery], /* position */ js.UndefOr[Position], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onDragStart: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onDrop: (/* $item */ js.UndefOr[JQuery], /* container */ js.UndefOr[Container], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    onMousedown: (/* $item */ js.UndefOr[JQuery], /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
    ], /* event */ js.UndefOr[Event]) => Unit = null,
    placeholder: JQuery | js.Array[_] | Element | String = null,
    pullPlaceholder: js.UndefOr[Boolean] = js.undefined,
    serialize: (/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean) => Unit = null,
    tolerance: Int | Double = null
  ): GroupOptions = {
    val __obj = js.Dynamic.literal()
    if (afterMove != null) __obj.updateDynamic("afterMove")(js.Any.fromFunction3(afterMove))
    if (containerPath != null) __obj.updateDynamic("containerPath")(containerPath)
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (isValidTarget != null) __obj.updateDynamic("isValidTarget")(js.Any.fromFunction2(isValidTarget))
    if (itemPath != null) __obj.updateDynamic("itemPath")(itemPath)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction4(onCancel))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction4(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction4(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction4(onDrop))
    if (onMousedown != null) __obj.updateDynamic("onMousedown")(js.Any.fromFunction3(onMousedown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(pullPlaceholder)) __obj.updateDynamic("pullPlaceholder")(pullPlaceholder)
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction3(serialize))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
}

