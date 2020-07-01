package typings.grommet.radioButtonGroupMod

import typings.grommet.anon.Disabled
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonGroupProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: String
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
  var options: js.Array[String | Double | Boolean | Disabled]
  var value: js.UndefOr[String | Double | Boolean | js.Object] = js.undefined
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(
    name: String,
    options: js.Array[String | Double | Boolean | Disabled],
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    value: String | Double | Boolean | js.Object = null
  ): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
}

