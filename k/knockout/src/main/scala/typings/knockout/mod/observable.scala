package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "observable")
@js.native
object observable extends js.Object {
  val fn: ObservableFunctions[js.Any] = js.native
  def apply[T](): Observable_[js.UndefOr[T]] = js.native
  def apply[T](value: T): Observable_[T] = js.native
  def apply[T](value: Null): Observable_[T | Null] = js.native
}

