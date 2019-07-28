package typings.atLinguiCore.selectMod

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
    NumberDictionary: /* exact */ NumberDictionary[String] = null,
    few: String = null,
    many: String = null,
    one: String = null,
    two: String = null,
    zero: String = null
  ): PluralForms = {
    val __obj = js.Dynamic.literal(other = other)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (one != null) __obj.updateDynamic("one")(one)
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[PluralForms]
  }
}

