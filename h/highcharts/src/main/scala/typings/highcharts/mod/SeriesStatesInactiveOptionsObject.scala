package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesStatesInactiveOptionsObject extends js.Object {
  /**
    * (Highstock) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highstock) Enable or disable the inactive state for a series
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram in
    * inactive mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Opacity of series elements (dataLabels, line, area).
    */
  var opacity: js.UndefOr[Double] = js.native
}

object SeriesStatesInactiveOptionsObject {
  @scala.inline
  def apply(): SeriesStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesInactiveOptionsObject]
  }
  @scala.inline
  implicit class SeriesStatesInactiveOptionsObjectOps[Self <: SeriesStatesInactiveOptionsObject] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setLinkOpacity(value: Double): Self = this.set("linkOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkOpacity: Self = this.set("linkOpacity", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

