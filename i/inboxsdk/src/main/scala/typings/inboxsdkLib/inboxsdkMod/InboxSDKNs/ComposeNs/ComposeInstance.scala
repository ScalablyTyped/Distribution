package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

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
    openNewComposeView: js.Function0[js.Promise[ComposeView]],
    registerComposeViewHandler: js.Function1[js.Function1[/* composeView */ ComposeView, scala.Unit], js.Function0[scala.Unit]]
  ): ComposeInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openNewComposeView")(openNewComposeView)
    __obj.updateDynamic("registerComposeViewHandler")(registerComposeViewHandler)
    __obj.asInstanceOf[ComposeInstance]
  }
}

