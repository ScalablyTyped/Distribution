package typings.inboxsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inboxsdk", "load")
@js.native
object load extends js.Object {
  
  def apply(version: Double): js.Promise[InboxSDKInstance] = js.native
  def apply(version: Double, appId: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Promise[InboxSDKInstance] = js.native
  def apply(version: Double, appId: String): js.Promise[InboxSDKInstance] = js.native
  def apply(version: Double, appId: String, opts: LoadOptions): js.Promise[InboxSDKInstance] = js.native
}
