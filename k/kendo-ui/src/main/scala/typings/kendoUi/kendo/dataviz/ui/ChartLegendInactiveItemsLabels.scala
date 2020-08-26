package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegendInactiveItemsLabels extends js.Object {
  var color: js.UndefOr[String] = js.native
  var font: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
}

object ChartLegendInactiveItemsLabels {
  @scala.inline
  def apply(): ChartLegendInactiveItemsLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendInactiveItemsLabels]
  }
  @scala.inline
  implicit class ChartLegendInactiveItemsLabelsOps[Self <: ChartLegendInactiveItemsLabels] (val x: Self) extends AnyVal {
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
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

