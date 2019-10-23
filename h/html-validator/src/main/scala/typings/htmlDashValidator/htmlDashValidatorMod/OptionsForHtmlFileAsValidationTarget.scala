package typings.htmlDashValidator.htmlDashValidatorMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForHtmlFileAsValidationTarget extends BasicOptions {
  var data: String
}

object OptionsForHtmlFileAsValidationTarget {
  @scala.inline
  def apply(
    data: String,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForHtmlFileAsValidationTarget = {
    val __obj = js.Dynamic.literal(data = data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTarget]
  }
}

