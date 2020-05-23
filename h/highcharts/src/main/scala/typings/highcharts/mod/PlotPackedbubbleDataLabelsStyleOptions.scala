package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleDataLabelsStyleOptions extends js.Object {
  var transition: js.UndefOr[String] = js.undefined
}

object PlotPackedbubbleDataLabelsStyleOptions {
  @scala.inline
  def apply(transition: String = null): PlotPackedbubbleDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleDataLabelsStyleOptions]
  }
}

