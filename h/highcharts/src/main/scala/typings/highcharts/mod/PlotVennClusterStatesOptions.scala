package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVennClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotVennClusterStatesHoverOptions] = js.native
}

object PlotVennClusterStatesOptions {
  @scala.inline
  def apply(): PlotVennClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVennClusterStatesOptions]
  }
  @scala.inline
  implicit class PlotVennClusterStatesOptionsOps[Self <: PlotVennClusterStatesOptions] (val x: Self) extends AnyVal {
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
    def setHover(value: PlotVennClusterStatesHoverOptions): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
  }
  
}

