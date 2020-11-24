package typings.highcharts.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityScreenReaderSectionOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
    * information region after the chart. Analogous to beforeChartFormat.
    */
  var afterChartFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
    * the HTML contents of the hidden screen reader information region after
    * the chart. Analogous to beforeChartFormatter.
    */
  var afterChartFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Chart_]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
    * range of datetime axes.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var axisRangeDateFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for the screen reader
    * information region before the chart. Supported HTML tags are `<h1-7>`,
    * `<p>`, `<div>`, `<a>`, `<ul>`, `<ol>`, `<li>`, and `<button>`. Attributes
    * are not supported, except for id on `<div>`, `<a>`, and `<button>`. Id is
    * required on `<a>` and `<button>` in the format `<tag id="abcd">`.
    * Numbers, lower- and uppercase letters, "-" and "#" are valid characters
    * in IDs.
    */
  var beforeChartFormat: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
    * the HTML contents of the hidden screen reader information region before
    * the chart. Receives one argument, `chart`, referring to the chart object.
    * Should return a string with the HTML content of the region. By default
    * this returns an automatic description of the chart based on
    * beforeChartFormat.
    */
  var beforeChartFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Chart_]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
    * the "Play as sound" button in the screen reader region.
    *
    * By default Highcharts will call the `chart.sonify` function.
    */
  var onPlayAsSoundClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
    * the "View as Data Table" link in the screen reader region.
    *
    * By default Highcharts will insert and set focus to a data table
    * representation of the chart.
    */
  var onViewDataTableClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.native
}
object AccessibilityScreenReaderSectionOptions {
  
  @scala.inline
  def apply(): AccessibilityScreenReaderSectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityScreenReaderSectionOptions]
  }
  
  @scala.inline
  implicit class AccessibilityScreenReaderSectionOptionsOps[Self <: AccessibilityScreenReaderSectionOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterChartFormat(value: String): Self = this.set("afterChartFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterChartFormat: Self = this.set("afterChartFormat", js.undefined)
    
    @scala.inline
    def setAfterChartFormatter(value: Chart_ => String): Self = this.set("afterChartFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterChartFormatter: Self = this.set("afterChartFormatter", js.undefined)
    
    @scala.inline
    def setAxisRangeDateFormat(value: String): Self = this.set("axisRangeDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisRangeDateFormat: Self = this.set("axisRangeDateFormat", js.undefined)
    
    @scala.inline
    def setBeforeChartFormat(value: String): Self = this.set("beforeChartFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeChartFormat: Self = this.set("beforeChartFormat", js.undefined)
    
    @scala.inline
    def setBeforeChartFormatter(value: Chart_ => String): Self = this.set("beforeChartFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeChartFormatter: Self = this.set("beforeChartFormatter", js.undefined)
    
    @scala.inline
    def setOnPlayAsSoundClick(value: /* evt */ MouseEvent => Unit): Self = this.set("onPlayAsSoundClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlayAsSoundClick: Self = this.set("onPlayAsSoundClick", js.undefined)
    
    @scala.inline
    def setOnViewDataTableClick(value: /* evt */ MouseEvent => Unit): Self = this.set("onViewDataTableClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnViewDataTableClick: Self = this.set("onViewDataTableClick", js.undefined)
  }
}
