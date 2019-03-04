package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter[T] extends js.Object {
  def formatEntry(
    word_id: scala.Double,
    position: scala.Double,
    `type`: java.lang.String,
    features: js.Array[java.lang.String]
  ): T
  def formatUnknownEntry(
    word_id: scala.Double,
    position: scala.Double,
    `type`: java.lang.String,
    features: js.Array[java.lang.String]
  ): T
}

object Formatter {
  @scala.inline
  def apply[T](
    formatEntry: js.Function4[scala.Double, scala.Double, java.lang.String, js.Array[java.lang.String], T],
    formatUnknownEntry: js.Function4[scala.Double, scala.Double, java.lang.String, js.Array[java.lang.String], T]
  ): Formatter[T] = {
    val __obj = js.Dynamic.literal(formatEntry = formatEntry, formatUnknownEntry = formatUnknownEntry)
  
    __obj.asInstanceOf[Formatter[T]]
  }
}

