package typings.highcharts.accessibilityMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptionsObject extends js.Object {
  var accessibility: js.UndefOr[PointAccessibilityOptionsObject] = js.undefined
}

object PointOptionsObject {
  @scala.inline
  def apply(accessibility: PointAccessibilityOptionsObject = null): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptionsObject]
  }
}

