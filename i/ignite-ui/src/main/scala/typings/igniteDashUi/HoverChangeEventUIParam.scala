package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverChangeEventUIParam extends js.Object {
  /**
  	 * Gets the old value.
  	 */
  var oldValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the new hovered value.
  	 */
  var value: js.UndefOr[Double] = js.undefined
}

object HoverChangeEventUIParam {
  @scala.inline
  def apply(oldValue: Int | Double = null, value: Int | Double = null): HoverChangeEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverChangeEventUIParam]
  }
}

