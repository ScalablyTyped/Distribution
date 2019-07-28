package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsHourOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
}

object XAxisDateTimeLabelFormatsHourOptions {
  @scala.inline
  def apply(main: String = null, range: js.UndefOr[Boolean] = js.undefined): XAxisDateTimeLabelFormatsHourOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsHourOptions]
  }
}

