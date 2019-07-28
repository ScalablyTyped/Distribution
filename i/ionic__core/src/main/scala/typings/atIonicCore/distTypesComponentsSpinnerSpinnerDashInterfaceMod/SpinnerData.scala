package typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerData extends js.Object {
  var r: js.UndefOr[Double] = js.undefined
  var style: js.Any
  var y1: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object SpinnerData {
  @scala.inline
  def apply(style: js.Any, r: Int | Double = null, y1: Int | Double = null, y2: Int | Double = null): SpinnerData = {
    val __obj = js.Dynamic.literal(style = style)
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerData]
  }
}

