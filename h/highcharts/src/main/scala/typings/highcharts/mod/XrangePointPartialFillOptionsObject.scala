package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XrangePointPartialFillOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The amount of the X-range point to be
    * filled. Values can be 0-1 and are converted to percentages in the default
    * data label formatter.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The fill color to be used for partial
    * fills. Defaults to a darker shade of the point color.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
}

object XrangePointPartialFillOptionsObject {
  @scala.inline
  def apply(
    amount: js.UndefOr[Double] = js.undefined,
    fill: ColorString | GradientColorObject | PatternObject = null
  ): XrangePointPartialFillOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[XrangePointPartialFillOptionsObject]
  }
}

