package typings.ionic.libHelperMod

import typings.ionic.definitionsMod.IPCMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/helper", "sendMessage")
@js.native
object sendMessage extends js.Object {
  def apply(hasConfigCtx: SendMessageDeps, msg: IPCMessage): js.Promise[Unit] = js.native
}

