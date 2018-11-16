package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComposeInstance extends js.Object {
  def openNewComposeView(): stdLib.Promise[ComposeView]
  def registerComposeViewHandler(handler: js.Function1[/* composeView */ ComposeView, scala.Unit]): js.Function0[scala.Unit]
}

