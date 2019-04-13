package typings
package inboxsdkLib.inboxsdkMod.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInstance extends js.Object {
  def openNewComposeView(): js.Promise[ComposeView]
  def registerComposeViewHandler(handler: js.Function1[/* composeView */ ComposeView, scala.Unit]): js.Function0[scala.Unit]
}

object ComposeInstance {
  @scala.inline
  def apply(
    openNewComposeView: () => js.Promise[ComposeView],
    registerComposeViewHandler: js.Function1[/* composeView */ ComposeView, scala.Unit] => js.Function0[scala.Unit]
  ): ComposeInstance = {
    val __obj = js.Dynamic.literal(openNewComposeView = js.Any.fromFunction0(openNewComposeView), registerComposeViewHandler = js.Any.fromFunction1(registerComposeViewHandler))
  
    __obj.asInstanceOf[ComposeInstance]
  }
}

