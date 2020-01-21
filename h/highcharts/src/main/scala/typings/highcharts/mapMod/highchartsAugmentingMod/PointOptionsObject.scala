package typings.highcharts.mapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptionsObject extends js.Object {
  var pointPadding: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double | Null] = js.undefined
}

object PointOptionsObject {
  @scala.inline
  def apply(pointPadding: Int | Double = null, value: Int | Double = null): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptionsObject]
  }
}

