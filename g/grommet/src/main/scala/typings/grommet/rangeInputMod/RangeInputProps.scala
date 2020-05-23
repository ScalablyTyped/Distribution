package typings.grommet.rangeInputMod

import typings.react.mod.ChangeEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeInputProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[Element], Unit]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double | String] = js.undefined
}

object RangeInputProps {
  @scala.inline
  def apply(
    id: String = null,
    max: Double | String = null,
    min: Double | String = null,
    name: String = null,
    onChange: /* event */ ChangeEvent[Element] => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    value: Double | String = null
  ): RangeInputProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeInputProps]
  }
}

