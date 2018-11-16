package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MockAjax")
@js.native
class MockAjax protected () extends js.Object {
  def this(globals: js.Any) = this()
  var requests: JasmineAjaxRequestTracker = js.native
  var stubs: JasmineAjaxStubTracker = js.native
  def addCustomParamParser(parser: JasmineAjaxParamParser): scala.Unit = js.native
  def install(): scala.Unit = js.native
  def stubRequest(url: java.lang.String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: java.lang.String, data: java.lang.String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: java.lang.String, data: java.lang.String, method: java.lang.String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: java.lang.String, data: stdLib.RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: java.lang.String, data: stdLib.RegExp, method: java.lang.String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: stdLib.RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: stdLib.RegExp, data: java.lang.String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: stdLib.RegExp, data: java.lang.String, method: java.lang.String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: stdLib.RegExp, data: stdLib.RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: stdLib.RegExp, data: stdLib.RegExp, method: java.lang.String): JasmineAjaxRequestStub = js.native
  def uninstall(): scala.Unit = js.native
  def withMock(closure: js.Function0[scala.Unit]): scala.Unit = js.native
}

