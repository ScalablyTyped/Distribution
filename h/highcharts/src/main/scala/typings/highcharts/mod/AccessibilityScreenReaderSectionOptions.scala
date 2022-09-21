package typings.highcharts.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityScreenReaderSectionOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
    * information region after the chart. Analogous to beforeChartFormat.
    */
  var afterChartFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
    * the HTML contents of the hidden screen reader information region after
    * the chart. Analogous to beforeChartFormatter.
    */
  var afterChartFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Chart_]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
    * range of datetime axes.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var axisRangeDateFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
    * information region before the chart. Supported HTML tags are `<h1-6>`,
    * `<p>`, `<div>`, `<a>`, `<ul>`, `<ol>`, `<li>`, and `<button>`. Attributes
    * are not supported, except for id on `<div>`, `<a>`, and `<button>`. Id is
    * required on `<a>` and `<button>` in the format `<tag id="abcd">`.
    * Numbers, lower- and uppercase letters, "-" and "#" are valid characters
    * in IDs.
    *
    * The headingTagName is an auto-detected heading (h1-h6) that corresponds
    * to the heading level below the previous heading in the DOM.
    *
    * Set to empty string to remove the region altogether.
    */
  var beforeChartFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
    * the HTML contents of the hidden screen reader information region before
    * the chart. Receives one argument, `chart`, referring to the chart object.
    * Should return a string with the HTML content of the region. By default
    * this returns an automatic description of the chart based on
    * beforeChartFormat.
    */
  var beforeChartFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Chart_]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
    * the "Play as sound" button in the screen reader region.
    *
    * By default Highcharts will call the `chart.sonify` function.
    */
  var onPlayAsSoundClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
    * the "View as Data Table" link in the screen reader region.
    *
    * By default Highcharts will insert and set focus to a data table
    * representation of the chart.
    */
  var onViewDataTableClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.undefined
}
object AccessibilityScreenReaderSectionOptions {
  
  inline def apply(): AccessibilityScreenReaderSectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityScreenReaderSectionOptions]
  }
  
  extension [Self <: AccessibilityScreenReaderSectionOptions](x: Self) {
    
    inline def setAfterChartFormat(value: String): Self = StObject.set(x, "afterChartFormat", value.asInstanceOf[js.Any])
    
    inline def setAfterChartFormatUndefined: Self = StObject.set(x, "afterChartFormat", js.undefined)
    
    inline def setAfterChartFormatter(value: Chart_ => String): Self = StObject.set(x, "afterChartFormatter", js.Any.fromFunction1(value))
    
    inline def setAfterChartFormatterUndefined: Self = StObject.set(x, "afterChartFormatter", js.undefined)
    
    inline def setAxisRangeDateFormat(value: String): Self = StObject.set(x, "axisRangeDateFormat", value.asInstanceOf[js.Any])
    
    inline def setAxisRangeDateFormatUndefined: Self = StObject.set(x, "axisRangeDateFormat", js.undefined)
    
    inline def setBeforeChartFormat(value: String): Self = StObject.set(x, "beforeChartFormat", value.asInstanceOf[js.Any])
    
    inline def setBeforeChartFormatUndefined: Self = StObject.set(x, "beforeChartFormat", js.undefined)
    
    inline def setBeforeChartFormatter(value: Chart_ => String): Self = StObject.set(x, "beforeChartFormatter", js.Any.fromFunction1(value))
    
    inline def setBeforeChartFormatterUndefined: Self = StObject.set(x, "beforeChartFormatter", js.undefined)
    
    inline def setOnPlayAsSoundClick(value: /* evt */ MouseEvent => Unit): Self = StObject.set(x, "onPlayAsSoundClick", js.Any.fromFunction1(value))
    
    inline def setOnPlayAsSoundClickUndefined: Self = StObject.set(x, "onPlayAsSoundClick", js.undefined)
    
    inline def setOnViewDataTableClick(value: /* evt */ MouseEvent => Unit): Self = StObject.set(x, "onViewDataTableClick", js.Any.fromFunction1(value))
    
    inline def setOnViewDataTableClickUndefined: Self = StObject.set(x, "onViewDataTableClick", js.undefined)
  }
}
