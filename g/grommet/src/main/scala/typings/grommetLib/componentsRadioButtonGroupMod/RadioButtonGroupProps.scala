package typings
package grommetLib.componentsRadioButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonGroupProps extends js.Object {
  var name: java.lang.String
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var options: js.Array[java.lang.String | grommetLib.Anon_Disabled]
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    options: js.Array[java.lang.String | grommetLib.Anon_Disabled],
    onChange: js.Function1[/* repeated */ js.Any, _] = null,
    value: java.lang.String = null
  ): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
}

