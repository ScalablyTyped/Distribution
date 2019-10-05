package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "fromCallback")
@js.native
object fromCallback extends js.Object {
  def apply[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream[T, scala.Nothing] = js.native
}

