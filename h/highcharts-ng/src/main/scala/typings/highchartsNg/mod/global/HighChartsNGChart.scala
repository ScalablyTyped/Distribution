package typings.highchartsNg.mod.global

import typings.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Instantiated Chart
@js.native
trait HighChartsNGChart extends HighChartsNGConfig {
  //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
  def getHighcharts(): js.Any = js.native
}

object HighChartsNGChart {
  @scala.inline
  def apply(getHighcharts: () => js.Any, options: Options): HighChartsNGChart = {
    val __obj = js.Dynamic.literal(getHighcharts = js.Any.fromFunction0(getHighcharts), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighChartsNGChart]
  }
  @scala.inline
  implicit class HighChartsNGChartOps[Self <: HighChartsNGChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetHighcharts(value: () => js.Any): Self = this.set("getHighcharts", js.Any.fromFunction0(value))
  }
  
}

