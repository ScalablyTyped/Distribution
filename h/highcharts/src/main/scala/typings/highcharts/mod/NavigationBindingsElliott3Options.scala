package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsElliott3Options extends js.Object {
  var start: js.UndefOr[js.Object] = js.undefined
}

object NavigationBindingsElliott3Options {
  @scala.inline
  def apply(start: js.Object = null): NavigationBindingsElliott3Options = {
    val __obj = js.Dynamic.literal()
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsElliott3Options]
  }
}

