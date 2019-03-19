package typings
package inkDashSelectDashInputLib.inkDashSelectDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var indicatorComponent: js.UndefOr[inkLib.inkMod.InkComponent[js.Object]] = js.undefined
  var itemComponent: js.UndefOr[inkLib.inkMod.InkComponent[js.Object]] = js.undefined
  var items: js.UndefOr[js.Array[T]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* item */ T, scala.Unit]] = js.undefined
}

object SelectInputProps {
  @scala.inline
  def apply[T /* <: ItemOfSelectInput */](
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    indicatorComponent: inkLib.inkMod.InkComponent[js.Object] = null,
    itemComponent: inkLib.inkMod.InkComponent[js.Object] = null,
    items: js.Array[T] = null,
    limit: scala.Int | scala.Double = null,
    onSelect: /* item */ T => scala.Unit = null
  ): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[SelectInputProps[T]]
  }
}

