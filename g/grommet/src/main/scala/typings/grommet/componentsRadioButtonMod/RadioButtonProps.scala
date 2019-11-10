package typings.grommet.componentsRadioButtonMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var name: String
}

object RadioButtonProps {
  @scala.inline
  def apply(
    name: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: ReactNode = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProps]
  }
}

