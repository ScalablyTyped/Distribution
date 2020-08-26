package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownClosingEventUIParam extends js.Object {
  /**
    * Used to obtain reference to jquery DOM element which represents drop down list container.
    */
  var list: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object DropDownClosingEventUIParam {
  @scala.inline
  def apply(): DropDownClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownClosingEventUIParam]
  }
  @scala.inline
  implicit class DropDownClosingEventUIParamOps[Self <: DropDownClosingEventUIParam] (val x: Self) extends AnyVal {
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
    def setList(value: js.Any): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

