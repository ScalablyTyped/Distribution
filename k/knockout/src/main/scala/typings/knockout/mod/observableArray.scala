package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableArray {
  
  @JSImport("knockout", "observableArray")
  @js.native
  def apply[T](): ObservableArray_[T] = js.native
  @JSImport("knockout", "observableArray")
  @js.native
  def apply[T](initialValue: js.Array[T]): ObservableArray_[T] = js.native
  
  @JSImport("knockout", "observableArray.fn")
  @js.native
  val fn: ObservableArrayFunctions[js.Any] = js.native
}
