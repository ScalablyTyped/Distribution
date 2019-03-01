package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorOptions extends js.Object {
  var errorTemplate: js.UndefOr[java.lang.String] = js.undefined
  var messages: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[js.Function1[/* e */ ValidatorValidateEvent, scala.Unit]] = js.undefined
  var validateInput: js.UndefOr[js.Function1[/* e */ ValidatorValidateInputEvent, scala.Unit]] = js.undefined
  var validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    errorTemplate: java.lang.String = null,
    messages: js.Any = null,
    name: java.lang.String = null,
    rules: js.Any = null,
    validate: js.Function1[/* e */ ValidatorValidateEvent, scala.Unit] = null,
    validateInput: js.Function1[/* e */ ValidatorValidateInputEvent, scala.Unit] = null,
    validateOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (errorTemplate != null) __obj.updateDynamic("errorTemplate")(errorTemplate)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (validateInput != null) __obj.updateDynamic("validateInput")(validateInput)
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

