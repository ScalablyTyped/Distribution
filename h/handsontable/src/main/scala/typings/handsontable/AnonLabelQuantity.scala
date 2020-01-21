package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelQuantity extends js.Object {
  var label: String
  var quantity: String
}

object AnonLabelQuantity {
  @scala.inline
  def apply(label: String, quantity: String): AnonLabelQuantity = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabelQuantity]
  }
}

