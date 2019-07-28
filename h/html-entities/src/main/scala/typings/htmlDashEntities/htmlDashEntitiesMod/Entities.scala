package typings.htmlDashEntities.htmlDashEntitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entities extends js.Object {
  def decode(toDecode: String): String
  def encode(toEncode: String): String
  def encodeNonASCII(toEncode: String): String
  def encodeNonUTF(toEncode: String): String
}

object Entities {
  @scala.inline
  def apply(
    decode: String => String,
    encode: String => String,
    encodeNonASCII: String => String,
    encodeNonUTF: String => String
  ): Entities = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), encodeNonASCII = js.Any.fromFunction1(encodeNonASCII), encodeNonUTF = js.Any.fromFunction1(encodeNonUTF))
  
    __obj.asInstanceOf[Entities]
  }
}

