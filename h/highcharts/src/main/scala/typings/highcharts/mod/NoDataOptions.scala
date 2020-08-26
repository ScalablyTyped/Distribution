package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoDataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) An object of additional SVG attributes for
    * the no-data label.
    */
  var attr: js.UndefOr[NoDataAttrOptions | SVGAttributes] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The position of the no-data label,
    * relative to the plot area.
    */
  var position: js.UndefOr[AlignObject | NoDataPositionOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) CSS styles for the no-data label.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to insert the label as HTML, or as
    * pseudo-HTML rendered with SVG.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
}

object NoDataOptions {
  @scala.inline
  def apply(): NoDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoDataOptions]
  }
  @scala.inline
  implicit class NoDataOptionsOps[Self <: NoDataOptions] (val x: Self) extends AnyVal {
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
    def setAttr(value: NoDataAttrOptions | SVGAttributes): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    @scala.inline
    def setPosition(value: AlignObject | NoDataPositionOptions): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUseHTML(value: Boolean): Self = this.set("useHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHTML: Self = this.set("useHTML", js.undefined)
  }
  
}

