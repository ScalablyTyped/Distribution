package typings.jasmineDashAjax

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineAjaxRequestStub extends js.Object {
  var data: String
  var method: String
  var query: String
  var url: RegExp | String
  def andCallFunction(functionToCall: js.Function1[/* request */ JasmineAjaxRequest, Unit]): Unit
  def andError(options: JasmineAjaxRequestStubErrorOptions): Unit
  def andReturn(options: JasmineAjaxRequestStubReturnOptions): Unit
  def andTimeout(): Unit
  def matches(fullUrl: String, data: String, method: String): Boolean
}

object JasmineAjaxRequestStub {
  @scala.inline
  def apply(
    andCallFunction: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Unit,
    andError: JasmineAjaxRequestStubErrorOptions => Unit,
    andReturn: JasmineAjaxRequestStubReturnOptions => Unit,
    andTimeout: () => Unit,
    data: String,
    matches: (String, String, String) => Boolean,
    method: String,
    query: String,
    url: RegExp | String
  ): JasmineAjaxRequestStub = {
    val __obj = js.Dynamic.literal(andCallFunction = js.Any.fromFunction1(andCallFunction), andError = js.Any.fromFunction1(andError), andReturn = js.Any.fromFunction1(andReturn), andTimeout = js.Any.fromFunction0(andTimeout), data = data.asInstanceOf[js.Any], matches = js.Any.fromFunction3(matches), method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JasmineAjaxRequestStub]
  }
}

