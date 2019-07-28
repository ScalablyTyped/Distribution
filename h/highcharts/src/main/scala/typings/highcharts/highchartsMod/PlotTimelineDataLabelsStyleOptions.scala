package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTimelineDataLabelsStyleOptions extends js.Object {
  var fontSize: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var textOutline: js.UndefOr[String] = js.undefined
}

object PlotTimelineDataLabelsStyleOptions {
  @scala.inline
  def apply(fontSize: String = null, fontWeight: String = null, textOutline: String = null): PlotTimelineDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (textOutline != null) __obj.updateDynamic("textOutline")(textOutline)
    __obj.asInstanceOf[PlotTimelineDataLabelsStyleOptions]
  }
}

