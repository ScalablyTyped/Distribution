package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesDefaultsStack extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object SparklineSeriesDefaultsStack {
  @scala.inline
  def apply(`type`: String = null): SparklineSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SparklineSeriesDefaultsStack]
  }
}

