package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshCompletedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
}

object RefreshCompletedEventUIParam {
  @scala.inline
  def apply(chart: js.Any = null): RefreshCompletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart)
    __obj.asInstanceOf[RefreshCompletedEventUIParam]
  }
}

