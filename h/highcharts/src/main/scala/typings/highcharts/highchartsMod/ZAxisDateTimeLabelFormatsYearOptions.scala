package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisDateTimeLabelFormatsYearOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object ZAxisDateTimeLabelFormatsYearOptions {
  @scala.inline
  def apply(main: String = null): ZAxisDateTimeLabelFormatsYearOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[ZAxisDateTimeLabelFormatsYearOptions]
  }
}

