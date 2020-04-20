package typings.linq4js

import typings.linq4js.Linq4JS.OrderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupValue extends js.Object {
  var GroupValue: js.Any
  var Order: Array[OrderEntry]
}

object AnonGroupValue {
  @scala.inline
  def apply(GroupValue: js.Any, Order: Array[OrderEntry]): AnonGroupValue = {
    val __obj = js.Dynamic.literal(GroupValue = GroupValue.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupValue]
  }
}

