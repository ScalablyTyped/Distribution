package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new
    * data in charts. If addPoint or addSeries is used, and only one
    * series/point is added, the `newPointAnnounce` and `newSeriesAnnounce`
    * strings are used. The `...Single` versions will be used if there is only
    * one chart on the page, and the `...Multiple` versions will be used if
    * there are multiple charts on the page. For all other new data events, the
    * `newDataAnnounce` string will be used.
    */
  var announceNewData: js.UndefOr[LangAccessibilityAnnounceNewDataOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
    */
  var axis: js.UndefOr[LangAccessibilityAxisOptions] = js.native
  var chartContainerLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
    * This is added to the chart information region.
    *
    * If there is only a single series type used in the chart, we use the
    * format string for the series type, or default if missing. There is one
    * format string for cases where there is only a single series in the chart,
    * and one for multiple series of the same type.
    */
  var chartTypes: js.UndefOr[LangAccessibilityChartTypesOptions] = js.native
  var credits: js.UndefOr[String] = js.native
  var defaultChartTitle: js.UndefOr[String] = js.native
  var drillUpButton: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
    * for accessibility module.
    */
  var exporting: js.UndefOr[LangAccessibilityExportingOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set a label on the container
    * wrapping the SVG.
    */
  var graphicContainerLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for
    * accessibility of the legend.
    */
  var legend: js.UndefOr[LangAccessibilityLegendOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options
    * for accessibility.
    */
  var rangeSelector: js.UndefOr[LangAccessibilityRangeSelectorOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
    * reader information sections added before and after the charts.
    */
  var screenReaderSection: js.UndefOr[LangAccessibilityScreenReaderSectionOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
    * series types. For more dynamic control over the series element
    * descriptions, see accessibility.seriesDescriptionFormatter.
    */
  var series: js.UndefOr[LangAccessibilitySeriesOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
    * series types. The relevant description is added to the screen reader
    * information region when these series types are used.
    */
  var seriesTypeDescriptions: js.UndefOr[LangAccessibilitySeriesTypeDescriptionsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for
    * sonification.
    */
  var sonification: js.UndefOr[LangAccessibilitySonificationOptions] = js.native
  var svgContainerLabel: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
    * SVG element. Leave this empty to disable adding the title element.
    * Browsers will display this content when hovering over elements in the
    * chart. Assistive technology may use this element to label the chart.
    */
  var svgContainerTitle: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options
    * for the data table.
    */
  var table: js.UndefOr[LangAccessibilityTableOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
    * formatting numbers for screen readers. Note that many screen readers will
    * not handle space as a thousands separator, and will consider "11 700" as
    * two numbers.
    *
    * Set to `null` to use the separator defined in lang.thousandsSep.
    */
  var thousandsSep: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
    * language options.
    */
  var zoom: js.UndefOr[LangAccessibilityZoomOptions] = js.native
}

object LangAccessibilityOptions {
  @scala.inline
  def apply(): LangAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityOptions]
  }
  @scala.inline
  implicit class LangAccessibilityOptionsOps[Self <: LangAccessibilityOptions] (val x: Self) extends AnyVal {
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
    def setAnnounceNewData(value: LangAccessibilityAnnounceNewDataOptions): Self = this.set("announceNewData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnounceNewData: Self = this.set("announceNewData", js.undefined)
    @scala.inline
    def setAxis(value: LangAccessibilityAxisOptions): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setChartContainerLabel(value: String): Self = this.set("chartContainerLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartContainerLabel: Self = this.set("chartContainerLabel", js.undefined)
    @scala.inline
    def setChartTypes(value: LangAccessibilityChartTypesOptions): Self = this.set("chartTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartTypes: Self = this.set("chartTypes", js.undefined)
    @scala.inline
    def setCredits(value: String): Self = this.set("credits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredits: Self = this.set("credits", js.undefined)
    @scala.inline
    def setDefaultChartTitle(value: String): Self = this.set("defaultChartTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultChartTitle: Self = this.set("defaultChartTitle", js.undefined)
    @scala.inline
    def setDrillUpButton(value: String): Self = this.set("drillUpButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrillUpButton: Self = this.set("drillUpButton", js.undefined)
    @scala.inline
    def setExporting(value: LangAccessibilityExportingOptions): Self = this.set("exporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExporting: Self = this.set("exporting", js.undefined)
    @scala.inline
    def setGraphicContainerLabel(value: String): Self = this.set("graphicContainerLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphicContainerLabel: Self = this.set("graphicContainerLabel", js.undefined)
    @scala.inline
    def setLegend(value: LangAccessibilityLegendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setRangeSelector(value: LangAccessibilityRangeSelectorOptions): Self = this.set("rangeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelector: Self = this.set("rangeSelector", js.undefined)
    @scala.inline
    def setScreenReaderSection(value: LangAccessibilityScreenReaderSectionOptions): Self = this.set("screenReaderSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderSection: Self = this.set("screenReaderSection", js.undefined)
    @scala.inline
    def setSeries(value: LangAccessibilitySeriesOptions): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesTypeDescriptions(value: LangAccessibilitySeriesTypeDescriptionsOptions): Self = this.set("seriesTypeDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesTypeDescriptions: Self = this.set("seriesTypeDescriptions", js.undefined)
    @scala.inline
    def setSonification(value: LangAccessibilitySonificationOptions): Self = this.set("sonification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSonification: Self = this.set("sonification", js.undefined)
    @scala.inline
    def setSvgContainerLabel(value: String): Self = this.set("svgContainerLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgContainerLabel: Self = this.set("svgContainerLabel", js.undefined)
    @scala.inline
    def setSvgContainerTitle(value: String): Self = this.set("svgContainerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgContainerTitle: Self = this.set("svgContainerTitle", js.undefined)
    @scala.inline
    def setTable(value: LangAccessibilityTableOptions): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setThousandsSep(value: String): Self = this.set("thousandsSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSep: Self = this.set("thousandsSep", js.undefined)
    @scala.inline
    def setZoom(value: LangAccessibilityZoomOptions): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

