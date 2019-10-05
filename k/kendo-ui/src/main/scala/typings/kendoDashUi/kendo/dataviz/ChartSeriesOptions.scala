package typings.kendoDashUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object ChartSeriesOptions {
  @scala.inline
  def apply(name: String = null): ChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChartSeriesOptions]
  }
}

