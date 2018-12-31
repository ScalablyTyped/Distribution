package typings
package highchartsDashNgLib.highchartsDashNgMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Instantiated Chart
trait HighChartsNGChart extends HighChartsNGConfig {
  //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
  def getHighcharts(): highchartsLib.highchartsMod.HighchartsNs.ChartObject
}

