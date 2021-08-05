package typings.istanbulMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.istanbulMiddleware.anon.ResetOnGet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClientHandler(root: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientHandler")(root.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def createClientHandler(root: String, opts: typings.istanbulMiddleware.anon.Matcher): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientHandler")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def createHandler(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHandler")().asInstanceOf[js.Any]
  inline def createHandler(opts: ResetOnGet): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHandler")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def hookLoader(matcherOrRoot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hookLoader(matcherOrRoot: String, opts: typings.istanbulMiddleware.anon.PostLoadHook): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookLoader(matcherOrRoot: Matcher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hookLoader(matcherOrRoot: Matcher, opts: typings.istanbulMiddleware.anon.PostLoadHook): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
