package typings.grommet.checkBoxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxGroupProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var labelKey: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ js.UndefOr[OnChangeEvent], Unit]] = js.undefined
  var options: js.Array[CheckBoxType]
  var value: js.UndefOr[js.Array[Double | String]] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
}

object CheckBoxGroupProps {
  @scala.inline
  def apply(
    options: js.Array[CheckBoxType],
    disabled: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    name: String = null,
    onChange: /* event */ js.UndefOr[OnChangeEvent] => Unit = null,
    value: js.Array[Double | String] = null,
    valueKey: String = null
  ): CheckBoxGroupProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxGroupProps]
  }
}

