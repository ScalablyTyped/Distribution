package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataFormat extends js.Object {
  var dataFormat: js.UndefOr[String] = js.undefined
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined
  var timeoutMs: js.UndefOr[Double] = js.undefined
}

object AnonDataFormat {
  @scala.inline
  def apply(
    dataFormat: String = null,
    maxAvailableZoomLevel: Int | Double = null,
    timeoutMs: Int | Double = null
  ): AnonDataFormat = {
    val __obj = js.Dynamic.literal()
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (maxAvailableZoomLevel != null) __obj.updateDynamic("maxAvailableZoomLevel")(maxAvailableZoomLevel.asInstanceOf[js.Any])
    if (timeoutMs != null) __obj.updateDynamic("timeoutMs")(timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataFormat]
  }
}

