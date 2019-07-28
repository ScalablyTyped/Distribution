package typings.istanbulDashMiddleware.istanbulDashMiddlewareMod

import typings.istanbulDashMiddleware.Anon_Matcher
import typings.istanbulDashMiddleware.Anon_PostLoadHook
import typings.istanbulDashMiddleware.Anon_ResetOnGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClientHandler(root: String): js.Any = js.native
  def createClientHandler(root: String, opts: Anon_Matcher): js.Any = js.native
  def createHandler(): js.Any = js.native
  def createHandler(opts: Anon_ResetOnGet): js.Any = js.native
  def hookLoader(matcherOrRoot: String): Unit = js.native
  def hookLoader(matcherOrRoot: String, opts: Anon_PostLoadHook): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher, opts: Anon_PostLoadHook): Unit = js.native
}

