package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnComboBoxColumn extends js.Object {
  var field: js.UndefOr[String] = js.native
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
  var title: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object MultiColumnComboBoxColumn {
  @scala.inline
  def apply(): MultiColumnComboBoxColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnComboBoxColumn]
  }
  @scala.inline
  implicit class MultiColumnComboBoxColumnOps[Self <: MultiColumnComboBoxColumn] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

