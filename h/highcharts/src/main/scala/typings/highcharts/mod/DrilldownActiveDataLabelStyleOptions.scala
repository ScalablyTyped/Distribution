package typings.highcharts.mod

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
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownActiveDataLabelStyleOptions]
  }
}

