package typings.linguiCore.selectMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralForms extends /* exact */ NumberDictionary[String] {
  var few: js.UndefOr[String] = js.undefined
  var many: js.UndefOr[String] = js.undefined
  var one: js.UndefOr[String] = js.undefined
  var other: String
  var two: js.UndefOr[String] = js.undefined
  var zero: js.UndefOr[String] = js.undefined
}

object PluralForms {
  @scala.inline
  def apply(
    other: String,
    NumberDictionary: /* page */ NumberDictionary[String] = null,
    few: String = null,
    many: String = null,
    one: String = null,
    two: String = null,
    zero: String = null
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

