package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownCancelClickedEventUIParam extends js.Object {
  /**
    * Gets the column key for which Cancel button is clicked.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets the igGridSummaries widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object DropDownCancelClickedEventUIParam {
  @scala.inline
  def apply(): DropDownCancelClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownCancelClickedEventUIParam]
  }
  @scala.inline
  implicit class DropDownCancelClickedEventUIParamOps[Self <: DropDownCancelClickedEventUIParam] (val x: Self) extends AnyVal {
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
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

