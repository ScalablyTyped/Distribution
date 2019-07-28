package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriangulationStatusChangedEventUIParam extends js.Object {
  /**
  	 * Used to get current status.
  	 */
  var currentStatus: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to map object.
  	 */
  var map: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.undefined
}

object TriangulationStatusChangedEventUIParam {
  @scala.inline
  def apply(currentStatus: js.Any = null, map: js.Any = null, series: js.Any = null): TriangulationStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentStatus != null) __obj.updateDynamic("currentStatus")(currentStatus)
    if (map != null) __obj.updateDynamic("map")(map)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[TriangulationStatusChangedEventUIParam]
  }
}

