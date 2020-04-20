package typings.lovefield.mod.schema

import typings.lovefield.mod.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexedColumn extends js.Object {
  var autoIncrement: Boolean
  var name: String
  var order: Order
}

object IndexedColumn {
  @scala.inline
  def apply(autoIncrement: Boolean, name: String, order: Order): IndexedColumn = {
    val __obj = js.Dynamic.literal(autoIncrement = autoIncrement.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedColumn]
  }
}

