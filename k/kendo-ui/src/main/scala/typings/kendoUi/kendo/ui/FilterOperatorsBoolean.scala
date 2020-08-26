package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOperatorsBoolean extends js.Object {
  @JSName("eq")
  var eq_FFilterOperatorsBoolean: js.UndefOr[String] = js.native
  var neq: js.UndefOr[String] = js.native
}

object FilterOperatorsBoolean {
  @scala.inline
  def apply(): FilterOperatorsBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperatorsBoolean]
  }
  @scala.inline
  implicit class FilterOperatorsBooleanOps[Self <: FilterOperatorsBoolean] (val x: Self) extends AnyVal {
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
    def setEq(value: String): Self = this.set("eq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEq: Self = this.set("eq", js.undefined)
    @scala.inline
    def setNeq(value: String): Self = this.set("neq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeq: Self = this.set("neq", js.undefined)
  }
  
}

