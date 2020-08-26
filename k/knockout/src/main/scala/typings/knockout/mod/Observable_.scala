package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable_[T]
  extends ObservableFunctions[T]
     with _ComputedReadFunction[T, js.Any] {
  def apply(): T = js.native
  def apply(value: T): js.Any = js.native
}

