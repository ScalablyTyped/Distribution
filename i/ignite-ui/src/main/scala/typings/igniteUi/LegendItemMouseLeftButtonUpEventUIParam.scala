package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemMouseLeftButtonUpEventUIParam extends js.Object {
  /**
  	 * Used to get legend item brush.
  	 */
  var actualItemBrush: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get series owner brush.
  	 */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to chart owner object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to chart item related to event.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current legend object.
  	 */
  var legend: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current series owner object.
  	 */
  var series: js.UndefOr[js.Any] = js.undefined
}

object LegendItemMouseLeftButtonUpEventUIParam {
  @scala.inline
  def apply(
    actualItemBrush: js.Any = null,
    actualSeriesBrush: js.Any = null,
    chart: js.Any = null,
    item: js.Any = null,
    legend: js.Any = null,
    series: js.Any = null
  ): LegendItemMouseLeftButtonUpEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (actualItemBrush != null) __obj.updateDynamic("actualItemBrush")(actualItemBrush.asInstanceOf[js.Any])
    if (actualSeriesBrush != null) __obj.updateDynamic("actualSeriesBrush")(actualSeriesBrush.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendItemMouseLeftButtonUpEventUIParam]
  }
}

