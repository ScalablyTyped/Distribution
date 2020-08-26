package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemChangingEventUIParam extends js.Object {
  /**
    * Used to stop the selected item from changing.
    */
  var cancel: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the newly selected data item.
    */
  var newItem: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the current selected data item.
    */
  var oldItem: js.UndefOr[js.Any] = js.native
}

object SelectedItemChangingEventUIParam {
  @scala.inline
  def apply(): SelectedItemChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangingEventUIParam]
  }
  @scala.inline
  implicit class SelectedItemChangingEventUIParamOps[Self <: SelectedItemChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setCancel(value: js.Any): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setNewItem(value: js.Any): Self = this.set("newItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewItem: Self = this.set("newItem", js.undefined)
    @scala.inline
    def setOldItem(value: js.Any): Self = this.set("oldItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldItem: Self = this.set("oldItem", js.undefined)
  }
  
}

