package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxRequestTracker extends js.Object {
  def at(index: scala.Double): JasmineAjaxRequest = js.native
  def count(): scala.Double = js.native
  def filter(urlToMatch: java.lang.String): js.Array[JasmineAjaxRequest] = js.native
  def filter(urlToMatch: js.Function): js.Array[JasmineAjaxRequest] = js.native
  def filter(urlToMatch: stdLib.RegExp): js.Array[JasmineAjaxRequest] = js.native
  def first(): JasmineAjaxRequest = js.native
  def mostRecent(): JasmineAjaxRequest = js.native
  def reset(): scala.Unit = js.native
  def track(request: JasmineAjaxRequest): scala.Unit = js.native
}

