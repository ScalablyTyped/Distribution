package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Computed_[T]
  extends ComputedFunctions[T]
     with _ComputedReadFunction[T, js.Any] {
  def apply(): T = js.native
  def apply(value: T): this.type = js.native
}

