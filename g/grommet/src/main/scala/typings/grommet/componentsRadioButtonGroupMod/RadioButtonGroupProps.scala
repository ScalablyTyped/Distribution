package typings.grommet.componentsRadioButtonGroupMod

import typings.grommet.Anon_Disabled
import typings.react.reactMod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonGroupProps extends js.Object {
  var name: String
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
  var options: js.Array[String | Anon_Disabled]
  var value: js.UndefOr[String] = js.undefined
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(
    name: String,
    options: js.Array[String | Anon_Disabled],
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    value: String = null
  ): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal(name = name, options = options)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
}

