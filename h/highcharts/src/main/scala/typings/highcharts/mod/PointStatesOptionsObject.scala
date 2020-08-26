package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointStatesOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PointStatesHoverOptionsObject] = js.native
  /**
    * (Highcharts) The opposite state of a hover for a single point node.
    * Applied to all not connected nodes to the hovered one.
    */
  var inactive: js.UndefOr[PointStatesInactiveOptionsObject] = js.native
  /**
    * (Highcharts, Highstock) The normal state of a single point marker.
    * Currently only used for setting animation when returning to normal state
    * from hover.
    */
  var normal: js.UndefOr[PointStatesNormalOptionsObject] = js.native
  /**
    * (Highcharts, Highstock) The appearance of the point marker when selected.
    * In order to allow a point to be selected, set the
    * `series.allowPointSelect` option to true.
    */
  var select: js.UndefOr[PointStatesSelectOptionsObject] = js.native
}

object PointStatesOptionsObject {
  @scala.inline
  def apply(): PointStatesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesOptionsObject]
  }
  @scala.inline
  implicit class PointStatesOptionsObjectOps[Self <: PointStatesOptionsObject] (val x: Self) extends AnyVal {
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
    def setHover(value: PointStatesHoverOptionsObject): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setInactive(value: PointStatesInactiveOptionsObject): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    @scala.inline
    def setNormal(value: PointStatesNormalOptionsObject): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    @scala.inline
    def setSelect(value: PointStatesSelectOptionsObject): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

