package typings
package lodashDashEsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-es", JSImport.Namespace)
@js.native
object lodashDashEsMod extends js.Object {
  /**
    * Computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
    * @param string A string value
    */
  def escape(string: java.lang.String): java.lang.String = js.native
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  def isFinite(number: scala.Double): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  def isNaN(number: scala.Double): scala.Boolean = js.native
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def parseInt(s: java.lang.String): scala.Double = js.native
  def parseInt(s: java.lang.String, radix: scala.Double): scala.Double = js.native
  /**
    * Computes a new string in which hexadecimal escape sequences are replaced with the character that it represents.
    * @param string A string value
    */
  def unescape(string: java.lang.String): java.lang.String = js.native
}

