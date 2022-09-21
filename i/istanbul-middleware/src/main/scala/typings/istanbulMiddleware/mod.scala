package typings.istanbulMiddleware

import typings.express.mod.Request_
import typings.istanbulMiddleware.anon.ResetOnGet
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClientHandler(root: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientHandler")(root.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createClientHandler(root: String, opts: typings.istanbulMiddleware.anon.Matcher): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientHandler")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createHandler(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHandler")().asInstanceOf[Any]
  inline def createHandler(opts: ResetOnGet): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHandler")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def hookLoader(matcherOrRoot: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hookLoader(matcherOrRoot: String, opts: typings.istanbulMiddleware.anon.PostLoadHook): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hookLoader(matcherOrRoot: Matcher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hookLoader(matcherOrRoot: Matcher, opts: typings.istanbulMiddleware.anon.PostLoadHook): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookLoader")(matcherOrRoot.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ClientMatcher = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    Boolean
  ]
  
  type Matcher = js.Function1[/* file */ String, Boolean]
  
  type PathTransformer = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    String
  ]
  
  type PostLoadHook = js.Function3[/* matcherfn */ Matcher, /* transformer */ Any, /* verbose */ Boolean, PostLoadHookFn]
  
  type PostLoadHookFn = js.Function1[/* file */ Any, js.Object]
}
