package typings.kuromoji.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter[T] extends js.Object {
  def formatEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T
  def formatUnknownEntry(word_id: Double, position: Double, `type`: String, features: js.Array[String]): T
}

object Formatter {
  @scala.inline
  def apply[T](
    formatEntry: (Double, Double, String, js.Array[String]) => T,
    formatUnknownEntry: (Double, Double, String, js.Array[String]) => T
  ): Formatter[T] = {
    val __obj = js.Dynamic.literal(formatEntry = js.Any.fromFunction4(formatEntry), formatUnknownEntry = js.Any.fromFunction4(formatUnknownEntry))
  
    __obj.asInstanceOf[Formatter[T]]
  }
}

