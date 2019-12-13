package typings.ionic.libHooksMod

import typings.ionic.definitionsMod.HookFn
import typings.ionic.definitionsMod.HookInput
import typings.ionic.definitionsMod.HookName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/hooks", "Hook")
@js.native
abstract class Hook protected () extends js.Object {
  def this(e: HookDeps) = this()
  val e: HookDeps = js.native
  val name: HookName = js.native
  /* protected */ def loadHookFn(p: String): js.Promise[js.UndefOr[HookFn]] = js.native
  def run(input: HookInput): js.Promise[Unit] = js.native
  def script(): String = js.native
}

