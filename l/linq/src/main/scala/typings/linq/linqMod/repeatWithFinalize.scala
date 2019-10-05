package typings.linq.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "repeatWithFinalize")
@js.native
object repeatWithFinalize extends js.Object {
  def apply[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, Unit]): IEnumerable[T] = js.native
}

