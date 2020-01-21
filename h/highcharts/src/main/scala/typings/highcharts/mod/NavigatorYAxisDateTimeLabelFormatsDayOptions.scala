package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object NavigatorYAxisDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(main: String = null): NavigatorYAxisDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisDateTimeLabelFormatsDayOptions]
  }
}

