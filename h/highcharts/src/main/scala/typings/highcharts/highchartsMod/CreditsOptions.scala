package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the credits
    * text.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for the credits label.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) Credits for map source to be concatenated with conventional
    * credit text. By default this is a format string that collects copyright
    * information from the map if available.
    */
  var mapText: js.UndefOr[String] = js.undefined
  /**
    * (Highmaps) Detailed credits for map source to be displayed on hover of
    * credits text. By default this is a format string that collects copyright
    * information from the map if available.
    */
  var mapTextFull: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Position configuration for the
    * credits label.
    */
  var position: js.UndefOr[AlignObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the credits
    * label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text for the credits label.
    */
  var text: js.UndefOr[String] = js.undefined
}

object CreditsOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    mapText: String = null,
    mapTextFull: String = null,
    position: AlignObject = null,
    style: CSSObject = null,
    text: String = null
  ): CreditsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (mapText != null) __obj.updateDynamic("mapText")(mapText)
    if (mapTextFull != null) __obj.updateDynamic("mapTextFull")(mapTextFull)
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CreditsOptions]
  }
}

