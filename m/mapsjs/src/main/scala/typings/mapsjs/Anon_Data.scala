package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[js.Object]
  var dataFormat: js.UndefOr[String] = js.undefined
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.undefined
  var timeoutMs: js.UndefOr[Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    dataFormat: String = null,
    maxAvailableZoomLevel: Int | Double = null,
    timeoutMs: Int | Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data)
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (maxAvailableZoomLevel != null) __obj.updateDynamic("maxAvailableZoomLevel")(maxAvailableZoomLevel.asInstanceOf[js.Any])
    if (timeoutMs != null) __obj.updateDynamic("timeoutMs")(timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

