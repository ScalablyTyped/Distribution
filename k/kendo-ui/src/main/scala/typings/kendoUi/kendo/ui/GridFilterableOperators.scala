package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFilterableOperators extends js.Object {
  var date: js.UndefOr[GridFilterableOperatorsDate] = js.native
  var enums: js.UndefOr[GridFilterableOperatorsEnums] = js.native
  var number: js.UndefOr[GridFilterableOperatorsNumber] = js.native
  var string: js.UndefOr[GridFilterableOperatorsString] = js.native
}

object GridFilterableOperators {
  @scala.inline
  def apply(): GridFilterableOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterableOperators]
  }
  @scala.inline
  implicit class GridFilterableOperatorsOps[Self <: GridFilterableOperators] (val x: Self) extends AnyVal {
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
    def setDate(value: GridFilterableOperatorsDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEnums(value: GridFilterableOperatorsEnums): Self = this.set("enums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    @scala.inline
    def setNumber(value: GridFilterableOperatorsNumber): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setString(value: GridFilterableOperatorsString): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
  
}

