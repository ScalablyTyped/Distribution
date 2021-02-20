package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityOptions extends StObject {
  
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
  implicit class LangAccessibilityOptionsMutableBuilder[Self <: LangAccessibilityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnounceNewData(value: LangAccessibilityAnnounceNewDataOptions): Self = StObject.set(x, "announceNewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnounceNewDataUndefined: Self = StObject.set(x, "announceNewData", js.undefined)
    
    @scala.inline
    def setAxis(value: LangAccessibilityAxisOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setChartContainerLabel(value: String): Self = StObject.set(x, "chartContainerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartContainerLabelUndefined: Self = StObject.set(x, "chartContainerLabel", js.undefined)
    
    @scala.inline
    def setChartTypes(value: LangAccessibilityChartTypesOptions): Self = StObject.set(x, "chartTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypesUndefined: Self = StObject.set(x, "chartTypes", js.undefined)
    
    @scala.inline
    def setCredits(value: String): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    @scala.inline
    def setDefaultChartTitle(value: String): Self = StObject.set(x, "defaultChartTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultChartTitleUndefined: Self = StObject.set(x, "defaultChartTitle", js.undefined)
    
    @scala.inline
    def setDrillUpButton(value: String): Self = StObject.set(x, "drillUpButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillUpButtonUndefined: Self = StObject.set(x, "drillUpButton", js.undefined)
    
    @scala.inline
    def setExporting(value: LangAccessibilityExportingOptions): Self = StObject.set(x, "exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportingUndefined: Self = StObject.set(x, "exporting", js.undefined)
    
    @scala.inline
    def setGraphicContainerLabel(value: String): Self = StObject.set(x, "graphicContainerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicContainerLabelUndefined: Self = StObject.set(x, "graphicContainerLabel", js.undefined)
    
    @scala.inline
    def setLegend(value: LangAccessibilityLegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setRangeSelector(value: LangAccessibilityRangeSelectorOptions): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
    
    @scala.inline
    def setScreenReaderSection(value: LangAccessibilityScreenReaderSectionOptions): Self = StObject.set(x, "screenReaderSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenReaderSectionUndefined: Self = StObject.set(x, "screenReaderSection", js.undefined)
    
    @scala.inline
    def setSeries(value: LangAccessibilitySeriesOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTypeDescriptions(value: LangAccessibilitySeriesTypeDescriptionsOptions): Self = StObject.set(x, "seriesTypeDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesTypeDescriptionsUndefined: Self = StObject.set(x, "seriesTypeDescriptions", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSonification(value: LangAccessibilitySonificationOptions): Self = StObject.set(x, "sonification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSonificationUndefined: Self = StObject.set(x, "sonification", js.undefined)
    
    @scala.inline
    def setSvgContainerLabel(value: String): Self = StObject.set(x, "svgContainerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgContainerLabelUndefined: Self = StObject.set(x, "svgContainerLabel", js.undefined)
    
    @scala.inline
    def setSvgContainerTitle(value: String): Self = StObject.set(x, "svgContainerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgContainerTitleUndefined: Self = StObject.set(x, "svgContainerTitle", js.undefined)
    
    @scala.inline
    def setTable(value: LangAccessibilityTableOptions): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setThousandsSep(value: String): Self = StObject.set(x, "thousandsSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSepUndefined: Self = StObject.set(x, "thousandsSep", js.undefined)
    
    @scala.inline
    def setZoom(value: LangAccessibilityZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
