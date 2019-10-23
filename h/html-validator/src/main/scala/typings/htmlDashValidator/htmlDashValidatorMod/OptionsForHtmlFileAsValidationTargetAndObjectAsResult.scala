package typings.htmlDashValidator.htmlDashValidatorMod

import typings.htmlDashValidator.htmlDashValidatorStrings.json
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForHtmlFileAsValidationTargetAndObjectAsResult extends OptionsForHtmlFileAsValidationTarget {
  var format: js.UndefOr[json] = js.undefined
}

object OptionsForHtmlFileAsValidationTargetAndObjectAsResult {
  @scala.inline
  def apply(
    data: String,
    format: json = null,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForHtmlFileAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(data = data)
    if (format != null) __obj.updateDynamic("format")(format)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndObjectAsResult]
  }
}

