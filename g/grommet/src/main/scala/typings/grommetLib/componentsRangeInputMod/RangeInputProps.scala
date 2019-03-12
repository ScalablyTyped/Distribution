package typings
package grommetLib.componentsRangeInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeInputProps extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var min: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object RangeInputProps {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    max: scala.Double | java.lang.String = null,
    min: scala.Double | java.lang.String = null,
    name: java.lang.String = null,
    onChange: /* repeated */ js.Any => _ = null,
    step: scala.Int | scala.Double = null,
    value: scala.Double | java.lang.String = null
  ): RangeInputProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeInputProps]
  }
}

