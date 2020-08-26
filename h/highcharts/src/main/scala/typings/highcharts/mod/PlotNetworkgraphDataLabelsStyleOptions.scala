package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotNetworkgraphDataLabelsStyleOptions extends js.Object {
  var transition: js.UndefOr[String] = js.native
}

object PlotNetworkgraphDataLabelsStyleOptions {
  @scala.inline
  def apply(): PlotNetworkgraphDataLabelsStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphDataLabelsStyleOptions]
  }
  @scala.inline
  implicit class PlotNetworkgraphDataLabelsStyleOptionsOps[Self <: PlotNetworkgraphDataLabelsStyleOptions] (val x: Self) extends AnyVal {
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
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

