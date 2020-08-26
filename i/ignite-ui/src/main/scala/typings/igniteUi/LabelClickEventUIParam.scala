package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelClickEventUIParam extends js.Object {
  /**
    * Used to determine whether or not the label click should fire slice click event.
    */
  var allowSliceClick: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to the slice object.
    */
  var item: js.UndefOr[js.Any] = js.native
}

object LabelClickEventUIParam {
  @scala.inline
  def apply(): LabelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClickEventUIParam]
  }
  @scala.inline
  implicit class LabelClickEventUIParamOps[Self <: LabelClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setAllowSliceClick(value: js.Any): Self = this.set("allowSliceClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSliceClick: Self = this.set("allowSliceClick", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

