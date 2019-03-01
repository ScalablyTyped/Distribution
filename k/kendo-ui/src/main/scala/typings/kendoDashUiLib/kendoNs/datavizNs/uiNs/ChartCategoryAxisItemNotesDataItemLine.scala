package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemNotesDataItemLine extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartCategoryAxisItemNotesDataItemLine {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ChartCategoryAxisItemNotesDataItemLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCategoryAxisItemNotesDataItemLine]
  }
}

