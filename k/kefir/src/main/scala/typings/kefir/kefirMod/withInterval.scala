package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "withInterval")
@js.native
object withInterval extends js.Object {
  def apply[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream[T, S] = js.native
}

