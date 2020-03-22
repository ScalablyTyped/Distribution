package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsFullScreenOptions extends js.Object {
  var init: js.UndefOr[js.Object] = js.undefined
}

object NavigationBindingsFullScreenOptions {
  @scala.inline
  def apply(init: js.Object = null): NavigationBindingsFullScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsFullScreenOptions]
  }
}

