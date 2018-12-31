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

