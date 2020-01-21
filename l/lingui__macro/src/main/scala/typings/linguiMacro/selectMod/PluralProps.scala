package typings.linguiMacro.selectMod

import typings.linguiCore.i18nMod.MessageDescriptor
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
    other: String | MessageDescriptor,
    value: Double,
    few: String | MessageDescriptor = null,
    many: String | MessageDescriptor = null,
    offset: Int | Double = null,
    one: String | MessageDescriptor = null,
    two: String | MessageDescriptor = null,
    zero: String | MessageDescriptor = null
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

