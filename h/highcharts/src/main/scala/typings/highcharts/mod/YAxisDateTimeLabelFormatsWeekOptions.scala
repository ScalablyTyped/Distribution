package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsWeekOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object YAxisDateTimeLabelFormatsWeekOptions {
  @scala.inline
  def apply(main: String = null): YAxisDateTimeLabelFormatsWeekOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsWeekOptions]
  }
}

