package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBubbleJitterOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The maximal X offset for the random jitter
    * effect.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The maximal Y offset for the random jitter
    * effect.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PlotBubbleJitterOptions {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): PlotBubbleJitterOptions = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBubbleJitterOptions]
  }
}

