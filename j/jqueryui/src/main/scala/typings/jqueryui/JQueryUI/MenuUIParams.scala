package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuUIParams extends js.Object {
  var item: js.UndefOr[JQuery] = js.native
}

object MenuUIParams {
  @scala.inline
  def apply(): MenuUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuUIParams]
  }
  @scala.inline
  implicit class MenuUIParamsOps[Self <: MenuUIParams] (val x: Self) extends AnyVal {
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
    def setItem(value: JQuery): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

