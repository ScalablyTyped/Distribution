package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinParamsOptions extends js.Object {
  /**
    * (Highstock) Periods for Chaikin Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotChaikinParamsOptions {
  @scala.inline
  def apply(periods: js.Array[Double] = null, volumeSeriesID: String = null): PlotChaikinParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (periods != null) __obj.updateDynamic("periods")(periods)
    if (volumeSeriesID != null) __obj.updateDynamic("volumeSeriesID")(volumeSeriesID)
    __obj.asInstanceOf[PlotChaikinParamsOptions]
  }
}

