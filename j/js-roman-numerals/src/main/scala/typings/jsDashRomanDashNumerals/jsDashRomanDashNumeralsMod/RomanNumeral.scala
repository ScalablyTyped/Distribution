package typings.jsDashRomanDashNumerals.jsDashRomanDashNumeralsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RomanNumeral extends js.Object {
  def toInt(): Double
}

object RomanNumeral {
  @scala.inline
  def apply(toInt: () => Double, toString: () => String): RomanNumeral = {
    val __obj = js.Dynamic.literal(toInt = js.Any.fromFunction0(toInt), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[RomanNumeral]
  }
}

