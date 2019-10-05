package typings.linq.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "defer")
@js.native
object defer extends js.Object {
  def apply[T](enumerableFactory: js.Function0[IEnumerable[T]]): IEnumerable[T] = js.native
}

