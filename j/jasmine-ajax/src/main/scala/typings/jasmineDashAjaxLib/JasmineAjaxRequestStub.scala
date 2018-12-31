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

