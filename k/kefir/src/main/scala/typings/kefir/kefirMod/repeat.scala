package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "repeat")
@js.native
object repeat extends js.Object {
  def apply[T, S](generator: js.Function1[/* i */ Double, (Observable[T, S]) | Boolean]): Observable[T, S] = js.native
}

