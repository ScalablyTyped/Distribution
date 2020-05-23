package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotLinearregressionangleParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Unit (in milliseconds) for the x axis distances used to
    * compute the regression line paramters (slope & intercept) for every
    * range. In Highstock the x axis values are always represented in
    * milliseconds which may cause that distances between points are "big"
    * integer numbers.
    *
    * Highstock's linear regression algorithm (least squares method) will
    * utilize these "big" integers for finding the slope and the intercept of
    * the regression line for each period. In consequence, this value may be a
    * very "small" decimal number that's hard to interpret by a human.
    *
    * For instance: `xAxisUnit` equealed to `86400000` ms (1 day) forces the
    * algorithm to treat `86400000` as `1` while computing the slope and the
    * intercept. This may enchance the legiblitity of the indicator's values.
    *
    * Default value is the closest distance between two data points.
    */
  var xAxisUnit: js.UndefOr[Double] = js.undefined
}

object PlotLinearregressionangleParamsOptions {
  @scala.inline
  def apply(
    index: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    xAxisUnit: js.UndefOr[Double] = js.undefined
  ): PlotLinearregressionangleParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisUnit)) __obj.updateDynamic("xAxisUnit")(xAxisUnit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLinearregressionangleParamsOptions]
  }
}

