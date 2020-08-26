package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewFilterable extends js.Object {
  var autoFilter: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var operator: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
}

object ListViewFilterable {
  @scala.inline
  def apply(): ListViewFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewFilterable]
  }
  @scala.inline
  implicit class ListViewFilterableOps[Self <: ListViewFilterable] (val x: Self) extends AnyVal {
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
    def setAutoFilter(value: Boolean): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}

