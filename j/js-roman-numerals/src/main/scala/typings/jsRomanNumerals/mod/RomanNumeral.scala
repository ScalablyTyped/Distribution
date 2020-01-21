package typings.jsRomanNumerals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RomanNumeral extends js.Object {
  def toInt(): Double
}

object RomanNumeral {
  @scala.inline
  def apply(toInt: () => Double): RomanNumeral = {
    val __obj = js.Dynamic.literal(toInt = js.Any.fromFunction0(toInt))
  
    __obj.asInstanceOf[RomanNumeral]
  }
}

