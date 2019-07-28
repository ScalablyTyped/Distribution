package typings.jasmineDashAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStub extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  def andReturn(options: JasmineAjaxRequestStubReturnOptions): Unit
  def matches(fullUrl: String, data: String, method: String): Boolean
}

object JasmineAjaxRequestStub {
  @scala.inline
  def apply(
    andReturn: JasmineAjaxRequestStubReturnOptions => Unit,
    matches: (String, String, String) => Boolean,
    data: String = null,
    method: String = null
  ): JasmineAjaxRequestStub = {
    val __obj = js.Dynamic.literal(andReturn = js.Any.fromFunction1(andReturn), matches = js.Any.fromFunction3(matches))
    if (data != null) __obj.updateDynamic("data")(data)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[JasmineAjaxRequestStub]
  }
}

