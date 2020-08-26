package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapTraverseUpButtonOptions extends js.Object {
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotTreemapTraverseUpButtonPositionOptions] = js.native
}

object PlotTreemapTraverseUpButtonOptions {
  @scala.inline
  def apply(): PlotTreemapTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonOptions]
  }
  @scala.inline
  implicit class PlotTreemapTraverseUpButtonOptionsOps[Self <: PlotTreemapTraverseUpButtonOptions] (val x: Self) extends AnyVal {
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
    def setPosition(value: PlotTreemapTraverseUpButtonPositionOptions): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

