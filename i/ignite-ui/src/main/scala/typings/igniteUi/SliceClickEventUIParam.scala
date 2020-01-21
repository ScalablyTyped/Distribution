package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceClickEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to slice object.
  	 */
  var slice: js.UndefOr[js.Any] = js.undefined
}

object SliceClickEventUIParam {
  @scala.inline
  def apply(chart: js.Any = null, slice: js.Any = null): SliceClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceClickEventUIParam]
  }
}

