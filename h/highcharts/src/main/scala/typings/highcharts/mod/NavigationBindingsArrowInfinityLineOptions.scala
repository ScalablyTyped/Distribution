package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsArrowInfinityLineOptions extends js.Object {
  var start: js.UndefOr[js.Object] = js.undefined
}

object NavigationBindingsArrowInfinityLineOptions {
  @scala.inline
  def apply(start: js.Object = null): NavigationBindingsArrowInfinityLineOptions = {
    val __obj = js.Dynamic.literal()
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsArrowInfinityLineOptions]
  }
}

