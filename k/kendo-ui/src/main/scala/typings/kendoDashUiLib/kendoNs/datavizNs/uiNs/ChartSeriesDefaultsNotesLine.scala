package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsNotesLine extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dashType: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartSeriesDefaultsNotesLine {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashType: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ChartSeriesDefaultsNotesLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaultsNotesLine]
  }
}

