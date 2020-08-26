package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var label: Double = js.native
  var quantity: Double = js.native
}

object Label {
  @scala.inline
  def apply(label: Double, quantity: Double): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: Double): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
  }
  
}

