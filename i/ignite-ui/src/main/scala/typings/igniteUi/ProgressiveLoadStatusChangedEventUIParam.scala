package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressiveLoadStatusChangedEventUIParam extends js.Object {
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get current status.
    */
  var currentStatus: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.undefined
}

object ProgressiveLoadStatusChangedEventUIParam {
  @scala.inline
  def apply(chart: js.Any = null, currentStatus: js.Any = null, series: js.Any = null): ProgressiveLoadStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (currentStatus != null) __obj.updateDynamic("currentStatus")(currentStatus.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressiveLoadStatusChangedEventUIParam]
  }
}

