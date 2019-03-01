package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemTarget extends js.Object {
  var border: js.UndefOr[js.Function | SparklineSeriesItemTargetBorder] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var line: js.UndefOr[SparklineSeriesItemTargetLine] = js.undefined
}

object SparklineSeriesItemTarget {
  @scala.inline
  def apply(
    border: js.Function | SparklineSeriesItemTargetBorder = null,
    color: java.lang.String | js.Function = null,
    line: SparklineSeriesItemTargetLine = null
  ): SparklineSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[SparklineSeriesItemTarget]
  }
}

