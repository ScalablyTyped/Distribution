package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisDateTimeLabelFormatsWeekOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object XAxisDateTimeLabelFormatsWeekOptions {
  @scala.inline
  def apply(main: String = null): XAxisDateTimeLabelFormatsWeekOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisDateTimeLabelFormatsWeekOptions]
  }
}

