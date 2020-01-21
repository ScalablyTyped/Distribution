package typings.jasmineAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxStubTracker extends js.Object {
  def addStub(stub: JasmineAjaxRequestStub): Unit = js.native
  def findStub(url: String): JasmineAjaxRequestStub = js.native
  def findStub(url: String, data: String): JasmineAjaxRequestStub = js.native
  def findStub(url: String, data: String, method: String): JasmineAjaxRequestStub = js.native
  def reset(): Unit = js.native
}

