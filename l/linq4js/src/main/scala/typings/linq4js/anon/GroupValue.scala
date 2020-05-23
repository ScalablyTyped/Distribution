package typings.linq4js.anon

import typings.linq4js.Array
import typings.linq4js.Linq4JS.OrderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupValue extends js.Object {
  var GroupValue: js.Any
  var Order: Array[OrderEntry]
}

object GroupValue {
  @scala.inline
  def apply(GroupValue: js.Any, Order: Array[OrderEntry]): GroupValue = {
    val __obj = js.Dynamic.literal(GroupValue = GroupValue.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupValue]
  }
}

