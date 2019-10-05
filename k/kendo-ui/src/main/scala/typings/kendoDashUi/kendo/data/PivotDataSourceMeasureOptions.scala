package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDataSourceMeasureOptions extends js.Object {
  var axis: js.UndefOr[String] = js.undefined
  var values: js.Array[String]
}

object PivotDataSourceMeasureOptions {
  @scala.inline
  def apply(values: js.Array[String], axis: String = null): PivotDataSourceMeasureOptions = {
    val __obj = js.Dynamic.literal(values = values)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    __obj.asInstanceOf[PivotDataSourceMeasureOptions]
  }
}

