package typings.htmlDashValidator.htmlDashValidatorMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForExternalUrlAsValidationTarget extends BasicOptions {
  var url: String
}

object OptionsForExternalUrlAsValidationTarget {
  @scala.inline
  def apply(
    url: String,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForExternalUrlAsValidationTarget = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTarget]
  }
}

