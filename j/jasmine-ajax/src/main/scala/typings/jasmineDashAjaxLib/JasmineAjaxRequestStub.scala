package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStub extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  def andReturn(options: JasmineAjaxRequestStubReturnOptions): scala.Unit
  def matches(fullUrl: java.lang.String, data: java.lang.String, method: java.lang.String): scala.Boolean
}

object JasmineAjaxRequestStub {
  @scala.inline
  def apply(
    andReturn: js.Function1[JasmineAjaxRequestStubReturnOptions, scala.Unit],
    matches: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Boolean],
    data: java.lang.String = null,
    method: java.lang.String = null
  ): JasmineAjaxRequestStub = {
    val __obj = js.Dynamic.literal(andReturn = andReturn, matches = matches)
    if (data != null) __obj.updateDynamic("data")(data)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[JasmineAjaxRequestStub]
  }
}

