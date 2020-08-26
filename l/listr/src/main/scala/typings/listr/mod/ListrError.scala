package typings.listr.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrError[Ctx] extends Error {
  var context: Ctx = js.native
}

object ListrError {
  @scala.inline
  def apply[Ctx](context: Ctx, message: String, name: String): ListrError[Ctx] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrError[Ctx]]
  }
  @scala.inline
  implicit class ListrErrorOps[Self <: ListrError[_], Ctx] (val x: Self with ListrError[Ctx]) extends AnyVal {
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
    def setContext(value: Ctx): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

