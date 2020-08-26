package typings.jasmineAjax

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxRequestStub extends js.Object {
  var data: String = js.native
  var method: String = js.native
  var query: String = js.native
  var url: RegExp | String = js.native
  def andCallFunction(functionToCall: js.Function1[/* request */ JasmineAjaxRequest, Unit]): Unit = js.native
  def andError(options: JasmineAjaxRequestStubErrorOptions): Unit = js.native
  def andReturn(options: JasmineAjaxRequestStubReturnOptions): Unit = js.native
  def andTimeout(): Unit = js.native
  def matches(fullUrl: String, data: String, method: String): Boolean = js.native
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
  @scala.inline
  implicit class JasmineAjaxRequestStubOps[Self <: JasmineAjaxRequestStub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndCallFunction(value: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Unit): Self = this.set("andCallFunction", js.Any.fromFunction1(value))
    @scala.inline
    def setAndError(value: JasmineAjaxRequestStubErrorOptions => Unit): Self = this.set("andError", js.Any.fromFunction1(value))
    @scala.inline
    def setAndReturn(value: JasmineAjaxRequestStubReturnOptions => Unit): Self = this.set("andReturn", js.Any.fromFunction1(value))
    @scala.inline
    def setAndTimeout(value: () => Unit): Self = this.set("andTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatches(value: (String, String, String) => Boolean): Self = this.set("matches", js.Any.fromFunction3(value))
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: RegExp | String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

