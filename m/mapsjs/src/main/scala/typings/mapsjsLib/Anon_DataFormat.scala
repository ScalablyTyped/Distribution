package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataFormat extends js.Object {
  var dataFormat: js.UndefOr[java.lang.String] = js.undefined
  var maxAvailableZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var timeoutMs: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DataFormat {
  @scala.inline
  def apply(
    dataFormat: java.lang.String = null,
    maxAvailableZoomLevel: scala.Int | scala.Double = null,
    timeoutMs: scala.Int | scala.Double = null
  ): Anon_DataFormat = {
    val __obj = js.Dynamic.literal()
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (maxAvailableZoomLevel != null) __obj.updateDynamic("maxAvailableZoomLevel")(maxAvailableZoomLevel.asInstanceOf[js.Any])
    if (timeoutMs != null) __obj.updateDynamic("timeoutMs")(timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataFormat]
  }
}

