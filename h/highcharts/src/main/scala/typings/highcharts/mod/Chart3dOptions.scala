package typings.highcharts.mod

import typings.highcharts.highchartsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart3dOptions extends js.Object {
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Set it to `"auto"` to automatically move the labels to the
    * best edge.
    */
  var axisLabelPosition: js.UndefOr[auto | Null] = js.native
  /**
    * (Highcharts) One of the two rotation angles for the chart.
    */
  var beta: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The total depth of the chart.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Wether to render the chart using the 3D functionality.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether the 3d box should automatically adjust to the chart
    * plot area.
    */
  var fitToPlot: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Provides the option to draw a frame around the charts by
    * defining a bottom, front and back panel.
    */
  var frame: js.UndefOr[Chart3dFrameOptions] = js.native
  /**
    * (Highcharts) Defines the distance the viewer is standing in front of the
    * chart, this setting is important to calculate the perspective effect in
    * column and scatter charts. It is not used for 3D pie charts.
    */
  var viewDistance: js.UndefOr[Double] = js.native
}

object Chart3dOptions {
  @scala.inline
  def apply(): Chart3dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dOptions]
  }
  @scala.inline
  implicit class Chart3dOptionsOps[Self <: Chart3dOptions] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAxisLabelPosition(value: auto): Self = this.set("axisLabelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLabelPosition: Self = this.set("axisLabelPosition", js.undefined)
    @scala.inline
    def setAxisLabelPositionNull: Self = this.set("axisLabelPosition", null)
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeta: Self = this.set("beta", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFitToPlot(value: Boolean): Self = this.set("fitToPlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToPlot: Self = this.set("fitToPlot", js.undefined)
    @scala.inline
    def setFrame(value: Chart3dFrameOptions): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setViewDistance(value: Double): Self = this.set("viewDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewDistance: Self = this.set("viewDistance", js.undefined)
  }
  
}

