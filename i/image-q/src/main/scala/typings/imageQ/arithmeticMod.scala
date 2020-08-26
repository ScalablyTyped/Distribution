package typings.imageQ

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/utils/arithmetic", JSImport.Namespace)
@js.native
object arithmeticMod extends js.Object {
  def degrees2radians(n: Double): Double = js.native
  def inRange0to255(n: Double): Double = js.native
  def inRange0to255Rounded(n: Double): Double = js.native
  def intInRange(value: Double, low: Double, high: Double): Double = js.native
  def max3(a: Double, b: Double, c: Double): Double = js.native
  def min3(a: Double, b: Double, c: Double): Double = js.native
  def stableSort[T](arrayToSort: js.Array[T], callback: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
}

