package typings.lodashEs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-es", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
    * @param string A string value
    */
  def escape(string: String): String = js.native
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  def isFinite(number: Double): Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  def isNaN(number: Double): Boolean = js.native
  /**
    * Converts a string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def parseInt(s: String): Double = js.native
  def parseInt(s: String, radix: Double): Double = js.native
  /**
    * Computes a new string in which hexadecimal escape sequences are replaced with the character that it represents.
    * @param string A string value
    */
  def unescape(string: String): String = js.native
}

