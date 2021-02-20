package typings.istanbulMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.istanbulMiddleware.anon.ResetOnGet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-middleware", "createClientHandler")
  @js.native
  def createClientHandler(root: String): js.Any = js.native
  @JSImport("istanbul-middleware", "createClientHandler")
  @js.native
  def createClientHandler(root: String, opts: typings.istanbulMiddleware.anon.Matcher): js.Any = js.native
  
  @JSImport("istanbul-middleware", "createHandler")
  @js.native
  def createHandler(): js.Any = js.native
  @JSImport("istanbul-middleware", "createHandler")
  @js.native
  def createHandler(opts: ResetOnGet): js.Any = js.native
  
  @JSImport("istanbul-middleware", "hookLoader")
  @js.native
  def hookLoader(matcherOrRoot: String): Unit = js.native
  @JSImport("istanbul-middleware", "hookLoader")
  @js.native
  def hookLoader(matcherOrRoot: String, opts: typings.istanbulMiddleware.anon.PostLoadHook): Unit = js.native
  @JSImport("istanbul-middleware", "hookLoader")
  @js.native
  def hookLoader(matcherOrRoot: Matcher): Unit = js.native
  @JSImport("istanbul-middleware", "hookLoader")
  @js.native
  def hookLoader(matcherOrRoot: Matcher, opts: typings.istanbulMiddleware.anon.PostLoadHook): Unit = js.native
  
  type ClientMatcher = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], Boolean]
  
  type Matcher = js.Function1[/* file */ String, Boolean]
  
  type PathTransformer = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]
  
  type PostLoadHook = js.Function3[
    /* matcherfn */ Matcher, 
    /* transformer */ js.Any, 
    /* verbose */ Boolean, 
    PostLoadHookFn
  ]
  
  type PostLoadHookFn = js.Function1[/* file */ js.Any, js.Object]
}
