package typings.linguiCore.selectMod

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
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralProps]
  }
}

