package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOrganizationDataLabelsOptions extends js.Object {
  var style: js.UndefOr[js.Any] = js.undefined
}

object PlotOrganizationDataLabelsOptions {
  @scala.inline
  def apply(style: js.Any = null): PlotOrganizationDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOrganizationDataLabelsOptions]
  }
}

