package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickEventUIParam extends js.Object {
  /**
    * Used to get a reference the igSplitButton element.
    */
  var item: js.UndefOr[js.Any] = js.native
}

object ClickEventUIParam {
  @scala.inline
  def apply(): ClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickEventUIParam]
  }
  @scala.inline
  implicit class ClickEventUIParamOps[Self <: ClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

