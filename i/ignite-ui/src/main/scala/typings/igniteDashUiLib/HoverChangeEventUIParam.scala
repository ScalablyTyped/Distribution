package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverChangeEventUIParam extends js.Object {
  /**
  	 * Gets the old value.
  	 */
  var oldValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the new hovered value.
  	 */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object HoverChangeEventUIParam {
  @scala.inline
  def apply(oldValue: scala.Int | scala.Double = null, value: scala.Int | scala.Double = null): HoverChangeEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverChangeEventUIParam]
  }
}

