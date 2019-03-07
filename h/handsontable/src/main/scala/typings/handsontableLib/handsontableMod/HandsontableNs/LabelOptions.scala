package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var position: js.UndefOr[
    handsontableLib.handsontableLibStrings.before | handsontableLib.handsontableLibStrings.after
  ] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    position: handsontableLib.handsontableLibStrings.before | handsontableLib.handsontableLibStrings.after = null,
    property: java.lang.String = null,
    value: java.lang.String | js.Function0[java.lang.String] = null
  ): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

