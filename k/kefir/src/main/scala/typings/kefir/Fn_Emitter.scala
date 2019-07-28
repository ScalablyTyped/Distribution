package typings.kefir

import typings.kefir.kefirMod.Emitter
import typings.kefir.kefirMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Emitter extends js.Object {
  def apply[T, S](interval: Double, handler: js.Function1[/* emitter */ Emitter[T, S], Unit]): Stream[T, S] = js.native
}

