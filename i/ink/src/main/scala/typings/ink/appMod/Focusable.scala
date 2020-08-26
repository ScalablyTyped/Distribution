package typings.ink.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focusable extends js.Object {
  val id: String = js.native
  val isActive: Boolean = js.native
}

object Focusable {
  @scala.inline
  def apply(id: String, isActive: Boolean): Focusable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focusable]
  }
  @scala.inline
  implicit class FocusableOps[Self <: Focusable] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
  }
  
}

