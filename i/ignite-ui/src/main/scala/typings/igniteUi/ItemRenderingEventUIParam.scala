package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemRenderingEventUIParam extends js.Object {
  /**
    * Used to get a reference of the item's index, if the layout is flow or vertical
    */
  var index: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference to the rendered item
    */
  var item: js.UndefOr[js.Any] = js.native
  /**
    * Used to get a reference of item's settings, such as colspan ,rowspan, etc.
    */
  var itemData: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to the igLayoutManager.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ItemRenderingEventUIParam {
  @scala.inline
  def apply(): ItemRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRenderingEventUIParam]
  }
  @scala.inline
  implicit class ItemRenderingEventUIParamOps[Self <: ItemRenderingEventUIParam] (val x: Self) extends AnyVal {
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
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

