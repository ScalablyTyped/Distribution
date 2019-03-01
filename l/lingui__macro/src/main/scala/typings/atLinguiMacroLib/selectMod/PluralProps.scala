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
    other: java.lang.String,
    value: scala.Double,
    few: java.lang.String = null,
    many: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    one: java.lang.String = null,
    two: java.lang.String = null,
    zero: java.lang.String = null
  ): PluralProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("value")(value)
    if (few != null) __obj.updateDynamic("few")(few)
    if (many != null) __obj.updateDynamic("many")(many)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one)
    if (two != null) __obj.updateDynamic("two")(two)
    if (zero != null) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[PluralProps]
  }
}

