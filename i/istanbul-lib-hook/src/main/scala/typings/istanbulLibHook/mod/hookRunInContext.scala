package typings.istanbulLibHook.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-hook", "hookRunInContext")
@js.native
object hookRunInContext extends js.Object {
  def apply(matcher: Matcher, transformer: Transformer): Unit = js.native
  def apply(matcher: Matcher, transformer: Transformer, options: Partial[HookRunInContextOptions]): Unit = js.native
}

