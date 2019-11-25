package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoostOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If set to true, the whole chart
    * will be boosted if one of the series crosses its threshold, and all the
    * series can be boosted.
    */
  var allowForce: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Debugging options for boost.
    * Useful for benchmarking, and general timing.
    */
  var debug: js.UndefOr[BoostDebugOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable boost on a
    * chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the series threshold for
    * when the boost should kick in globally.
    *
    * Setting to e.g. 20 will cause the whole chart to enter boost mode if
    * there are 20 or more series active. When the chart is in boost mode,
    * every series in it will be rendered to a common canvas. This offers a
    * significant speed improvment in charts with a very high amount of series.
    */
  var seriesThreshold: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable GPU
    * translations. GPU translations are faster than doing the translation in
    * JavaScript.
    *
    * This option may cause rendering issues with certain datasets. Namely, if
    * your dataset has large numbers with small increments (such as
    * timestamps), it won't work correctly. This is due to floating point
    * precission.
    */
  var useGPUTranslations: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable pre-allocation
    * of vertex buffers.
    *
    * Enabling this will make it so that the binary data arrays required for
    * storing the series data will be allocated prior to transforming the data
    * to a WebGL-compatible format.
    *
    * This saves a copy operation on the order of O(n) and so is significantly
    * more performant. However, this is currently an experimental option, and
    * may cause visual artifacts with some datasets.
    *
    * As such, care should be taken when using this setting to make sure that
    * it doesn't cause any rendering glitches with the given use-case.
    */
  var usePreallocated: js.UndefOr[Boolean] = js.undefined
}

object BoostOptions {
  @scala.inline
  def apply(
    allowForce: js.UndefOr[Boolean] = js.undefined,
    debug: BoostDebugOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    seriesThreshold: Int | Double = null,
    useGPUTranslations: js.UndefOr[Boolean] = js.undefined,
    usePreallocated: js.UndefOr[Boolean] = js.undefined
  ): BoostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowForce)) __obj.updateDynamic("allowForce")(allowForce.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (seriesThreshold != null) __obj.updateDynamic("seriesThreshold")(seriesThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useGPUTranslations)) __obj.updateDynamic("useGPUTranslations")(useGPUTranslations.asInstanceOf[js.Any])
    if (!js.isUndefined(usePreallocated)) __obj.updateDynamic("usePreallocated")(usePreallocated.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoostOptions]
  }
}

