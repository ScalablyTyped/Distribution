package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quantity extends js.Object {
  var label: String
  var quantity: String
}

object Quantity {
  @scala.inline
  def apply(label: String, quantity: String): Quantity = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quantity]
  }
}

