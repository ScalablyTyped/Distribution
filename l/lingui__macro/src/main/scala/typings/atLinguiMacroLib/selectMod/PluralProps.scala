package typings
package atLinguiMacroLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralProps extends PluralForms {
  var offset: js.UndefOr[scala.Double] = js.undefined
  var value: scala.Double
}

object PluralProps {
  @scala.inline
  def apply(
    other: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor,
    value: scala.Double,
    few: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    many: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    offset: scala.Int | scala.Double = null,
    one: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    two: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null,
    zero: java.lang.String | atLinguiCoreLib.i18nMod.MessageDescriptor = null
  ): PluralProps = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value)
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralProps]
  }
}

