package typings
package inboxsdkLib.inboxsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inboxsdk", JSImport.Namespace)
@js.native
object inboxsdkModMembers extends js.Object {
  def load(version: scala.Double): stdLib.Promise[inboxsdkLib.inboxsdkMod.InboxSDKNs.InboxSDKInstance] = js.native
  def load(version: scala.Double, appId: java.lang.String): stdLib.Promise[inboxsdkLib.inboxsdkMod.InboxSDKNs.InboxSDKInstance] = js.native
  def load(
    version: scala.Double,
    appId: java.lang.String,
    opts: inboxsdkLib.inboxsdkMod.InboxSDKNs.LoadOptions
  ): stdLib.Promise[inboxsdkLib.inboxsdkMod.InboxSDKNs.InboxSDKInstance] = js.native
  def loadScript(url: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def loadScript(url: java.lang.String, options: inboxsdkLib.inboxsdkMod.InboxSDKNs.LoadScriptOptions): stdLib.Promise[scala.Unit] = js.native
}

