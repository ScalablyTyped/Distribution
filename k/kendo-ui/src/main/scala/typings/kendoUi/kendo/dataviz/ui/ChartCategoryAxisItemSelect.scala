package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartCategoryAxisItemSelect extends js.Object {
  var from: js.UndefOr[js.Any] = js.native
  var max: js.UndefOr[js.Any] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var mousewheel: js.UndefOr[ChartCategoryAxisItemSelectMousewheel] = js.native
  var to: js.UndefOr[js.Any] = js.native
}

object ChartCategoryAxisItemSelect {
  @scala.inline
  def apply(): ChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCategoryAxisItemSelect]
  }
  @scala.inline
  implicit class ChartCategoryAxisItemSelectOps[Self <: ChartCategoryAxisItemSelect] (val x: Self) extends AnyVal {
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
    def setFrom(value: js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMousewheel(value: ChartCategoryAxisItemSelectMousewheel): Self = this.set("mousewheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMousewheel: Self = this.set("mousewheel", js.undefined)
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

