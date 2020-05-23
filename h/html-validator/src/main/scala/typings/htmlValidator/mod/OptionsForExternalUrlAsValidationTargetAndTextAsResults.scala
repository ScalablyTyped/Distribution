package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.gnu
import typings.htmlValidator.htmlValidatorStrings.html
import typings.htmlValidator.htmlValidatorStrings.text
import typings.htmlValidator.htmlValidatorStrings.xhtml
import typings.htmlValidator.htmlValidatorStrings.xml
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsForExternalUrlAsValidationTargetAndTextAsResults extends OptionsForHtmlFileAsValidationTarget {
  var format: html | xhtml | xml | gnu | text
}

object OptionsForExternalUrlAsValidationTargetAndTextAsResults {
  @scala.inline
  def apply(
    data: String,
    format: html | xhtml | xml | gnu | text,
    headers: Record[String, String] = null,
    ignore: String | js.Array[String] = null,
    isFragment: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    validator: js.Object = null
  ): OptionsForExternalUrlAsValidationTargetAndTextAsResults = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(isFragment)) __obj.updateDynamic("isFragment")(isFragment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.get.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsForExternalUrlAsValidationTargetAndTextAsResults]
  }
}

