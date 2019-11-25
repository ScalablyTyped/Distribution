package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object ZAxisDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(main: String = null): ZAxisDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAxisDateTimeLabelFormatsDayOptions]
  }
}

