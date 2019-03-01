package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValidatedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the event target form.
  	 */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determine the outcome of the validation.
  	 */
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object FormValidatedEventUIParam {
  @scala.inline
  def apply(
    owner: js.Any = null,
    target: java.lang.String = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): FormValidatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[FormValidatedEventUIParam]
  }
}

