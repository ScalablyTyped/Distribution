package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemChangedEventUIParam extends js.Object {
  /**
    * Used to get a reference to the current selected data item.
    */
  var newItem: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the previous selected data item.
    */
  var oldItem: js.UndefOr[js.Any] = js.native
}

object SelectedItemChangedEventUIParam {
  @scala.inline
  def apply(): SelectedItemChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemChangedEventUIParam]
  }
  @scala.inline
  implicit class SelectedItemChangedEventUIParamOps[Self <: SelectedItemChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setNewItem(value: js.Any): Self = this.set("newItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewItem: Self = this.set("newItem", js.undefined)
    @scala.inline
    def setOldItem(value: js.Any): Self = this.set("oldItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldItem: Self = this.set("oldItem", js.undefined)
  }
  
}

