package typings
package atLinguiMacroLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralForms
  extends /* exact */ org.scalablytyped.runtime.NumberDictionary[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] {
  var few: js.UndefOr[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = js.undefined
  var many: js.UndefOr[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = js.undefined
  var one: js.UndefOr[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = js.undefined
  var other: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor
  var two: js.UndefOr[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = js.undefined
  var zero: js.UndefOr[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = js.undefined
}

object PluralForms {
  @scala.inline
  def apply(
    other: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor,
    NumberDictionary: /* exact */ org.scalablytyped.runtime.NumberDictionary[java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor] = null,
    few: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    many: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    one: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    two: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    zero: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null
  ): PluralForms = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralForms]
  }
}

