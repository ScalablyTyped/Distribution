package typings.lovefield.lovefieldMod.schema

import typings.lovefield.lovefieldMod.Order
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
    val __obj = js.Dynamic.literal(autoIncrement = autoIncrement, name = name, order = order)
  
    __obj.asInstanceOf[IndexedColumn]
  }
}

