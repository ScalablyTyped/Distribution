package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesClickEventSeries extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SparklineSeriesClickEventSeries {
  @scala.inline
  def apply(data: js.Any = null, name: String = null, `type`: String = null): SparklineSeriesClickEventSeries = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SparklineSeriesClickEventSeries]
  }
}

