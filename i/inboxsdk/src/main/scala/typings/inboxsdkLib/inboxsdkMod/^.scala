package typings
package inboxsdkLib.inboxsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inboxsdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(version: scala.Double): js.Promise[InboxSDKInstance] = js.native
  def load(version: scala.Double, appId: java.lang.String): js.Promise[InboxSDKInstance] = js.native
  def load(version: scala.Double, appId: java.lang.String, opts: LoadOptions): js.Promise[InboxSDKInstance] = js.native
  def loadScript(url: java.lang.String): js.Promise[scala.Unit] = js.native
  def loadScript(url: java.lang.String, options: LoadScriptOptions): js.Promise[scala.Unit] = js.native
}

