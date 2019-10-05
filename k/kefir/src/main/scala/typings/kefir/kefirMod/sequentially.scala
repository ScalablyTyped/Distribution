package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "sequentially")
@js.native
object sequentially extends js.Object {
  def apply[T](interval: Double, values: js.Array[T]): Stream[T, scala.Nothing] = js.native
}

