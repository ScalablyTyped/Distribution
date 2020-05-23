package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueChangeEventUIParam extends js.Object {
  /**
    * Gets the previously selected value.
    */
  var oldValue: js.UndefOr[Double] = js.undefined
  /**
    * Gets the new selected value.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ValueChangeEventUIParam {
  @scala.inline
  def apply(oldValue: js.UndefOr[Double] = js.undefined, value: js.UndefOr[Double] = js.undefined): ValueChangeEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangeEventUIParam]
  }
}

