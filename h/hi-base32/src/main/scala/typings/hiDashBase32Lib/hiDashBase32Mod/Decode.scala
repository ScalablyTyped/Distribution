package typings
package hiDashBase32Lib.hiDashBase32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decode extends js.Object {
  /**
    * Decode base32 string and return string
    *
    * @param base32Str The base32 string you want to decode.
    * @param ascciOnly decode as ASCII or decode as UTF-8 string. Default is false.
    */
  def apply(base32Str: java.lang.String): java.lang.String = js.native
  def apply(base32Str: java.lang.String, asciiOnly: scala.Boolean): java.lang.String = js.native
  /**
    * Decode base32 string and return byte array
    *
    * @param base32Str The base32 string you want to decode.
    */
  def asBytes(base32Str: java.lang.String): js.Array[scala.Double] = js.native
}

