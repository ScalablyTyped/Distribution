package typings.jasmineAjax

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockAjax extends StObject {
  
  def addCustomParamParser(parser: JasmineAjaxParamParser): Unit = js.native
  
  def install(): Unit = js.native
  
  var requests: JasmineAjaxRequestTracker = js.native
  
  def stubRequest(url: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: String, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: Unit, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: String, data: RegExp, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: String, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: Unit, method: String): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: RegExp): JasmineAjaxRequestStub = js.native
  def stubRequest(url: RegExp, data: RegExp, method: String): JasmineAjaxRequestStub = js.native
  
  var stubs: JasmineAjaxStubTracker = js.native
  
  def uninstall(): Unit = js.native
  
  def withMock(closure: js.Function0[Unit]): Unit = js.native
}
