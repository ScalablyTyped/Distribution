package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[js.Object]
  var dataFormat: js.UndefOr[String] = js.undefined
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined
  var timeoutMs: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    dataFormat: String = null,
    maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined,
    timeoutMs: js.UndefOr[Double] = js.undefined
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAvailableZoomLevel)) __obj.updateDynamic("maxAvailableZoomLevel")(maxAvailableZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutMs)) __obj.updateDynamic("timeoutMs")(timeoutMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

