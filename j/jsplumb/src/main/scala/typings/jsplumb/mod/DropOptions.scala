package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropOptions extends js.Object {
  var hoverClass: String = js.native
}

object DropOptions {
  @scala.inline
  def apply(hoverClass: String): DropOptions = {
    val __obj = js.Dynamic.literal(hoverClass = hoverClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOptions]
  }
  @scala.inline
  implicit class DropOptionsOps[Self <: DropOptions] (val x: Self) extends AnyVal {
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
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
  }
  
}

