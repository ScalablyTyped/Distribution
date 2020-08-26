package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPackedbubbleParentNodeOptions extends js.Object {
  /**
    * (Highcharts) Allow this series' parent nodes to be selected by clicking
    * on the graph.
    */
  var allowPointSelect: js.UndefOr[Boolean] = js.native
}

object PlotPackedbubbleParentNodeOptions {
  @scala.inline
  def apply(): PlotPackedbubbleParentNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleParentNodeOptions]
  }
  @scala.inline
  implicit class PlotPackedbubbleParentNodeOptionsOps[Self <: PlotPackedbubbleParentNodeOptions] (val x: Self) extends AnyVal {
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
    def setAllowPointSelect(value: Boolean): Self = this.set("allowPointSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPointSelect: Self = this.set("allowPointSelect", js.undefined)
  }
  
}

