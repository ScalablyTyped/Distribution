package typings.jasmineAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxStubTracker extends StObject {
  
  def addStub(stub: JasmineAjaxRequestStub): Unit = js.native
  
  def findStub(url: String): JasmineAjaxRequestStub = js.native
  def findStub(url: String, data: js.UndefOr[scala.Nothing], method: String): JasmineAjaxRequestStub = js.native
  def findStub(url: String, data: String): JasmineAjaxRequestStub = js.native
  def findStub(url: String, data: String, method: String): JasmineAjaxRequestStub = js.native
  
  def reset(): Unit = js.native
}
