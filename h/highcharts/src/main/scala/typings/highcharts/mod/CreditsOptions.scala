package typings.highcharts.mod

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
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (mapText != null) __obj.updateDynamic("mapText")(mapText.asInstanceOf[js.Any])
    if (mapTextFull != null) __obj.updateDynamic("mapTextFull")(mapTextFull.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditsOptions]
  }
}

