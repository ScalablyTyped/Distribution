package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashCompilerErrors extends js.Object {
  def clear(): js.Any = js.native
  def save(): js.Any = js.native
}

object FlashCompilerErrors {
  @scala.inline
  def apply(clear: () => js.Any, save: () => js.Any): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[FlashCompilerErrors]
  }
  @scala.inline
  implicit class FlashCompilerErrorsOps[Self <: FlashCompilerErrors] (val x: Self) extends AnyVal {
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
    def setClear(value: () => js.Any): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: () => js.Any): Self = this.set("save", js.Any.fromFunction0(value))
  }
  
}

