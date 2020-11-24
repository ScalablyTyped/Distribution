package typings.jasmineAjax

import org.scalablytyped.runtime.StringDictionary
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxRequest extends XMLHttpRequest {
  
  def data(): String | js.Object = js.native
  
  var method: String = js.native
  
  var overriddenMimeType: String = js.native
  
  var params: js.Any = js.native
  
  var password: String = js.native
  
  var requestHeaders: StringDictionary[String] = js.native
  
  def respondWith(response: JasmineAjaxResponse): Unit = js.native
  
  def responseError(): Unit = js.native
  def responseError(options: JasmineAjaxRequestStubErrorOptions): Unit = js.native
  
  def responseTimeout(): Unit = js.native
  
  var url: String = js.native
  
  var username: String = js.native
}
