package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMaplineStatesNormalOptions extends js.Object {
  /**
    * (Highmaps) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean] = js.undefined
}

object PlotMaplineStatesNormalOptions {
  @scala.inline
  def apply(animation: js.UndefOr[Boolean] = js.undefined): PlotMaplineStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    __obj.asInstanceOf[PlotMaplineStatesNormalOptions]
  }
}

