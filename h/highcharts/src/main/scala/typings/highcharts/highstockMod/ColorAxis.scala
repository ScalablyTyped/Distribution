package typings.highcharts.highstockMod

import typings.highcharts.mod.ColorAxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highstock", "ColorAxis")
@js.native
class ColorAxis protected ()
  extends typings.highcharts.mod.ColorAxis {
  /**
    * The ColorAxis object for inclusion in gradient legends.
    *
    * @param chart
    *        The related chart of the color axis.
    *
    * @param userOptions
    *        The color axis options for initialization.
    */
  def this(chart: typings.highcharts.mod.Chart_, userOptions: ColorAxisOptions) = this()
}

