package typings.graphqlToolsGraphqlTagPluck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exit extends js.Object {
  def exit(path: js.Any): Unit = js.native
}

object Exit {
  @scala.inline
  def apply(exit: js.Any => Unit): Exit = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Exit]
  }
  @scala.inline
  implicit class ExitOps[Self <: Exit] (val x: Self) extends AnyVal {
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
    def setExit(value: js.Any => Unit): Self = this.set("exit", js.Any.fromFunction1(value))
  }
  
}

