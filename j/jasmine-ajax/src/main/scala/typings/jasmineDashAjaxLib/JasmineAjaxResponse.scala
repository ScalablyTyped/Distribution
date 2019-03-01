package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxResponse extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var response: js.UndefOr[java.lang.String] = js.undefined
  var responseHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var responseText: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object JasmineAjaxResponse {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    response: java.lang.String = null,
    responseHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    responseText: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): JasmineAjaxResponse = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (responseText != null) __obj.updateDynamic("responseText")(responseText)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[JasmineAjaxResponse]
  }
}

