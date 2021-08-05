package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language options for
    * sonification.
    */
  var sonification: js.UndefOr[LangAccessibilitySonificationOptions] = js.undefined
  
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
  
  inline def apply(): LangAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityOptions]
  }
  
  extension [Self <: LangAccessibilityOptions](x: Self) {
    
    inline def setAnnounceNewData(value: LangAccessibilityAnnounceNewDataOptions): Self = StObject.set(x, "announceNewData", value.asInstanceOf[js.Any])
    
    inline def setAnnounceNewDataUndefined: Self = StObject.set(x, "announceNewData", js.undefined)
    
    inline def setAxis(value: LangAccessibilityAxisOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setChartContainerLabel(value: String): Self = StObject.set(x, "chartContainerLabel", value.asInstanceOf[js.Any])
    
    inline def setChartContainerLabelUndefined: Self = StObject.set(x, "chartContainerLabel", js.undefined)
    
    inline def setChartTypes(value: LangAccessibilityChartTypesOptions): Self = StObject.set(x, "chartTypes", value.asInstanceOf[js.Any])
    
    inline def setChartTypesUndefined: Self = StObject.set(x, "chartTypes", js.undefined)
    
    inline def setCredits(value: String): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setDefaultChartTitle(value: String): Self = StObject.set(x, "defaultChartTitle", value.asInstanceOf[js.Any])
    
    inline def setDefaultChartTitleUndefined: Self = StObject.set(x, "defaultChartTitle", js.undefined)
    
    inline def setDrillUpButton(value: String): Self = StObject.set(x, "drillUpButton", value.asInstanceOf[js.Any])
    
    inline def setDrillUpButtonUndefined: Self = StObject.set(x, "drillUpButton", js.undefined)
    
    inline def setExporting(value: LangAccessibilityExportingOptions): Self = StObject.set(x, "exporting", value.asInstanceOf[js.Any])
    
    inline def setExportingUndefined: Self = StObject.set(x, "exporting", js.undefined)
    
    inline def setGraphicContainerLabel(value: String): Self = StObject.set(x, "graphicContainerLabel", value.asInstanceOf[js.Any])
    
    inline def setGraphicContainerLabelUndefined: Self = StObject.set(x, "graphicContainerLabel", js.undefined)
    
    inline def setLegend(value: LangAccessibilityLegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setRangeSelector(value: LangAccessibilityRangeSelectorOptions): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
    
    inline def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
    
    inline def setScreenReaderSection(value: LangAccessibilityScreenReaderSectionOptions): Self = StObject.set(x, "screenReaderSection", value.asInstanceOf[js.Any])
    
    inline def setScreenReaderSectionUndefined: Self = StObject.set(x, "screenReaderSection", js.undefined)
    
    inline def setSeries(value: LangAccessibilitySeriesOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeDescriptions(value: LangAccessibilitySeriesTypeDescriptionsOptions): Self = StObject.set(x, "seriesTypeDescriptions", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeDescriptionsUndefined: Self = StObject.set(x, "seriesTypeDescriptions", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSonification(value: LangAccessibilitySonificationOptions): Self = StObject.set(x, "sonification", value.asInstanceOf[js.Any])
    
    inline def setSonificationUndefined: Self = StObject.set(x, "sonification", js.undefined)
    
    inline def setSvgContainerLabel(value: String): Self = StObject.set(x, "svgContainerLabel", value.asInstanceOf[js.Any])
    
    inline def setSvgContainerLabelUndefined: Self = StObject.set(x, "svgContainerLabel", js.undefined)
    
    inline def setSvgContainerTitle(value: String): Self = StObject.set(x, "svgContainerTitle", value.asInstanceOf[js.Any])
    
    inline def setSvgContainerTitleUndefined: Self = StObject.set(x, "svgContainerTitle", js.undefined)
    
    inline def setTable(value: LangAccessibilityTableOptions): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setThousandsSep(value: String): Self = StObject.set(x, "thousandsSep", value.asInstanceOf[js.Any])
    
    inline def setThousandsSepUndefined: Self = StObject.set(x, "thousandsSep", js.undefined)
    
    inline def setZoom(value: LangAccessibilityZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
