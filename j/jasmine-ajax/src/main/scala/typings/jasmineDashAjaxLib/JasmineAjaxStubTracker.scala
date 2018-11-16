package typings
package jasmineDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxStubTracker extends js.Object {
  def addStub(stub: JasmineAjaxRequestStub): scala.Unit = js.native
  def findStub(url: java.lang.String): JasmineAjaxRequestStub = js.native
  def findStub(url: java.lang.String, data: java.lang.String): JasmineAjaxRequestStub = js.native
  def findStub(url: java.lang.String, data: java.lang.String, method: java.lang.String): JasmineAjaxRequestStub = js.native
  def reset(): scala.Unit = js.native
}

