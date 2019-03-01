package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessEventUIParam extends js.Object {
  /**
  	 * Populated with options for the specific field in the collection or null.
  	 */
  var fieldOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the formatted message text, if any.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Determine the outcome of the validation.
  	 */
  var valid: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the current value in target.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object SuccessEventUIParam {
  @scala.inline
  def apply(
    fieldOptions: js.Any = null,
    message: java.lang.String = null,
    owner: js.Any = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any = null
  ): SuccessEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fieldOptions != null) __obj.updateDynamic("fieldOptions")(fieldOptions)
    if (message != null) __obj.updateDynamic("message")(message)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SuccessEventUIParam]
  }
}

