package typings.inboxsdk.inboxsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inboxsdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(version: Double): js.Promise[InboxSDKInstance] = js.native
  def load(version: Double, appId: String): js.Promise[InboxSDKInstance] = js.native
  def load(version: Double, appId: String, opts: LoadOptions): js.Promise[InboxSDKInstance] = js.native
  def loadScript(url: String): js.Promise[Unit] = js.native
  def loadScript(url: String, options: LoadScriptOptions): js.Promise[Unit] = js.native
}

