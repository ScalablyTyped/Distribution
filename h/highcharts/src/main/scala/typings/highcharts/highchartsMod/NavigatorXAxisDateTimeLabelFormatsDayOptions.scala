package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object NavigatorXAxisDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(main: String = null): NavigatorXAxisDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorXAxisDateTimeLabelFormatsDayOptions]
  }
}

