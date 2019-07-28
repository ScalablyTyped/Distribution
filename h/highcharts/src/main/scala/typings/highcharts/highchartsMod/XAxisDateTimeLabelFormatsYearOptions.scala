package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsYearOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object XAxisDateTimeLabelFormatsYearOptions {
  @scala.inline
  def apply(main: String = null): XAxisDateTimeLabelFormatsYearOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsYearOptions]
  }
}

