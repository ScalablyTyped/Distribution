package typings.istanbulDashLibDashHook.istanbulDashLibDashHookMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-hook", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hookCreateScript(matcher: Matcher, transformer: Transformer): Unit = js.native
  def hookCreateScript(matcher: Matcher, transformer: Transformer, options: Partial[Options]): Unit = js.native
  def hookRequire(matcher: Matcher, transformer: Transformer): js.Function0[Unit] = js.native
  def hookRequire(matcher: Matcher, transformer: Transformer, options: Partial[HookRequireOptions]): js.Function0[Unit] = js.native
  def hookRunInContext(matcher: Matcher, transformer: Transformer): Unit = js.native
  def hookRunInContext(matcher: Matcher, transformer: Transformer, options: Partial[HookRunInContextOptions]): Unit = js.native
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer): Unit = js.native
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer, options: Partial[Options]): Unit = js.native
  def unhookCreateScript(): Unit = js.native
  def unhookRunInContext(): Unit = js.native
  def unhookRunInThisContext(): Unit = js.native
  def unloadRequireCache(matcher: Matcher): Unit = js.native
}

