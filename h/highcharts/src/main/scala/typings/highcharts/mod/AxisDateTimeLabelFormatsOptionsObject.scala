package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisDateTimeLabelFormatsOptionsObject extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
}

object AxisDateTimeLabelFormatsOptionsObject {
  @scala.inline
  def apply(main: String = null, range: js.UndefOr[Boolean] = js.undefined): AxisDateTimeLabelFormatsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDateTimeLabelFormatsOptionsObject]
  }
}

