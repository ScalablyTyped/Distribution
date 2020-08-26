package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Help extends js.Object {
  def toJSON(): String = js.native
}

object Help {
  @scala.inline
  def apply(toJSON: () => String): Help = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Help]
  }
  @scala.inline
  implicit class HelpOps[Self <: Help] (val x: Self) extends AnyVal {
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
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

