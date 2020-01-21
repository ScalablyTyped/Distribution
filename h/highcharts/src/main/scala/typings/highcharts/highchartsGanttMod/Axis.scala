package typings.highcharts.highchartsGanttMod

import typings.highcharts.mod.AxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highcharts-gantt", "Axis")
@js.native
class Axis protected ()
  extends typings.highcharts.mod.Axis {
  /**
    * Create a new axis object. Called internally when instanciating a new
    * chart or adding axes by Highcharts.Chart#addAxis.
    *
    * A chart can have from 0 axes (pie chart) to multiples. In a normal,
    * single series cartesian chart, there is one X axis and one Y axis.
    *
    * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
    * array of Axis objects. If there is only one axis, it can be referenced
    * through `chart.xAxis[0]`, and multiple axes have increasing indices. The
    * same pattern goes for Y axes.
    *
    * If you need to get the axes from a series object, use the `series.xAxis`
    * and `series.yAxis` properties. These are not arrays, as one series can
    * only be associated to one X and one Y axis.
    *
    * A third way to reference the axis programmatically is by `id`. Add an
    * `id` in the axis configuration options, and get the axis by
    * Highcharts.Chart#get.
    *
    * Configuration options for the axes are given in options.xAxis and
    * options.yAxis.
    *
    * @param chart
    *        The Chart instance to apply the axis on.
    *
    * @param options
    *        Axis options.
    */
  def this(chart: typings.highcharts.mod.Chart_, options: AxisOptions) = this()
}

