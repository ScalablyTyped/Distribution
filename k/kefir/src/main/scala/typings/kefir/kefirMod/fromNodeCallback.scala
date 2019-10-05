package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "fromNodeCallback")
@js.native
object fromNodeCallback extends js.Object {
  def apply[T, S](fn: js.Function1[/* callback */ js.Function2[/* error */ S | Null, /* result */ T, Unit], Unit]): Stream[T, S] = js.native
}

