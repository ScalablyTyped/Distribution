package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemTargetBorder extends js.Object {
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var dashType: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SparklineSeriesItemTargetBorder {
  @scala.inline
  def apply(
    color: java.lang.String | js.Function = null,
    dashType: java.lang.String | js.Function = null,
    width: scala.Int | scala.Double = null
  ): SparklineSeriesItemTargetBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemTargetBorder]
  }
}

