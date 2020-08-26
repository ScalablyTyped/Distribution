package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringEventUIParam extends js.Object {
  /**
    * Used to obtain reference to array which contains expressions supported by [$.ig.DataSource](ig.datasource).
    */
  var expression: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object FilteringEventUIParam {
  @scala.inline
  def apply(): FilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringEventUIParam]
  }
  @scala.inline
  implicit class FilteringEventUIParamOps[Self <: FilteringEventUIParam] (val x: Self) extends AnyVal {
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
    def setExpression(value: js.Any): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

