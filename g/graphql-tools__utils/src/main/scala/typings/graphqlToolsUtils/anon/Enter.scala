package typings.graphqlToolsUtils.anon

import typings.graphqlToolsUtils.visitResultMod.ValueVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enter extends js.Object {
  var __enter: js.UndefOr[ValueVisitor] = js.native
  var __leave: js.UndefOr[ValueVisitor] = js.native
}

object Enter {
  @scala.inline
  def apply(): Enter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter]
  }
  @scala.inline
  implicit class EnterOps[Self <: Enter] (val x: Self) extends AnyVal {
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
    def set__enter(value: /* value */ js.Any => js.Any): Self = this.set("__enter", js.Any.fromFunction1(value))
    @scala.inline
    def delete__enter: Self = this.set("__enter", js.undefined)
    @scala.inline
    def set__leave(value: /* value */ js.Any => js.Any): Self = this.set("__leave", js.Any.fromFunction1(value))
    @scala.inline
    def delete__leave: Self = this.set("__leave", js.undefined)
  }
  
}

