package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomableMousewheel extends js.Object {
  var lock: js.UndefOr[String] = js.undefined
}

object ChartZoomableMousewheel {
  @scala.inline
  def apply(lock: String = null): ChartZoomableMousewheel = {
    val __obj = js.Dynamic.literal()
    if (lock != null) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartZoomableMousewheel]
  }
}

