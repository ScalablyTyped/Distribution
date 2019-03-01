package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatedEventUIParam extends js.Object {
  /**
  	 * Populated with options for the specific field in the collection or null.
  	 */
  var fieldOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the formatted message text, if any.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get all messages, if any. May be more than one if [executeAllRules](ui.igvalidator#options:executeAllRules) is enabled.
  	 */
  var messages: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Deprecated. Populated with the name of the rule that failed validation, if any.
  	 */
  var rule: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Populated with the names of rule that failed validation, if any.
  	 */
  var rules: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Determine the outcome of the validation.
  	 */
  var valid: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the current value in target.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ValidatedEventUIParam {
  @scala.inline
  def apply(
    fieldOptions: js.Any = null,
    message: java.lang.String = null,
    messages: js.Array[_] = null,
    owner: js.Any = null,
    rule: java.lang.String = null,
    rules: js.Array[_] = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any = null
  ): ValidatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fieldOptions != null) __obj.updateDynamic("fieldOptions")(fieldOptions)
    if (message != null) __obj.updateDynamic("message")(message)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ValidatedEventUIParam]
  }
}

