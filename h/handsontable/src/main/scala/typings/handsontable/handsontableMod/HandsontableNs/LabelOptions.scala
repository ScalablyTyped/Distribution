package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableStrings.after
import typings.handsontable.handsontableStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var position: js.UndefOr[before | after] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Function0[String]] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    position: before | after = null,
    property: String = null,
    value: String | js.Function0[String] = null
  ): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

