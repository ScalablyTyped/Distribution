package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFormat extends js.Object {
  var dataFormat: js.UndefOr[String] = js.undefined
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined
  var timeoutMs: js.UndefOr[Double] = js.undefined
}

object DataFormat {
  @scala.inline
  def apply(
    dataFormat: String = null,
    maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined,
    timeoutMs: js.UndefOr[Double] = js.undefined
  ): DataFormat = {
    val __obj = js.Dynamic.literal()
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAvailableZoomLevel)) __obj.updateDynamic("maxAvailableZoomLevel")(maxAvailableZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutMs)) __obj.updateDynamic("timeoutMs")(timeoutMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFormat]
  }
}

