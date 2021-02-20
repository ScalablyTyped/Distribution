package typings.jasmineAjax

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxRequestStub extends StObject {
  
  def andCallFunction(functionToCall: js.Function1[/* request */ JasmineAjaxRequest, Unit]): Unit = js.native
  
  def andError(options: JasmineAjaxRequestStubErrorOptions): Unit = js.native
  
  def andReturn(options: JasmineAjaxResponse): Unit = js.native
  
  def andTimeout(): Unit = js.native
  
  var data: String = js.native
  
  def matches(fullUrl: String, data: String, method: String): Boolean = js.native
  
  var method: String = js.native
  
  var query: String = js.native
  
  var url: RegExp | String = js.native
}
object JasmineAjaxRequestStub {
  
  @scala.inline
  def apply(
    andCallFunction: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Unit,
    andError: JasmineAjaxRequestStubErrorOptions => Unit,
    andReturn: JasmineAjaxResponse => Unit,
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
  implicit class JasmineAjaxRequestStubMutableBuilder[Self <: JasmineAjaxRequestStub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndCallFunction(value: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Unit): Self = StObject.set(x, "andCallFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAndError(value: JasmineAjaxRequestStubErrorOptions => Unit): Self = StObject.set(x, "andError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAndReturn(value: JasmineAjaxResponse => Unit): Self = StObject.set(x, "andReturn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAndTimeout(value: () => Unit): Self = StObject.set(x, "andTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: (String, String, String) => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: RegExp | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
