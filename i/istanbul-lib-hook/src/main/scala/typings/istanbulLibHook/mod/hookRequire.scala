package typings.istanbulLibHook.mod

import typings.istanbulLibHook.PartialHookRequireOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-hook", "hookRequire")
@js.native
object hookRequire extends js.Object {
  def apply(matcher: Matcher, transformer: Transformer): js.Function0[Unit] = js.native
  def apply(matcher: Matcher, transformer: Transformer, options: PartialHookRequireOptions): js.Function0[Unit] = js.native
}

