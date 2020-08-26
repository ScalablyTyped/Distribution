package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotNetworkgraphLinkOptions extends js.Object {
  /**
    * (Highcharts) Color of the link between two nodes.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * (Highcharts) A name for the dash style to use for links.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Width (px) of the link between two nodes.
    */
  var width: js.UndefOr[Double] = js.native
}

object PlotNetworkgraphLinkOptions {
  @scala.inline
  def apply(): PlotNetworkgraphLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphLinkOptions]
  }
  @scala.inline
  implicit class PlotNetworkgraphLinkOptionsOps[Self <: PlotNetworkgraphLinkOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

