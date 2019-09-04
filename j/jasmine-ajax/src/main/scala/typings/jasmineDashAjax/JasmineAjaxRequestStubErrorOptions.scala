package typings.jasmineDashAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStubErrorOptions extends js.Object {
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object JasmineAjaxRequestStubErrorOptions {
  @scala.inline
  def apply(status: Int | Double = null, statusText: String = null): JasmineAjaxRequestStubErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[JasmineAjaxRequestStubErrorOptions]
  }
}

