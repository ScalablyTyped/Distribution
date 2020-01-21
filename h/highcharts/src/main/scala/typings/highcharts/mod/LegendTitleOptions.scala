package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendTitleOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
    * legend title.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
    * title.
    */
  var text: js.UndefOr[String] = js.undefined
}

object LegendTitleOptions {
  @scala.inline
  def apply(style: CSSObject = null, text: String = null): LegendTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendTitleOptions]
  }
}

