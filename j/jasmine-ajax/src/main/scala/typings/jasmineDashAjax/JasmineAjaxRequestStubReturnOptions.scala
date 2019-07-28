package typings.jasmineDashAjax

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
    status: Int | Double = null
  ): JasmineAjaxRequestStubReturnOptions = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineAjaxRequestStubReturnOptions]
  }
}

