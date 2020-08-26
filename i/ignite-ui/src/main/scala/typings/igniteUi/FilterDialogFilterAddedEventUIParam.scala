package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDialogFilterAddedEventUIParam extends js.Object {
  /**
    * Gets reference to the filters table row DOM element.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object FilterDialogFilterAddedEventUIParam {
  @scala.inline
  def apply(): FilterDialogFilterAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogFilterAddedEventUIParam]
  }
  @scala.inline
  implicit class FilterDialogFilterAddedEventUIParamOps[Self <: FilterDialogFilterAddedEventUIParam] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

