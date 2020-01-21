package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLabelEventUIParam extends js.Object {
  /**
  	 * Used to obtain the maximum value of the bullet graph scale.
  	 */
  var actualMaximumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the minimum value of the bullet graph scale.
  	 */
  var actualMinimumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the string value of the label.
  	 */
  var label: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to the bullet graph widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the value on the the bullet graph scale associated with the label.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object FormatLabelEventUIParam {
  @scala.inline
  def apply(
    actualMaximumValue: js.Any = null,
    actualMinimumValue: js.Any = null,
    label: js.Any = null,
    owner: js.Any = null,
    value: js.Any = null
  ): FormatLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (actualMaximumValue != null) __obj.updateDynamic("actualMaximumValue")(actualMaximumValue.asInstanceOf[js.Any])
    if (actualMinimumValue != null) __obj.updateDynamic("actualMinimumValue")(actualMinimumValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLabelEventUIParam]
  }
}

