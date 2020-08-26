package typings.jqueryui.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unselected extends js.Object {
  var unselected: Element = js.native
}

object Unselected {
  @scala.inline
  def apply(unselected: Element): Unselected = {
    val __obj = js.Dynamic.literal(unselected = unselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unselected]
  }
  @scala.inline
  implicit class UnselectedOps[Self <: Unselected] (val x: Self) extends AnyVal {
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
    def setUnselected(value: Element): Self = this.set("unselected", value.asInstanceOf[js.Any])
  }
  
}

