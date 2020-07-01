package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleParentNodeOptions extends js.Object {
  /**
    * (Highcharts) Allow this series' parent nodes to be selected by clicking
    * on the graph.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.undefined
}

object PlotPackedbubbleParentNodeOptions {
  @scala.inline
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined): PlotPackedbubbleParentNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPointSelect)) __obj.updateDynamic("allowPointSelect")(allowPointSelect.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleParentNodeOptions]
  }
}

