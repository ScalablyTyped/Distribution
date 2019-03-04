package typings
package htmlDashEntitiesLib.htmlDashEntitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entities extends js.Object {
  def decode(toDecode: java.lang.String): java.lang.String
  def encode(toEncode: java.lang.String): java.lang.String
  def encodeNonASCII(toEncode: java.lang.String): java.lang.String
  def encodeNonUTF(toEncode: java.lang.String): java.lang.String
}

object Entities {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, java.lang.String],
    encode: js.Function1[java.lang.String, java.lang.String],
    encodeNonASCII: js.Function1[java.lang.String, java.lang.String],
    encodeNonUTF: js.Function1[java.lang.String, java.lang.String]
  ): Entities = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode, encodeNonASCII = encodeNonASCII, encodeNonUTF = encodeNonUTF)
  
    __obj.asInstanceOf[Entities]
  }
}

