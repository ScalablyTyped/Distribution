package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomableSelection extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var lock: js.UndefOr[String] = js.undefined
}

object ChartZoomableSelection {
  @scala.inline
  def apply(key: String = null, lock: String = null): ChartZoomableSelection = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lock != null) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartZoomableSelection]
  }
}

