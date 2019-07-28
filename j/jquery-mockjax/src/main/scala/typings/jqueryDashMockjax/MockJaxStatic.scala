package typings.jqueryDashMockjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockJaxStatic extends js.Object {
  def apply(options: js.Array[MockJaxSettings]): js.Array[Double] = js.native
  def apply(options: MockJaxSettings): Double = js.native
  def clear(): Unit = js.native
  def clear(id: Double): Unit = js.native
  def clearRetainedAjaxCalls(): Unit = js.native
  def handler(): js.Any = js.native
  def handler(id: Double): js.Any = js.native
  def mockedAjaxCalls(): js.Array[_] = js.native
  def unfiredHandlers(): js.Array[_] = js.native
  def unmockedAjaxCalls(): js.Array[_] = js.native
}

