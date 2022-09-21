package typings.jasmineAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxRequestTracker extends StObject {
  
  def at(index: Double): JasmineAjaxRequest = js.native
  
  def count(): Double = js.native
  
  def filter(urlToMatch: String): js.Array[JasmineAjaxRequest] = js.native
  def filter(urlToMatch: js.Function1[/* request */ JasmineAjaxRequest, Boolean]): js.Array[JasmineAjaxRequest] = js.native
  def filter(urlToMatch: js.RegExp): js.Array[JasmineAjaxRequest] = js.native
  
  def first(): JasmineAjaxRequest = js.native
  
  def mostRecent(): JasmineAjaxRequest = js.native
  
  def reset(): Unit = js.native
  
  def track(request: JasmineAjaxRequest): Unit = js.native
}
