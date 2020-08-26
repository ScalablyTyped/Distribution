package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesStatesHoverHaloOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) A collection of SVG attributes to override the
    * appearance of the halo, for example `fill`, `stroke` and `stroke-width`.
    */
  var attributes: js.UndefOr[PlotTilemapStatesHoverHaloAttributesOptions | SVGAttributes] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
    * overridden using the `attributes` setting. Note that Highcharts is only
    * able to apply opacity to colors of hex or rgb(a) formats.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The pixel size of the halo. For point markers
    * this is the radius of the halo. For pie slices it is the width of the
    * halo outside the slice. For bubbles it defaults to 5 and is the width of
    * the halo outside the bubble.
    */
  var size: js.UndefOr[Double] = js.native
}

object SeriesStatesHoverHaloOptionsObject {
  @scala.inline
  def apply(): SeriesStatesHoverHaloOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesHoverHaloOptionsObject]
  }
  @scala.inline
  implicit class SeriesStatesHoverHaloOptionsObjectOps[Self <: SeriesStatesHoverHaloOptionsObject] (val x: Self) extends AnyVal {
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
    def setAttributes(value: PlotTilemapStatesHoverHaloAttributesOptions | SVGAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

