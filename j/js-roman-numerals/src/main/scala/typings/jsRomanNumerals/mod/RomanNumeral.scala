package typings.jsRomanNumerals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RomanNumeral extends js.Object {
  def toInt(): Double = js.native
}

object RomanNumeral {
  @scala.inline
  def apply(toInt: () => Double): RomanNumeral = {
    val __obj = js.Dynamic.literal(toInt = js.Any.fromFunction0(toInt))
    __obj.asInstanceOf[RomanNumeral]
  }
  @scala.inline
  implicit class RomanNumeralOps[Self <: RomanNumeral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToInt(value: () => Double): Self = this.set("toInt", js.Any.fromFunction0(value))
  }
  
}

