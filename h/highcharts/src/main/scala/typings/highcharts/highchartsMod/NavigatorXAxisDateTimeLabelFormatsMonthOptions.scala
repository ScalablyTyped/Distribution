package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisDateTimeLabelFormatsMonthOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object NavigatorXAxisDateTimeLabelFormatsMonthOptions {
  @scala.inline
  def apply(main: String = null): NavigatorXAxisDateTimeLabelFormatsMonthOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[NavigatorXAxisDateTimeLabelFormatsMonthOptions]
  }
}

