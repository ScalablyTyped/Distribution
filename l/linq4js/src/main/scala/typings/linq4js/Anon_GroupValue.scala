package typings.linq4js

import typings.linq4js.Linq4JS.OrderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupValue extends js.Object {
  var GroupValue: js.Any
  var Order: Array[OrderEntry]
}

object Anon_GroupValue {
  @scala.inline
  def apply(GroupValue: js.Any, Order: Array[OrderEntry]): Anon_GroupValue = {
    val __obj = js.Dynamic.literal(GroupValue = GroupValue, Order = Order)
  
    __obj.asInstanceOf[Anon_GroupValue]
  }
}

