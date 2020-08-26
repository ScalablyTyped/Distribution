package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilitySeriesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) User supplied description text.
    * This is added in the point comment description by default if present.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description for the value of
    * null points.
    */
  var nullPointValue: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Description for annotations on a
    * point, as it is made available to assistive technology.
    */
  var pointAnnotationsDescription: js.UndefOr[String] = js.native
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
  var summary: js.UndefOr[LangAccessibilitySeriesSummaryOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) xAxis description for series if
    * there are multiple xAxes in the chart.
    */
  var xAxisDescription: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) yAxis description for series if
    * there are multiple yAxes in the chart.
    */
  var yAxisDescription: js.UndefOr[String] = js.native
}

object LangAccessibilitySeriesOptions {
  @scala.inline
  def apply(): LangAccessibilitySeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilitySeriesOptions]
  }
  @scala.inline
  implicit class LangAccessibilitySeriesOptionsOps[Self <: LangAccessibilitySeriesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setNullPointValue(value: String): Self = this.set("nullPointValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullPointValue: Self = this.set("nullPointValue", js.undefined)
    @scala.inline
    def setPointAnnotationsDescription(value: String): Self = this.set("pointAnnotationsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointAnnotationsDescription: Self = this.set("pointAnnotationsDescription", js.undefined)
    @scala.inline
    def setSummary(value: LangAccessibilitySeriesSummaryOptions): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setXAxisDescription(value: String): Self = this.set("xAxisDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisDescription: Self = this.set("xAxisDescription", js.undefined)
    @scala.inline
    def setYAxisDescription(value: String): Self = this.set("yAxisDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisDescription: Self = this.set("yAxisDescription", js.undefined)
  }
  
}

