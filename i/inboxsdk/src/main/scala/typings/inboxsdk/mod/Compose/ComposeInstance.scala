package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeInstance extends js.Object {
  def openNewComposeView(): js.Promise[ComposeView] = js.native
  def registerComposeViewHandler(handler: js.Function1[/* composeView */ ComposeView, Unit]): js.Function0[Unit] = js.native
}

object ComposeInstance {
  @scala.inline
  def apply(
    openNewComposeView: () => js.Promise[ComposeView],
    registerComposeViewHandler: js.Function1[/* composeView */ ComposeView, Unit] => js.Function0[Unit]
  ): ComposeInstance = {
    val __obj = js.Dynamic.literal(openNewComposeView = js.Any.fromFunction0(openNewComposeView), registerComposeViewHandler = js.Any.fromFunction1(registerComposeViewHandler))
    __obj.asInstanceOf[ComposeInstance]
  }
  @scala.inline
  implicit class ComposeInstanceOps[Self <: ComposeInstance] (val x: Self) extends AnyVal {
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
    def setOpenNewComposeView(value: () => js.Promise[ComposeView]): Self = this.set("openNewComposeView", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterComposeViewHandler(value: js.Function1[/* composeView */ ComposeView, Unit] => js.Function0[Unit]): Self = this.set("registerComposeViewHandler", js.Any.fromFunction1(value))
  }
  
}

