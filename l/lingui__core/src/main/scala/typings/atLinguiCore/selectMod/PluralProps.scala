package typings.atLinguiCore.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralProps extends PluralForms {
  var offset: js.UndefOr[Double] = js.undefined
  var value: Double
}

object PluralProps {
  @scala.inline
  def apply(
    other: String,
    value: Double,
    few: String = null,
    many: String = null,
    offset: Int | Double = null,
    one: String = null,
    two: String = null,
    zero: String = null
  ): PluralProps = {
    val __obj = js.Dynamic.literal(other = other, value = value)
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one)
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[PluralProps]
  }
}

