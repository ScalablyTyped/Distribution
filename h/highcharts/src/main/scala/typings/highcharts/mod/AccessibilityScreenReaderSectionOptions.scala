package typings.highcharts.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityScreenReaderSectionOptions extends js.Object {
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
    * information region before the chart. Supported HTML tags are `<h1-7>`,
    * `<p>`, `<div>`, `<a>`, and `<button>`. Attributes are not supported,
    * except for id on `<div>`, `<a>`, and `<button>`. Id is required on `<a>`
    * and `<button>` in the format `<tag id="abcd">`. Numbers, lower- and
    * uppercase letters, "-" and "#" are valid characters in IDs.
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
    * the "View as Data Table" link in the screen reader region.
    *
    * By default Highcharts will insert and set focus to a data table
    * representation of the chart.
    */
  var onViewDataTableClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.undefined
}

object AccessibilityScreenReaderSectionOptions {
  @scala.inline
  def apply(
    afterChartFormat: String = null,
    afterChartFormatter: Chart_ => String = null,
    axisRangeDateFormat: String = null,
    beforeChartFormat: String = null,
    beforeChartFormatter: Chart_ => String = null,
    onViewDataTableClick: /* evt */ MouseEvent => Unit = null
  ): AccessibilityScreenReaderSectionOptions = {
    val __obj = js.Dynamic.literal()
    if (afterChartFormat != null) __obj.updateDynamic("afterChartFormat")(afterChartFormat.asInstanceOf[js.Any])
    if (afterChartFormatter != null) __obj.updateDynamic("afterChartFormatter")(js.Any.fromFunction1(afterChartFormatter))
    if (axisRangeDateFormat != null) __obj.updateDynamic("axisRangeDateFormat")(axisRangeDateFormat.asInstanceOf[js.Any])
    if (beforeChartFormat != null) __obj.updateDynamic("beforeChartFormat")(beforeChartFormat.asInstanceOf[js.Any])
    if (beforeChartFormatter != null) __obj.updateDynamic("beforeChartFormatter")(js.Any.fromFunction1(beforeChartFormatter))
    if (onViewDataTableClick != null) __obj.updateDynamic("onViewDataTableClick")(js.Any.fromFunction1(onViewDataTableClick))
    __obj.asInstanceOf[AccessibilityScreenReaderSectionOptions]
  }
}

