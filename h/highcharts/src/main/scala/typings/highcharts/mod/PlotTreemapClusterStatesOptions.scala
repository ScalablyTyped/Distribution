package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotTreemapClusterStatesHoverOptions] = js.native
}

object PlotTreemapClusterStatesOptions {
  @scala.inline
  def apply(): PlotTreemapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapClusterStatesOptions]
  }
  @scala.inline
  implicit class PlotTreemapClusterStatesOptionsOps[Self <: PlotTreemapClusterStatesOptions] (val x: Self) extends AnyVal {
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
    def setHover(value: PlotTreemapClusterStatesHoverOptions): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
  }
  
}

