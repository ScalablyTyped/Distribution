package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "Stream")
@js.native
class Stream[T, S] () extends Observable[T, S]

@JSImport("kefir", "stream")
@js.native
object stream extends js.Object {
  def apply[T, S](subscribe: js.Function1[/* emitter */ Emitter[T, S], js.Function | Unit]): Stream[T, S] = js.native
}

