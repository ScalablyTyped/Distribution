package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPyramid3dDataLabelsOptions extends js.Object {
  var verticalAlign: js.UndefOr[String] = js.undefined
}

object PlotPyramid3dDataLabelsOptions {
  @scala.inline
  def apply(verticalAlign: String = null): PlotPyramid3dDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[PlotPyramid3dDataLabelsOptions]
  }
}

