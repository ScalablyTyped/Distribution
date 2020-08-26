package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesStatesOptionsObject extends js.Object {
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[SeriesStatesHoverOptionsObject] = js.native
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[SeriesStatesInactiveOptionsObject] = js.native
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[SeriesStatesNormalOptionsObject] = js.native
  /**
    * (Highstock) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[SeriesStatesSelectOptionsObject] = js.native
}

object SeriesStatesOptionsObject {
  @scala.inline
  def apply(): SeriesStatesOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesOptionsObject]
  }
  @scala.inline
  implicit class SeriesStatesOptionsObjectOps[Self <: SeriesStatesOptionsObject] (val x: Self) extends AnyVal {
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
    def setHover(value: SeriesStatesHoverOptionsObject): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setInactive(value: SeriesStatesInactiveOptionsObject): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    @scala.inline
    def setNormal(value: SeriesStatesNormalOptionsObject): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    @scala.inline
    def setSelect(value: SeriesStatesSelectOptionsObject): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

