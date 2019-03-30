package typings
package inkDashSelectDashInputLib.inkDashSelectDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var indicatorComponent: js.UndefOr[reactLib.reactMod.Component[js.Object, js.Object, _]] = js.undefined
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  var itemComponent: js.UndefOr[reactLib.reactMod.Component[js.Object, js.Object, _]] = js.undefined
  var items: js.UndefOr[js.Array[T]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* item */ T, scala.Unit]] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply[T /* <: ItemOfSelectInput */](
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    indicatorComponent: reactLib.reactMod.Component[js.Object, js.Object, _] = null,
    initialIndex: scala.Int | scala.Double = null,
    itemComponent: reactLib.reactMod.Component[js.Object, js.Object, _] = null,
    items: js.Array[T] = null,
    limit: scala.Int | scala.Double = null,
    onSelect: /* item */ T => scala.Unit = null
  ): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent)
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent)
    if (items != null) __obj.updateDynamic("items")(items)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[SelectInputProps[T]]
  }
}

