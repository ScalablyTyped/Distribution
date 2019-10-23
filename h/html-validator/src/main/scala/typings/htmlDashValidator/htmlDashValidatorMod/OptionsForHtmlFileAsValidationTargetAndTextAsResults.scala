package typings.htmlDashValidator.htmlDashValidatorMod

import typings.htmlDashValidator.htmlDashValidatorStrings.gnu
import typings.htmlDashValidator.htmlDashValidatorStrings.html
import typings.htmlDashValidator.htmlDashValidatorStrings.text
import typings.htmlDashValidator.htmlDashValidatorStrings.xhtml
import typings.htmlDashValidator.htmlDashValidatorStrings.xml
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForHtmlFileAsValidationTargetAndTextAsResults extends OptionsForHtmlFileAsValidationTarget {
  var format: html | xhtml | xml | gnu | text
}

object OptionsForHtmlFileAsValidationTargetAndTextAsResults {
  @scala.inline
  def apply(
    data: String,
    format: html | xhtml | xml | gnu | text,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForHtmlFileAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data, format = format.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment)
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[OptionsForHtmlFileAsValidationTargetAndTextAsResults]
  }
}

