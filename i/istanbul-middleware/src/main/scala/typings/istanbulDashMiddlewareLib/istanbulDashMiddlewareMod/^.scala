package typings
package istanbulDashMiddlewareLib.istanbulDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClientHandler(root: java.lang.String): js.Any = js.native
  def createClientHandler(root: java.lang.String, opts: istanbulDashMiddlewareLib.Anon_Matcher): js.Any = js.native
  def createHandler(): js.Any = js.native
  def createHandler(opts: istanbulDashMiddlewareLib.Anon_ResetOnGet): js.Any = js.native
  def hookLoader(matcherOrRoot: Matcher): scala.Unit = js.native
  def hookLoader(matcherOrRoot: Matcher, opts: istanbulDashMiddlewareLib.Anon_PostLoadHook): scala.Unit = js.native
  def hookLoader(matcherOrRoot: java.lang.String): scala.Unit = js.native
  def hookLoader(matcherOrRoot: java.lang.String, opts: istanbulDashMiddlewareLib.Anon_PostLoadHook): scala.Unit = js.native
}

