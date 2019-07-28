package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOptions extends js.Object {
  /**
    * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
    * use time.Date that supports individual time settings per chart.
    */
  var Date: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
    * required by VML browsers in order to draw radial gradients.
    */
  var VMLRadialGradientURL: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) _Canvg rendering for Android 2.x is removed as of
    * Highcharts 5.0\. Use the libURL option to configure exporting._
    *
    * The URL to the additional file to lazy load for Android 2.x devices.
    * These devices don't support SVG, so we download a helper file that
    * contains canvg, its dependency rbcolor, and our own CanVG Renderer class.
    * To avoid hotlinking to our site, you can install canvas-tools.js on your
    * own server and change this option accordingly.
    */
  var canvasToolsURL: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
    * use time.getTimezoneOffset that supports individual time settings per
    * chart.
    */
  var getTimezoneOffset: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
    * use time.timezone that supports individual time settings per chart.
    */
  var timezone: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) This option is deprecated since v6.0.5. Instead,
    * use time.timezoneOffset that supports individual time settings per chart.
    */
  var timezoneOffset: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This option is deprecated since
    * v6.0.5. Instead, use time.useUTC that supports individual time settings
    * per chart.
    */
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object GlobalOptions {
  @scala.inline
  def apply(
    Date: js.Function = null,
    VMLRadialGradientURL: String = null,
    canvasToolsURL: String = null,
    getTimezoneOffset: js.Function = null,
    timezone: String = null,
    timezoneOffset: Int | Double = null,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (VMLRadialGradientURL != null) __obj.updateDynamic("VMLRadialGradientURL")(VMLRadialGradientURL)
    if (canvasToolsURL != null) __obj.updateDynamic("canvasToolsURL")(canvasToolsURL)
    if (getTimezoneOffset != null) __obj.updateDynamic("getTimezoneOffset")(getTimezoneOffset)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (timezoneOffset != null) __obj.updateDynamic("timezoneOffset")(timezoneOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC)
    __obj.asInstanceOf[GlobalOptions]
  }
}

