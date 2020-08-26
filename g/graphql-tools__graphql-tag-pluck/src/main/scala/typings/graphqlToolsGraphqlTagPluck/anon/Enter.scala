package typings.graphqlToolsGraphqlTagPluck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enter extends js.Object {
  def enter(path: js.Any): Unit = js.native
}

object Enter {
  @scala.inline
  def apply(enter: js.Any => Unit): Enter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter))
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
    def setEnter(value: js.Any => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
  }
  
}

