package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxRequest
  extends stdLib.XMLHttpRequest {
  var method: java.lang.String = js.native
  var overriddenMimeType: java.lang.String = js.native
  var params: js.Any = js.native
  var password: java.lang.String = js.native
  var requestHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var url: java.lang.String = js.native
  var username: java.lang.String = js.native
  def data(): java.lang.String | js.Object = js.native
  def respondWith(response: JasmineAjaxResponse): scala.Unit = js.native
  def responseError(): scala.Unit = js.native
  def responseTimeout(): scala.Unit = js.native
}

