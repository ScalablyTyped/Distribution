package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicEnvironmentFlags extends js.Object {
  val confirm: Boolean = js.native
  val interactive: Boolean = js.native
}

object IonicEnvironmentFlags {
  @scala.inline
  def apply(confirm: Boolean, interactive: Boolean): IonicEnvironmentFlags = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicEnvironmentFlags]
  }
  @scala.inline
  implicit class IonicEnvironmentFlagsOps[Self <: IonicEnvironmentFlags] (val x: Self) extends AnyVal {
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
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
  }
  
}

