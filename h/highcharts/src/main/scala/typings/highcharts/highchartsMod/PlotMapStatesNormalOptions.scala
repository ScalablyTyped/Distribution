package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapStatesNormalOptions extends js.Object {
  /**
    * (Highmaps) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean] = js.undefined
}

object PlotMapStatesNormalOptions {
  @scala.inline
  def apply(animation: js.UndefOr[Boolean] = js.undefined): PlotMapStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapStatesNormalOptions]
  }
}

