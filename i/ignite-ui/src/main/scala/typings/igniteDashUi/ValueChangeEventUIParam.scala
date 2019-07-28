package typings.igniteDashUi

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
  def apply(oldValue: Int | Double = null, value: Int | Double = null): ValueChangeEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangeEventUIParam]
  }
}

