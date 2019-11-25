package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsMonthOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object XAxisDateTimeLabelFormatsMonthOptions {
  @scala.inline
  def apply(main: String = null): XAxisDateTimeLabelFormatsMonthOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsMonthOptions]
  }
}

