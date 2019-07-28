package typings.kefir

import typings.kefir.kefirMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream[T, scala.Nothing] = js.native
}

