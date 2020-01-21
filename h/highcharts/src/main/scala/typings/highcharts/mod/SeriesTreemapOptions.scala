package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTreemapOptions extends js.Object {
  var data: js.UndefOr[SeriesTreemapDataOptions] = js.undefined
}

object SeriesTreemapOptions {
  @scala.inline
  def apply(data: SeriesTreemapDataOptions = null): SeriesTreemapOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTreemapOptions]
  }
}

