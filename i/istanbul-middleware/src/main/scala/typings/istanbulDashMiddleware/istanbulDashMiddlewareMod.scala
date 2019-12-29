package typings.istanbulDashMiddleware

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-middleware", JSImport.Namespace)
@js.native
object istanbulDashMiddlewareMod extends js.Object {
  def createClientHandler(root: String): js.Any = js.native
  def createClientHandler(root: String, opts: Anon_Matcher): js.Any = js.native
  def createHandler(): js.Any = js.native
  def createHandler(opts: Anon_ResetOnGet): js.Any = js.native
  def hookLoader(matcherOrRoot: String): Unit = js.native
  def hookLoader(matcherOrRoot: String, opts: Anon_PostLoadHook): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher, opts: Anon_PostLoadHook): Unit = js.native
  type ClientMatcher = js.Function1[/* req */ Request[ParamsDictionary], Boolean]
  type Matcher = js.Function1[/* file */ String, Boolean]
  type PathTransformer = js.Function1[/* req */ Request[ParamsDictionary], String]
  type PostLoadHook = js.Function3[
    /* matcherfn */ Matcher, 
    /* transformer */ js.Any, 
    /* verbose */ Boolean, 
    PostLoadHookFn
  ]
  type PostLoadHookFn = js.Function1[/* file */ js.Any, js.Object]
}

