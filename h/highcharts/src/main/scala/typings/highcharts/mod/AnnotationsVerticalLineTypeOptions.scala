package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsVerticalLineTypeOptions extends js.Object {
  /**
    * (Highstock) Connector options.
    */
  var connector: js.UndefOr[AnnotationsVerticalLineTypeConnectorOptions] = js.native
  /**
    * (Highstock) Label options.
    */
  var label: js.UndefOr[AnnotationsVerticalLineTypeLabelOptions] = js.native
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsVerticalLineTypeLineOptions] = js.native
  var points: js.UndefOr[js.Array[AnnotationsVerticalLineTypePointsOptions]] = js.native
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

object AnnotationsVerticalLineTypeOptions {
  @scala.inline
  def apply(): AnnotationsVerticalLineTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsVerticalLineTypeOptions]
  }
  @scala.inline
  implicit class AnnotationsVerticalLineTypeOptionsOps[Self <: AnnotationsVerticalLineTypeOptions] (val x: Self) extends AnyVal {
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
    def setConnector(value: AnnotationsVerticalLineTypeConnectorOptions): Self = this.set("connector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    @scala.inline
    def setLabel(value: AnnotationsVerticalLineTypeLabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLine(value: AnnotationsVerticalLineTypeLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPointsVarargs(value: AnnotationsVerticalLineTypePointsOptions*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[AnnotationsVerticalLineTypePointsOptions]): Self = this.set("points", value.asInstanceOf[js.Any])
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

