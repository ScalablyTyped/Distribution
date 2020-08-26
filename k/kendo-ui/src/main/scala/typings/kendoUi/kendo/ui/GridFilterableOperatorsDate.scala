package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFilterableOperatorsDate extends js.Object {
  @JSName("eq")
  var eq_FGridFilterableOperatorsDate: js.UndefOr[String] = js.native
  var gt: js.UndefOr[String] = js.native
  var gte: js.UndefOr[String] = js.native
  var isnotnull: js.UndefOr[String] = js.native
  var isnull: js.UndefOr[String] = js.native
  var lt: js.UndefOr[String] = js.native
  var lte: js.UndefOr[String] = js.native
  var neq: js.UndefOr[String] = js.native
}

object GridFilterableOperatorsDate {
  @scala.inline
  def apply(): GridFilterableOperatorsDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterableOperatorsDate]
  }
  @scala.inline
  implicit class GridFilterableOperatorsDateOps[Self <: GridFilterableOperatorsDate] (val x: Self) extends AnyVal {
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
    def setGt(value: String): Self = this.set("gt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    @scala.inline
    def setGte(value: String): Self = this.set("gte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGte: Self = this.set("gte", js.undefined)
    @scala.inline
    def setIsnotnull(value: String): Self = this.set("isnotnull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsnotnull: Self = this.set("isnotnull", js.undefined)
    @scala.inline
    def setIsnull(value: String): Self = this.set("isnull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsnull: Self = this.set("isnull", js.undefined)
    @scala.inline
    def setLt(value: String): Self = this.set("lt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    @scala.inline
    def setLte(value: String): Self = this.set("lte", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLte: Self = this.set("lte", js.undefined)
    @scala.inline
    def setNeq(value: String): Self = this.set("neq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeq: Self = this.set("neq", js.undefined)
  }
  
}

