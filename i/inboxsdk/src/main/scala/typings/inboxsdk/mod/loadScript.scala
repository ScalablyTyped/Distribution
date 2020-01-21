package typings.inboxsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inboxsdk", "loadScript")
@js.native
object loadScript extends js.Object {
  def apply(url: String): js.Promise[Unit] = js.native
  def apply(url: String, options: LoadScriptOptions): js.Promise[Unit] = js.native
}

