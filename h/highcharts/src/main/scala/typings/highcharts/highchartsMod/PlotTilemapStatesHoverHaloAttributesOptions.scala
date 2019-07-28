package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTilemapStatesHoverHaloAttributesOptions extends js.Object {
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PlotTilemapStatesHoverHaloAttributesOptions {
  @scala.inline
  def apply(zIndex: Int | Double = null): PlotTilemapStatesHoverHaloAttributesOptions = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTilemapStatesHoverHaloAttributesOptions]
  }
}

