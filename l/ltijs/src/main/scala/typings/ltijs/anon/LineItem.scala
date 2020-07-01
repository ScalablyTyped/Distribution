package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItem extends js.Object {
  var lineItem: String
  var lineItems: String
  var scope: js.Array[String]
}

object LineItem {
  @scala.inline
  def apply(lineItem: String, lineItems: String, scope: js.Array[String]): LineItem = {
    val __obj = js.Dynamic.literal(lineItem = lineItem.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItem]
  }
}

