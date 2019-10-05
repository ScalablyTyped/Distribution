package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "later")
@js.native
object later extends js.Object {
  def apply[T](wait: Double, value: T): Stream[T, scala.Nothing] = js.native
}

