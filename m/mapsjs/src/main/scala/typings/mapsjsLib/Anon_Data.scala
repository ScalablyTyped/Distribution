package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[js.Object]
  var dataFormat: js.UndefOr[java.lang.String] = js.undefined
  var maxAvailableZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var timeoutMs: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    dataFormat: java.lang.String = null,
    maxAvailableZoomLevel: scala.Int | scala.Double = null,
    timeoutMs: scala.Int | scala.Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data)
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (maxAvailableZoomLevel != null) __obj.updateDynamic("maxAvailableZoomLevel")(maxAvailableZoomLevel.asInstanceOf[js.Any])
    if (timeoutMs != null) __obj.updateDynamic("timeoutMs")(timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

