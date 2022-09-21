package typings.jqueryMockjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockJaxStatic extends StObject {
  
  def apply(options: js.Array[MockJaxSettings]): js.Array[Double] = js.native
  def apply(options: MockJaxSettings): Double = js.native
  
  def clear(): Unit = js.native
  def clear(id: Double): Unit = js.native
  
  def clearRetainedAjaxCalls(): Unit = js.native
  
  def handler(): Any = js.native
  def handler(id: Double): Any = js.native
  
  def mockedAjaxCalls(): js.Array[Any] = js.native
  
  def unfiredHandlers(): js.Array[Any] = js.native
  
  def unmockedAjaxCalls(): js.Array[Any] = js.native
}
