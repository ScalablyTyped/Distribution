package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.round")
@js.native
object round extends js.Object {
  /**
    * Numeric rounding
    *
    * Example: round to 3 decimal places
    * ```
    * makerjs.round(3.14159, .001); //returns 3.142
    * ```
    *
    * @param n The number to round off.
    * @param accuracy Optional exemplar of number of decimal places.
    */
  def apply(n: Double): Double = js.native
  def apply(n: Double, accuracy: Double): Double = js.native
}

