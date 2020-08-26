package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsLinesOptions extends js.Object {
  var arrowLine: js.UndefOr[StockToolsGuiDefinitionsLinesArrowLineOptions] = js.native
  var arrowRay: js.UndefOr[StockToolsGuiDefinitionsLinesArrowRayOptions] = js.native
  var arrowSegment: js.UndefOr[StockToolsGuiDefinitionsLinesArrowSegmentOptions] = js.native
  var horizontalLine: js.UndefOr[StockToolsGuiDefinitionsLinesHorizontalLineOptions] = js.native
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var line: js.UndefOr[StockToolsGuiDefinitionsLinesLineOptions] = js.native
  var ray: js.UndefOr[StockToolsGuiDefinitionsLinesRayOptions] = js.native
  var segment: js.UndefOr[StockToolsGuiDefinitionsLinesSegmentOptions] = js.native
  var verticalLine: js.UndefOr[StockToolsGuiDefinitionsLinesVerticalLineOptions] = js.native
}

object StockToolsGuiDefinitionsLinesOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsLinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsLinesOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsLinesOptionsOps[Self <: StockToolsGuiDefinitionsLinesOptions] (val x: Self) extends AnyVal {
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
    def setArrowLine(value: StockToolsGuiDefinitionsLinesArrowLineOptions): Self = this.set("arrowLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLine: Self = this.set("arrowLine", js.undefined)
    @scala.inline
    def setArrowRay(value: StockToolsGuiDefinitionsLinesArrowRayOptions): Self = this.set("arrowRay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRay: Self = this.set("arrowRay", js.undefined)
    @scala.inline
    def setArrowSegment(value: StockToolsGuiDefinitionsLinesArrowSegmentOptions): Self = this.set("arrowSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowSegment: Self = this.set("arrowSegment", js.undefined)
    @scala.inline
    def setHorizontalLine(value: StockToolsGuiDefinitionsLinesHorizontalLineOptions): Self = this.set("horizontalLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalLine: Self = this.set("horizontalLine", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLine(value: StockToolsGuiDefinitionsLinesLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setRay(value: StockToolsGuiDefinitionsLinesRayOptions): Self = this.set("ray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRay: Self = this.set("ray", js.undefined)
    @scala.inline
    def setSegment(value: StockToolsGuiDefinitionsLinesSegmentOptions): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    @scala.inline
    def setVerticalLine(value: StockToolsGuiDefinitionsLinesVerticalLineOptions): Self = this.set("verticalLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLine: Self = this.set("verticalLine", js.undefined)
  }
  
}

