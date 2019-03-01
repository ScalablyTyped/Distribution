package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignLabelEventUIParam extends js.Object {
  /**
  	 * Used to obtain the maximum value of the bullet graph scale.
  	 */
  var actualMaximumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the minimum value of the bullet graph scale.
  	 */
  var actualMinimumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the height of the label.
  	 */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the string value of the label.
  	 */
  var label: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the X offset of the label on the bullet graph scale.
  	 */
  var offsetX: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the Y offset of the label on the bullet graph scale.
  	 */
  var offsetY: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to gauge widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the value on the the bullet graph scale associated with the label.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain the width of the label.
  	 */
  var width: js.UndefOr[js.Any] = js.undefined
}

object AlignLabelEventUIParam {
  @scala.inline
  def apply(
    actualMaximumValue: js.Any = null,
    actualMinimumValue: js.Any = null,
    height: js.Any = null,
    label: js.Any = null,
    offsetX: js.Any = null,
    offsetY: js.Any = null,
    owner: js.Any = null,
    value: js.Any = null,
    width: js.Any = null
  ): AlignLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (actualMaximumValue != null) __obj.updateDynamic("actualMaximumValue")(actualMaximumValue)
    if (actualMinimumValue != null) __obj.updateDynamic("actualMinimumValue")(actualMinimumValue)
    if (height != null) __obj.updateDynamic("height")(height)
    if (label != null) __obj.updateDynamic("label")(label)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX)
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[AlignLabelEventUIParam]
  }
}

