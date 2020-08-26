package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsTunnelTypeOptions extends js.Object {
  /**
    * (Highstock) Background options.
    */
  var background: js.UndefOr[js.Object | AnnotationsTunnelTypeBackgroundOptions] = js.native
  /**
    * (Highstock) The height of the annotation in terms of yAxis.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Options for the control point which controls the annotation's
    * height.
    */
  var heightControlPoint: js.UndefOr[AnnotationsTunnelTypeHeightControlPointOptions] = js.native
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsTunnelTypeLineOptions] = js.native
  var points: js.UndefOr[js.Array[AnnotationsTunnelTypePointsOptions]] = js.native
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}

object AnnotationsTunnelTypeOptions {
  @scala.inline
  def apply(): AnnotationsTunnelTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelTypeOptions]
  }
  @scala.inline
  implicit class AnnotationsTunnelTypeOptionsOps[Self <: AnnotationsTunnelTypeOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: js.Object | AnnotationsTunnelTypeBackgroundOptions): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightControlPoint(value: AnnotationsTunnelTypeHeightControlPointOptions): Self = this.set("heightControlPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightControlPoint: Self = this.set("heightControlPoint", js.undefined)
    @scala.inline
    def setLine(value: AnnotationsTunnelTypeLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPointsVarargs(value: AnnotationsTunnelTypePointsOptions*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[AnnotationsTunnelTypePointsOptions]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setXAxis(value: Double): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxis(value: Double): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
  
}

