package typings.lexicographicDashInteger

import typings.lexicographicDashInteger.lexicographicDashIntegerStrings.array
import typings.lexicographicDashInteger.lexicographicDashIntegerStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lexicographic-integer", JSImport.Namespace)
@js.native
object lexicographicDashIntegerMod extends js.Object {
  def pack[T /* <: hex | array */](n: Double): js.Array[Double] | String = js.native
  def pack[T /* <: hex | array */](n: Double, enc: T): js.Array[Double] | String = js.native
  def unpack(xs: String): Double = js.native
  def unpack(xs: js.Array[Double]): Double = js.native
}

