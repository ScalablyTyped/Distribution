package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendItemMouseLeftButtonDownEventUIParam extends js.Object {
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

object LegendItemMouseLeftButtonDownEventUIParam {
  @scala.inline
  def apply(
    actualItemBrush: js.Any = null,
    actualSeriesBrush: js.Any = null,
    chart: js.Any = null,
    item: js.Any = null,
    legend: js.Any = null,
    series: js.Any = null
  ): LegendItemMouseLeftButtonDownEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (actualItemBrush != null) __obj.updateDynamic("actualItemBrush")(actualItemBrush)
    if (actualSeriesBrush != null) __obj.updateDynamic("actualSeriesBrush")(actualSeriesBrush)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (item != null) __obj.updateDynamic("item")(item)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[LegendItemMouseLeftButtonDownEventUIParam]
  }
}

