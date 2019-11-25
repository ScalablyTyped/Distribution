package typings.atLinguiMacro.selectMod

import org.scalablytyped.runtime.NumberDictionary
import typings.atLinguiCore.i18nMod.MessageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralForms extends /* exact */ NumberDictionary[String | MessageDescriptor] {
  var few: js.UndefOr[String | MessageDescriptor] = js.undefined
  var many: js.UndefOr[String | MessageDescriptor] = js.undefined
  var one: js.UndefOr[String | MessageDescriptor] = js.undefined
  var other: String | MessageDescriptor
  var two: js.UndefOr[String | MessageDescriptor] = js.undefined
  var zero: js.UndefOr[String | MessageDescriptor] = js.undefined
}

object PluralForms {
  @scala.inline
  def apply(
    other: String | MessageDescriptor,
    NumberDictionary: /* exact */ NumberDictionary[String | MessageDescriptor] = null,
    few: String | MessageDescriptor = null,
    many: String | MessageDescriptor = null,
    one: String | MessageDescriptor = null,
    two: String | MessageDescriptor = null,
    zero: String | MessageDescriptor = null
  ): PluralForms = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralForms]
  }
}

