package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilitySeriesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
    * This is added after the main summary if present.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for the
    * series main summary. Each series type has two modes:
    *
    * 1. This series type is the only series type used in the chart
    *
    * 2. This is a combination chart with multiple series types
    *
    * If a definition does not exist for the specific series type and mode, the
    * 'default' lang definitions are used.
    */
  var summary: js.UndefOr[LangAccessibilitySeriesSummaryOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
    * there are multiple xAxes in the chart.
    */
  var xAxisDescription: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
    * there are multiple yAxes in the chart.
    */
  var yAxisDescription: js.UndefOr[String] = js.undefined
}

object LangAccessibilitySeriesOptions {
  @scala.inline
  def apply(
    description: String = null,
    summary: LangAccessibilitySeriesSummaryOptions = null,
    xAxisDescription: String = null,
    yAxisDescription: String = null
  ): LangAccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (xAxisDescription != null) __obj.updateDynamic("xAxisDescription")(xAxisDescription.asInstanceOf[js.Any])
    if (yAxisDescription != null) __obj.updateDynamic("yAxisDescription")(yAxisDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilitySeriesOptions]
  }
}

