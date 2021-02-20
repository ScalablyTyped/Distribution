package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observable {
  
  @JSImport("knockout", "observable")
  @js.native
  def apply[T](): Observable_[js.UndefOr[T]] = js.native
  @JSImport("knockout", "observable")
  @js.native
  def apply[T](value: T): Observable_[T] = js.native
  @JSImport("knockout", "observable")
  @js.native
  def apply[T](value: Null): Observable_[T | Null] = js.native
  
  @JSImport("knockout", "observable.fn")
  @js.native
  val fn: ObservableFunctions[js.Any] = js.native
}
