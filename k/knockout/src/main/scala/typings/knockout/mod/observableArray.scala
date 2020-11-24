package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "observableArray")
@js.native
object observableArray extends js.Object {
  
  def apply[T](): ObservableArray_[T] = js.native
  def apply[T](initialValue: js.Array[T]): ObservableArray_[T] = js.native
  
  val fn: ObservableArrayFunctions[js.Any] = js.native
}
