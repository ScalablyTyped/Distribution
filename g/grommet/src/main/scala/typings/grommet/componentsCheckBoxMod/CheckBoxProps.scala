package typings.grommet.componentsCheckBoxMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
}

object CheckBoxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    name: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    toggle: js.UndefOr[Boolean] = js.undefined
  ): CheckBoxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[CheckBoxProps]
  }
}

