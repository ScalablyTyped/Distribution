package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDataSourceMeasureOptions extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var values: js.Array[java.lang.String]
}

object PivotDataSourceMeasureOptions {
  @scala.inline
  def apply(values: js.Array[java.lang.String], axis: java.lang.String = null): PivotDataSourceMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("values")(values)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    __obj.asInstanceOf[PivotDataSourceMeasureOptions]
  }
}

