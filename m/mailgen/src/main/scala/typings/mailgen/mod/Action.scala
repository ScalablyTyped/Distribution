package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var button: Button = js.native
  var instructions: String = js.native
}

object Action {
  @scala.inline
  def apply(button: Button, instructions: String): Action = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def setButton(value: Button): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
  }
  
}

