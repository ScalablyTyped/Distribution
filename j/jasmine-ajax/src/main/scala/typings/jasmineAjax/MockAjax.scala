package typings.jasmineAjax

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAjax extends js.Object {
  var requests: JasmineAjaxRequestTracker = js.native
  var stubs: JasmineAjaxStubTracker = js.native
  def addCustomParamParser(parser: JasmineAjaxParamParser): Unit = js.native
  def install(): Unit = js.native
  def stubRequest(url: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: String, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: RegExp, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: String, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: RegExp, method: String): JasmineAjaxRequestStub = js.native
  def uninstall(): Unit = js.native
  def withMock(closure: js.Function0[Unit]): Unit = js.native
}

