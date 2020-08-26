package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "observableArray")
@js.native
object observableArray extends js.Object {
  val fn: ObservableArrayFunctions[js.Any] = js.native
  def apply[T](): ObservableArray_[T] = js.native
  def apply[T](initialValue: js.Array[T]): ObservableArray_[T] = js.native
}

