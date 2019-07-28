package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrilldownActiveDataLabelStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object DrilldownActiveDataLabelStyleOptions {
  @scala.inline
  def apply(
    color: String = null,
    cursor: String = null,
    fontWeight: String = null,
    textDecoration: String = null
  ): DrilldownActiveDataLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[DrilldownActiveDataLabelStyleOptions]
  }
}

