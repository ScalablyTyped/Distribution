package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTilemapStatesHoverHaloAttributesOptions extends js.Object {
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotTilemapStatesHoverHaloAttributesOptions {
  @scala.inline
  def apply(zIndex: js.UndefOr[Double] = js.undefined): PlotTilemapStatesHoverHaloAttributesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTilemapStatesHoverHaloAttributesOptions]
  }
}

