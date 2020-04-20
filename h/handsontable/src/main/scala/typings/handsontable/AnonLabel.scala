package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: Double
  var quantity: Double
}

object AnonLabel {
  @scala.inline
  def apply(label: Double, quantity: Double): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

