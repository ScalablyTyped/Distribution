package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesMouseEnterEventUIParam extends js.Object {
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
  	 * Used to get reference to current series item object.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get mouse X position.
  	 */
  var positionX: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get mouse Y position.
  	 */
  var positionY: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.undefined
}

object SeriesMouseEnterEventUIParam {
  @scala.inline
  def apply(
    actualItemBrush: js.Any = null,
    actualSeriesBrush: js.Any = null,
    chart: js.Any = null,
    item: js.Any = null,
    positionX: js.Any = null,
    positionY: js.Any = null,
    series: js.Any = null
  ): SeriesMouseEnterEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (actualItemBrush != null) __obj.updateDynamic("actualItemBrush")(actualItemBrush)
    if (actualSeriesBrush != null) __obj.updateDynamic("actualSeriesBrush")(actualSeriesBrush)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (item != null) __obj.updateDynamic("item")(item)
    if (positionX != null) __obj.updateDynamic("positionX")(positionX)
    if (positionY != null) __obj.updateDynamic("positionY")(positionY)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[SeriesMouseEnterEventUIParam]
  }
}

