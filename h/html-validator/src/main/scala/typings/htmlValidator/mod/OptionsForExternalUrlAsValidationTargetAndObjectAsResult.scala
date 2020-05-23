package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.json
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForExternalUrlAsValidationTargetAndObjectAsResult extends OptionsForExternalUrlAsValidationTarget {
  var format: js.UndefOr[json] = js.undefined
}

object OptionsForExternalUrlAsValidationTargetAndObjectAsResult {
  @scala.inline
  def apply(
    url: String,
    format: json = null,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForExternalUrlAsValidationTargetAndObjectAsResult = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.get.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndObjectAsResult]
  }
}

