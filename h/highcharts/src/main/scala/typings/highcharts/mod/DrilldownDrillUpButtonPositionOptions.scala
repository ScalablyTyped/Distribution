package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrilldownDrillUpButtonPositionOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Horizontal alignment.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highmaps) Vertical alignment of the button.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts, Highmaps) The X offset of the button.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highmaps) The Y offset of the button.
    */
  var y: js.UndefOr[Double] = js.native
}

object DrilldownDrillUpButtonPositionOptions {
  @scala.inline
  def apply(): DrilldownDrillUpButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownDrillUpButtonPositionOptions]
  }
  @scala.inline
  implicit class DrilldownDrillUpButtonPositionOptionsOps[Self <: DrilldownDrillUpButtonPositionOptions] (val x: Self) extends AnyVal {
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

