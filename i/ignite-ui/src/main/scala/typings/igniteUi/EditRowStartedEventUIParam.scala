package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRowStartedEventUIParam extends js.Object {
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Checks if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.native
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.native
}

object EditRowStartedEventUIParam {
  @scala.inline
  def apply(): EditRowStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRowStartedEventUIParam]
  }
  @scala.inline
  implicit class EditRowStartedEventUIParamOps[Self <: EditRowStartedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRowAdding(value: Boolean): Self = this.set("rowAdding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowAdding: Self = this.set("rowAdding", js.undefined)
    @scala.inline
    def setRowID(value: js.Any): Self = this.set("rowID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowID: Self = this.set("rowID", js.undefined)
  }
  
}

