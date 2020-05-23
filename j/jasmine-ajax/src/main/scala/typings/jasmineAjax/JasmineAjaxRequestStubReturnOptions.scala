package typings.jasmineAjax

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStubReturnOptions extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[String] = js.undefined
  var responseHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var responseText: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object JasmineAjaxRequestStubReturnOptions {
  @scala.inline
  def apply(
    contentType: String = null,
    response: String = null,
    responseHeaders: StringDictionary[String] = null,
    responseText: String = null,
    status: js.UndefOr[Double] = js.undefined
  ): JasmineAjaxRequestStubReturnOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (responseText != null) __obj.updateDynamic("responseText")(responseText.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineAjaxRequestStubReturnOptions]
  }
}

