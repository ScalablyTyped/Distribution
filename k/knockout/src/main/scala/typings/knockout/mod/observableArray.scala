package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableArray {
  
  inline def apply[T](): ObservableArray_[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ObservableArray_[T]]
  inline def apply[T](initialValue: js.Array[T]): ObservableArray_[T] = ^.asInstanceOf[js.Dynamic].apply(initialValue.asInstanceOf[js.Any]).asInstanceOf[ObservableArray_[T]]
  
  @JSImport("knockout", "observableArray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "observableArray.fn")
  @js.native
  val fn: ObservableArrayFunctions[Any] = js.native
}
