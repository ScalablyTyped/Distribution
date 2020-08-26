package typings.materialUiLab.usePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePaginationResult extends js.Object {
  var items: js.Array[UsePaginationItem] = js.native
}

object UsePaginationResult {
  @scala.inline
  def apply(items: js.Array[UsePaginationItem]): UsePaginationResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationResult]
  }
  @scala.inline
  implicit class UsePaginationResultOps[Self <: UsePaginationResult] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: UsePaginationItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[UsePaginationItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

