package typings
package atLinguiCoreLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralForms
  extends /* exact */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  var few: js.UndefOr[java.lang.String] = js.undefined
  var many: js.UndefOr[java.lang.String] = js.undefined
  var one: js.UndefOr[java.lang.String] = js.undefined
  var other: java.lang.String
  var two: js.UndefOr[java.lang.String] = js.undefined
  var zero: js.UndefOr[java.lang.String] = js.undefined
}

object PluralForms {
  @scala.inline
  def apply(
    other: java.lang.String,
    NumberDictionary: /* exact */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    few: java.lang.String = null,
    many: java.lang.String = null,
    one: java.lang.String = null,
    two: java.lang.String = null,
    zero: java.lang.String = null
  ): PluralForms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("other")(other)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (one != null) __obj.updateDynamic("one")(one)
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[PluralForms]
  }
}

