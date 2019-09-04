package typings.jasmineDashAjax

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxRequestTracker extends js.Object {
  def at(index: Double): JasmineAjaxRequest = js.native
  def count(): Double = js.native
  def filter(urlToMatch: String): js.Array[JasmineAjaxRequest] = js.native
  def filter(urlToMatch: js.Function1[/* request */ JasmineAjaxRequest, Boolean]): js.Array[JasmineAjaxRequest] = js.native
  def filter(urlToMatch: RegExp): js.Array[JasmineAjaxRequest] = js.native
  def first(): JasmineAjaxRequest = js.native
  def mostRecent(): JasmineAjaxRequest = js.native
  def reset(): Unit = js.native
  def track(request: JasmineAjaxRequest): Unit = js.native
}

