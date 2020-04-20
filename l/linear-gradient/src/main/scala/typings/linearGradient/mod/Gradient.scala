package typings.linearGradient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends js.Object {
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcArray(normalizedPercent: Double): Color
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcHex(normalizedPrecent: Double): String
}

object Gradient {
  @scala.inline
  def apply(calcArray: Double => Color, calcHex: Double => String): Gradient = {
    val __obj = js.Dynamic.literal(calcArray = js.Any.fromFunction1(calcArray), calcHex = js.Any.fromFunction1(calcHex))
    __obj.asInstanceOf[Gradient]
  }
}

