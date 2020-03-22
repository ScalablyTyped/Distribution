package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuantity extends js.Object {
  var label: String
  var quantity: String
}

object AnonQuantity {
  @scala.inline
  def apply(label: String, quantity: String): AnonQuantity = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuantity]
  }
}

