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

