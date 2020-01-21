package typings.lodashParseint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash.parseint", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Converts a string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def apply(s: String): Double = js.native
  def apply(s: String, radix: Double): Double = js.native
}

