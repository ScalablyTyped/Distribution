package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "generate")
@js.native
object generate extends js.Object {
  def apply[T](func: js.Function0[T]): IEnumerable[T] = js.native
  def apply[T](func: js.Function0[T], count: Double): IEnumerable[T] = js.native
}

