package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDialogOpeningEventUIParam extends js.Object {
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialog: js.UndefOr[String] = js.native
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object FilterDialogOpeningEventUIParam {
  @scala.inline
  def apply(): FilterDialogOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogOpeningEventUIParam]
  }
  @scala.inline
  implicit class FilterDialogOpeningEventUIParamOps[Self <: FilterDialogOpeningEventUIParam] (val x: Self) extends AnyVal {
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
    def setDialog(value: String): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

