package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsMillisecondOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
}

object YAxisDateTimeLabelFormatsMillisecondOptions {
  @scala.inline
  def apply(main: String = null, range: js.UndefOr[Boolean] = js.undefined): YAxisDateTimeLabelFormatsMillisecondOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsMillisecondOptions]
  }
}

