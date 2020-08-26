package typings.handsontable.mod.Handsontable.nestedHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedHeader extends js.Object {
  var colspan: Double = js.native
  var label: String = js.native
}

object NestedHeader {
  @scala.inline
  def apply(colspan: Double, label: String): NestedHeader = {
    val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedHeader]
  }
  @scala.inline
  implicit class NestedHeaderOps[Self <: NestedHeader] (val x: Self) extends AnyVal {
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
    def setColspan(value: Double): Self = this.set("colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

