package typings
package istanbulDashLibDashHookLib.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-hook", JSImport.Namespace)
@js.native
object istanbulDashLibDashHookModMembers extends js.Object {
  def hookCreateScript(matcher: Matcher, transformer: Transformer): scala.Unit = js.native
  def hookCreateScript(matcher: Matcher, transformer: Transformer, options: stdLib.Partial[Options]): scala.Unit = js.native
  def hookRequire(matcher: Matcher, transformer: Transformer): js.Function0[scala.Unit] = js.native
  def hookRequire(matcher: Matcher, transformer: Transformer, options: stdLib.Partial[HookRequireOptions]): js.Function0[scala.Unit] = js.native
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer): scala.Unit = js.native
  def hookRunInThisContext(matcher: Matcher, transformer: Transformer, options: stdLib.Partial[Options]): scala.Unit = js.native
  def unhookCreateScript(): scala.Unit = js.native
  def unhookRunInThisContext(): scala.Unit = js.native
  def unloadRequireCache(matcher: Matcher): scala.Unit = js.native
}

