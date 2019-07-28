package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object XAxisDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(main: String = null): XAxisDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsDayOptions]
  }
}

