package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVbpVolumeDivisionStylesOptions extends js.Object {
  /**
    * (Highstock) Color of negative volume bars.
    */
  var negativeColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Color of positive volume bars.
    */
  var positiveColor: js.UndefOr[ColorString] = js.undefined
}

object PlotVbpVolumeDivisionStylesOptions {
  @scala.inline
  def apply(negativeColor: ColorString = null, positiveColor: ColorString = null): PlotVbpVolumeDivisionStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (positiveColor != null) __obj.updateDynamic("positiveColor")(positiveColor)
    __obj.asInstanceOf[PlotVbpVolumeDivisionStylesOptions]
  }
}

