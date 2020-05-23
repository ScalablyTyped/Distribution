package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: Double
  var quantity: Double
}

object Label {
  @scala.inline
  def apply(label: Double, quantity: Double): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

