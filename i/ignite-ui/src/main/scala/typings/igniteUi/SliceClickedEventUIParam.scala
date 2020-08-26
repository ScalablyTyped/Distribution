package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceClickedEventUIParam extends js.Object {
  /**
    * Used to obtain index of clicked slice.
    */
  var index: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to clicked slice item.
    */
  var item: js.UndefOr[js.Any] = js.native
  /**
    * Used to obtain reference to igFunnelChart.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Used to check if slice became selected.
    */
  var selected: js.UndefOr[js.Any] = js.native
}

object SliceClickedEventUIParam {
  @scala.inline
  def apply(): SliceClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceClickedEventUIParam]
  }
  @scala.inline
  implicit class SliceClickedEventUIParamOps[Self <: SliceClickedEventUIParam] (val x: Self) extends AnyVal {
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
    def setIndex(value: js.Any): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSelected(value: js.Any): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

