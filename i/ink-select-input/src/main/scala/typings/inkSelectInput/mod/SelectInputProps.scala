package typings.inkSelectInput.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var indicatorComponent: js.UndefOr[Component[js.Object, js.Object, _]] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var itemComponent: js.UndefOr[Component[js.Object, js.Object, _]] = js.undefined
  var items: js.UndefOr[js.Array[T]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply[/* <: typings.inkSelectInput.mod.ItemOfSelectInput */ T](
    focus: js.UndefOr[Boolean] = js.undefined,
    indicatorComponent: Component[js.Object, js.Object, _] = null,
    initialIndex: js.UndefOr[Double] = js.undefined,
    itemComponent: Component[js.Object, js.Object, _] = null,
    items: js.Array[T] = null,
    limit: js.UndefOr[Double] = js.undefined,
    onSelect: /* item */ T => Unit = null
  ): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[SelectInputProps[T]]
  }
}

