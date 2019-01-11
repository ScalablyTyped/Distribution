package typings
package istanbulDashLibDashHookLib.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-hook", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hookCreateScript(
    matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher,
    transformer: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Transformer
  ): scala.Unit = js.native
  def hookCreateScript(
    matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher,
    transformer: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Transformer,
    options: stdLib.Partial[istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Options]
  ): scala.Unit = js.native
  def hookRequire(
    matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher,
    transformer: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Transformer
  ): js.Function0[scala.Unit] = js.native
  def hookRequire(
    matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher,
    transformer: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Transformer,
    options: stdLib.Partial[istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.HookRequireOptions]
  ): js.Function0[scala.Unit] = js.native
  def hookRunInThisContext(
    matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher,
    transformer: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Transformer
  ): scala.Unit = js.native
  def hookRunInThisContext(
    matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher,
    transformer: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Transformer,
    options: stdLib.Partial[istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Options]
  ): scala.Unit = js.native
  def unhookCreateScript(): scala.Unit = js.native
  def unhookRunInThisContext(): scala.Unit = js.native
  def unloadRequireCache(matcher: istanbulDashLibDashHookLib.istanbulDashLibDashHookMod.Matcher): scala.Unit = js.native
}

