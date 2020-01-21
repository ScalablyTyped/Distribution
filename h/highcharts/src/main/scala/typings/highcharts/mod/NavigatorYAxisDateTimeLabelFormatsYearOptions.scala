package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisDateTimeLabelFormatsYearOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object NavigatorYAxisDateTimeLabelFormatsYearOptions {
  @scala.inline
  def apply(main: String = null): NavigatorYAxisDateTimeLabelFormatsYearOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisDateTimeLabelFormatsYearOptions]
  }
}

