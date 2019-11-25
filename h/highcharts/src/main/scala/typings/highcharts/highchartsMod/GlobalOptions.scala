package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path to the pattern image
    * required by VML browsers in order to draw radial gradients.
    */
  var VMLRadialGradientURL: js.UndefOr[String] = js.undefined
}

object GlobalOptions {
  @scala.inline
  def apply(VMLRadialGradientURL: String = null): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    if (VMLRadialGradientURL != null) __obj.updateDynamic("VMLRadialGradientURL")(VMLRadialGradientURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalOptions]
  }
}

