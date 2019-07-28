package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsDayOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object YAxisDateTimeLabelFormatsDayOptions {
  @scala.inline
  def apply(main: String = null): YAxisDateTimeLabelFormatsDayOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsDayOptions]
  }
}

