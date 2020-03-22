package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var announceNewData: js.UndefOr[LangAccessibilityAnnounceNewDataOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
    */
  var axis: js.UndefOr[LangAccessibilityAxisOptions] = js.undefined
  var chartContainerLabel: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
    * This is added to the chart information region.
    *
    * If there is only a single series type used in the chart, we use the
    * format string for the series type, or default if missing. There is one
    * format string for cases where there is only a single series in the chart,
    * and one for multiple series of the same type.
    */
  var chartTypes: js.UndefOr[LangAccessibilityChartTypesOptions] = js.undefined
  var credits: js.UndefOr[String] = js.undefined
  var defaultChartTitle: js.UndefOr[String] = js.undefined
  var drillUpButton: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
    * for accessibility module.
    */
  var exporting: js.UndefOr[LangAccessibilityExportingOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set a label on the container
    * wrapping the SVG.
    */
  var graphicContainerLabel: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for
    * accessibility of the legend.
    */
  var legend: js.UndefOr[LangAccessibilityLegendOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options
    * for accessibility.
    */
  var rangeSelector: js.UndefOr[LangAccessibilityRangeSelectorOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
    * reader information sections added before and after the charts.
    */
  var screenReaderSection: js.UndefOr[LangAccessibilityScreenReaderSectionOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
    * series types. For more dynamic control over the series element
    * descriptions, see accessibility.seriesDescriptionFormatter.
    */
  var series: js.UndefOr[LangAccessibilitySeriesOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
    * series types. The relevant description is added to the screen reader
    * information region when these series types are used.
    */
  var seriesTypeDescriptions: js.UndefOr[LangAccessibilitySeriesTypeDescriptionsOptions] = js.undefined
  var svgContainerLabel: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
    * SVG element. Leave this empty to disable adding the title element.
    * Browsers will display this content when hovering over elements in the
    * chart. Assistive technology may use this element to label the chart.
    */
  var svgContainerTitle: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options
    * for the data table.
    */
  var table: js.UndefOr[LangAccessibilityTableOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
    * formatting numbers for screen readers. Note that many screen readers will
    * not handle space as a thousands separator, and will consider "11 700" as
    * two numbers.
    *
    * Set to `null` to use the separator defined in lang.thousandsSep.
    */
  var thousandsSep: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
    * language options.
    */
  var zoom: js.UndefOr[LangAccessibilityZoomOptions] = js.undefined
}

object LangAccessibilityOptions {
  @scala.inline
  def apply(
    announceNewData: LangAccessibilityAnnounceNewDataOptions = null,
    axis: LangAccessibilityAxisOptions = null,
    chartContainerLabel: String = null,
    chartTypes: LangAccessibilityChartTypesOptions = null,
    credits: String = null,
    defaultChartTitle: String = null,
    drillUpButton: String = null,
    exporting: LangAccessibilityExportingOptions = null,
    graphicContainerLabel: String = null,
    legend: LangAccessibilityLegendOptions = null,
    rangeSelector: LangAccessibilityRangeSelectorOptions = null,
    screenReaderSection: LangAccessibilityScreenReaderSectionOptions = null,
    series: LangAccessibilitySeriesOptions = null,
    seriesTypeDescriptions: LangAccessibilitySeriesTypeDescriptionsOptions = null,
    svgContainerLabel: String = null,
    svgContainerTitle: String = null,
    table: LangAccessibilityTableOptions = null,
    thousandsSep: String = null,
    zoom: LangAccessibilityZoomOptions = null
  ): LangAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (announceNewData != null) __obj.updateDynamic("announceNewData")(announceNewData.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (chartContainerLabel != null) __obj.updateDynamic("chartContainerLabel")(chartContainerLabel.asInstanceOf[js.Any])
    if (chartTypes != null) __obj.updateDynamic("chartTypes")(chartTypes.asInstanceOf[js.Any])
    if (credits != null) __obj.updateDynamic("credits")(credits.asInstanceOf[js.Any])
    if (defaultChartTitle != null) __obj.updateDynamic("defaultChartTitle")(defaultChartTitle.asInstanceOf[js.Any])
    if (drillUpButton != null) __obj.updateDynamic("drillUpButton")(drillUpButton.asInstanceOf[js.Any])
    if (exporting != null) __obj.updateDynamic("exporting")(exporting.asInstanceOf[js.Any])
    if (graphicContainerLabel != null) __obj.updateDynamic("graphicContainerLabel")(graphicContainerLabel.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (rangeSelector != null) __obj.updateDynamic("rangeSelector")(rangeSelector.asInstanceOf[js.Any])
    if (screenReaderSection != null) __obj.updateDynamic("screenReaderSection")(screenReaderSection.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesTypeDescriptions != null) __obj.updateDynamic("seriesTypeDescriptions")(seriesTypeDescriptions.asInstanceOf[js.Any])
    if (svgContainerLabel != null) __obj.updateDynamic("svgContainerLabel")(svgContainerLabel.asInstanceOf[js.Any])
    if (svgContainerTitle != null) __obj.updateDynamic("svgContainerTitle")(svgContainerTitle.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (thousandsSep != null) __obj.updateDynamic("thousandsSep")(thousandsSep.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityOptions]
  }
}

