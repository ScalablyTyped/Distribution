package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsTextPathOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable `textPath`
    * option for link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesPackedBubbleDataLabelsTextPathOptionsObject {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesPackedBubbleDataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsTextPathOptionsObject]
  }
}

