package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemStack extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SparklineSeriesItemStack {
  @scala.inline
  def apply(group: String = null, `type`: String = null): SparklineSeriesItemStack = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SparklineSeriesItemStack]
  }
}

