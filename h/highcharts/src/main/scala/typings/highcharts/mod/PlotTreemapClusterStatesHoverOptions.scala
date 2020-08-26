package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapClusterStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) The fill color of the cluster marker in hover
    * state. When `undefined`, the series' or point's fillColor for normal
    * state is used.
    */
  var fillColor: js.UndefOr[ColorType] = js.native
}

object PlotTreemapClusterStatesHoverOptions {
  @scala.inline
  def apply(): PlotTreemapClusterStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapClusterStatesHoverOptions]
  }
  @scala.inline
  implicit class PlotTreemapClusterStatesHoverOptionsOps[Self <: PlotTreemapClusterStatesHoverOptions] (val x: Self) extends AnyVal {
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
    def setFillColor(value: ColorType): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
  }
  
}

