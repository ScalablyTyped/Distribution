package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapTraverseUpButtonPositionOptions extends js.Object {
  /**
    * (Highcharts) Horizontal alignment of the button.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts) Vertical alignment of the button.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts) Horizontal offset of the button.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Vertical offset of the button.
    */
  var y: js.UndefOr[Double] = js.native
}

object PlotTreemapTraverseUpButtonPositionOptions {
  @scala.inline
  def apply(): PlotTreemapTraverseUpButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonPositionOptions]
  }
  @scala.inline
  implicit class PlotTreemapTraverseUpButtonPositionOptionsOps[Self <: PlotTreemapTraverseUpButtonPositionOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

