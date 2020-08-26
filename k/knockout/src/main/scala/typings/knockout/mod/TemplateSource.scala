package typings.knockout.mod

import typings.knockout.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSource extends js.Object {
  var nodes: js.UndefOr[FnCall] = js.native
  def data(key: String): js.Any = js.native
  def data[T](key: String, valueToWrite: T): Unit = js.native
  @JSName("data")
  def data_T_T[T](key: String): T = js.native
  def text(): String = js.native
  def text(valueToWrite: String): Unit = js.native
}

