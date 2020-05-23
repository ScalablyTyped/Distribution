package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphDataLabelsStyleOptions extends js.Object {
  var transition: js.UndefOr[String] = js.undefined
}

object PlotNetworkgraphDataLabelsStyleOptions {
  @scala.inline
  def apply(transition: String = null): PlotNetworkgraphDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphDataLabelsStyleOptions]
  }
}

