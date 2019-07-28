package typings.hiDashBase32.hiDashBase32Mod

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
  def apply(base32Str: String): String = js.native
  def apply(base32Str: String, asciiOnly: Boolean): String = js.native
  /**
    * Decode base32 string and return byte array
    *
    * @param base32Str The base32 string you want to decode.
    */
  def asBytes(base32Str: String): js.Array[Double] = js.native
}

