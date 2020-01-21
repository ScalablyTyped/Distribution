package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttConnectorsAnimationOptions extends js.Object {
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object PlotGanttConnectorsAnimationOptions {
  @scala.inline
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): PlotGanttConnectorsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGanttConnectorsAnimationOptions]
  }
}

