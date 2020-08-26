package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsSimpleShapesOptions extends js.Object {
  var circle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesCircleOptions] = js.native
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var label: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesLabelOptions] = js.native
  var rectangle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesRectangleOptions] = js.native
}

object StockToolsGuiDefinitionsSimpleShapesOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsSimpleShapesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsSimpleShapesOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsSimpleShapesOptionsOps[Self <: StockToolsGuiDefinitionsSimpleShapesOptions] (val x: Self) extends AnyVal {
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
    def setCircle(value: StockToolsGuiDefinitionsSimpleShapesCircleOptions): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLabel(value: StockToolsGuiDefinitionsSimpleShapesLabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRectangle(value: StockToolsGuiDefinitionsSimpleShapesRectangleOptions): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
  }
  
}

