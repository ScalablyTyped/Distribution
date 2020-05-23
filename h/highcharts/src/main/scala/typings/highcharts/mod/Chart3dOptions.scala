package typings.highcharts.mod

import typings.highcharts.highchartsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart3dOptions extends js.Object {
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Set it to `"auto"` to automatically move the labels to the
    * best edge.
    */
  var axisLabelPosition: js.UndefOr[auto | Null] = js.undefined
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var beta: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The total depth of the chart.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Wether to render the chart using the 3D functionality.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Whether the 3d box should automatically adjust to the chart
    * plot area.
    */
  var fitToPlot: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Provides the option to draw a frame around the charts by
    * defining a bottom, front and back panel.
    */
  var frame: js.UndefOr[Chart3dFrameOptions] = js.undefined
  /**
    * (Highcharts) Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective effect in
    * column and scatter charts. It is not used for 3D pie charts.
    */
  var viewDistance: js.UndefOr[Double] = js.undefined
}

object Chart3dOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    axisLabelPosition: js.UndefOr[Null | auto] = js.undefined,
    beta: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fitToPlot: js.UndefOr[Boolean] = js.undefined,
    frame: Chart3dFrameOptions = null,
    viewDistance: js.UndefOr[Double] = js.undefined
  ): Chart3dOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLabelPosition)) __obj.updateDynamic("axisLabelPosition")(axisLabelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(beta)) __obj.updateDynamic("beta")(beta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToPlot)) __obj.updateDynamic("fitToPlot")(fitToPlot.get.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(viewDistance)) __obj.updateDynamic("viewDistance")(viewDistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart3dOptions]
  }
}

