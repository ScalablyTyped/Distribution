package typings
package jqueryDashMockjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockJaxStatic extends js.Object {
  def apply(options: MockJaxSettings): scala.Double = js.native
  def apply(options: js.Array[MockJaxSettings]): js.Array[scala.Double] = js.native
  def clear(): scala.Unit = js.native
  def clear(id: scala.Double): scala.Unit = js.native
  def clearRetainedAjaxCalls(): scala.Unit = js.native
  def handler(): js.Any = js.native
  def handler(id: scala.Double): js.Any = js.native
  def mockedAjaxCalls(): js.Array[_] = js.native
  def unfiredHandlers(): js.Array[_] = js.native
  def unmockedAjaxCalls(): js.Array[_] = js.native
}

