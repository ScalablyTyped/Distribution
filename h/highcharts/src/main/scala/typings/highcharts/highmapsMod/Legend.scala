package typings.highcharts.highmapsMod

import typings.highcharts.mod.LegendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highmaps", "Legend")
@js.native
class Legend protected ()
  extends typings.highcharts.mod.Legend {
  /**
    * The overview of the chart's series. The legend object is instanciated
    * internally in the chart constructor, and is available from the
    * `chart.legend` property. Each chart has only one legend.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        Legend options.
    */
  def this(chart: typings.highcharts.mod.Chart_, options: LegendOptions) = this()
}
