package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observable {
  
  inline def apply[T](): Observable_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Observable_[js.UndefOr[T]]]
  inline def apply[T](value: T): Observable_[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def apply[T](value: Null): Observable_[T | Null] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | Null]]
  
  @JSImport("knockout", "observable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "observable.fn")
  @js.native
  val fn: ObservableFunctions[Any] = js.native
}
