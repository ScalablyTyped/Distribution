package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListFilterableOperators extends js.Object {
  var date: js.UndefOr[TreeListFilterableOperatorsDate] = js.native
  var number: js.UndefOr[TreeListFilterableOperatorsNumber] = js.native
  var string: js.UndefOr[TreeListFilterableOperatorsString] = js.native
}

object TreeListFilterableOperators {
  @scala.inline
  def apply(): TreeListFilterableOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterableOperators]
  }
  @scala.inline
  implicit class TreeListFilterableOperatorsOps[Self <: TreeListFilterableOperators] (val x: Self) extends AnyVal {
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
    def setDate(value: TreeListFilterableOperatorsDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setNumber(value: TreeListFilterableOperatorsNumber): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setString(value: TreeListFilterableOperatorsString): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
  
}

