package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipHiddenEventUIParam extends js.Object {
  /**
  	 * Used to get item brush.
  	 */
  var actualItemBrush: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get series brush.
  	 */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to tooltip DOM element.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current series item object.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.undefined
}

object TooltipHiddenEventUIParam {
  @scala.inline
  def apply(
    actualItemBrush: js.Any = null,
    actualSeriesBrush: js.Any = null,
    chart: js.Any = null,
    element: js.Any = null,
    item: js.Any = null,
    series: js.Any = null
  ): TooltipHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (actualItemBrush != null) __obj.updateDynamic("actualItemBrush")(actualItemBrush.asInstanceOf[js.Any])
    if (actualSeriesBrush != null) __obj.updateDynamic("actualSeriesBrush")(actualSeriesBrush.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipHiddenEventUIParam]
  }
}

