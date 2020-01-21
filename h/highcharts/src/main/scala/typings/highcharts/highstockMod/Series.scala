package typings.highcharts.highstockMod

import typings.highcharts.mod.SeriesOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highstock", "Series")
@js.native
class Series protected ()
  extends typings.highcharts.mod.Series {
  /**
    * This is the base series prototype that all other series types inherit
    * from. A new series is initialized either through the series option
    * structure, or after the chart is initialized, through
    * Highcharts.Chart#addSeries.
    *
    * The object can be accessed in a number of ways. All series and point
    * event handlers give a reference to the `series` object. The chart object
    * has a series property that is a collection of all the chart's series. The
    * point objects and axis objects also have the same reference.
    *
    * Another way to reference the series programmatically is by `id`. Add an
    * id in the series configuration options, and get the series object by
    * Highcharts.Chart#get.
    *
    * Configuration options for the series are given in three levels. Options
    * for all series in a chart are given in the plotOptions.series object.
    * Then options for all series of a specific type are given in the
    * plotOptions of that type, for example `plotOptions.line`. Next, options
    * for one single series are given in the series array, or as arguments to
    * `chart.addSeries`.
    *
    * The data in the series is stored in various arrays.
    *
    * - First, `series.options.data` contains all the original config options
    * for each point whether added by options or methods like
    * `series.addPoint`.
    *
    * - Next, `series.data` contains those values converted to points, but in
    * case the series data length exceeds the `cropThreshold`, or if the data
    * is grouped, `series.data` doesn't contain all the points. It only
    * contains the points that have been created on demand.
    *
    * - Then there's `series.points` that contains all currently visible point
    * objects. In case of cropping, the cropped-away points are not part of
    * this array. The `series.points` array starts at `series.cropStart`
    * compared to `series.data` and `series.options.data`. If however the
    * series data is grouped, these can't be correlated one to one.
    *
    * - `series.xData` and `series.processedXData` contain clean x values,
    * equivalent to `series.data` and `series.points`.
    *
    * - `series.yData` and `series.processedYData` contain clean y values,
    * equivalent to `series.data` and `series.points`.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        The series options.
    */
  def this(chart: typings.highcharts.mod.Chart_, options: js.Object) = this()
  def this(chart: typings.highcharts.mod.Chart_, options: SeriesOptionsType) = this()
}

