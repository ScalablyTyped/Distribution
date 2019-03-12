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
    decode: java.lang.String => java.lang.String,
    encode: java.lang.String => java.lang.String,
    encodeNonASCII: java.lang.String => java.lang.String,
    encodeNonUTF: java.lang.String => java.lang.String
  ): Entities = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), encodeNonASCII = js.Any.fromFunction1(encodeNonASCII), encodeNonUTF = js.Any.fromFunction1(encodeNonUTF))
  
    __obj.asInstanceOf[Entities]
  }
}

