package typings.linq4js.anon

import typings.linq4js.Array
import typings.linq4js.Linq4JS.OrderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupValue extends js.Object {
  var GroupValue: js.Any = js.native
  var Order: Array[OrderEntry] = js.native
}

object GroupValue {
  @scala.inline
  def apply(GroupValue: js.Any, Order: Array[OrderEntry]): GroupValue = {
    val __obj = js.Dynamic.literal(GroupValue = GroupValue.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupValue]
  }
  @scala.inline
  implicit class GroupValueOps[Self <: GroupValue] (val x: Self) extends AnyVal {
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
    def setGroupValue(value: js.Any): Self = this.set("GroupValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Array[OrderEntry]): Self = this.set("Order", value.asInstanceOf[js.Any])
  }
  
}

