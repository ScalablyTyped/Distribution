package typings.istanbulMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.istanbulMiddleware.mod.ClientMatcher
import typings.istanbulMiddleware.mod.PathTransformer
import typings.istanbulMiddleware.mod.PostLoadHookFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Matcher extends StObject {
    
    var matcher: js.UndefOr[ClientMatcher] = js.undefined
    
    var pathTransformer: js.UndefOr[PathTransformer] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Matcher {
    
    inline def apply(): Matcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Matcher]
    }
    
    extension [Self <: Matcher](x: Self) {
      
      inline def setMatcher(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
      
      inline def setPathTransformer(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = StObject.set(x, "pathTransformer", js.Any.fromFunction1(value))
      
      inline def setPathTransformerUndefined: Self = StObject.set(x, "pathTransformer", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait PostLoadHook extends StObject {
    
    var postLoadHook: js.UndefOr[typings.istanbulMiddleware.mod.PostLoadHook] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PostLoadHook {
    
    inline def apply(): PostLoadHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostLoadHook]
    }
    
    extension [Self <: PostLoadHook](x: Self) {
      
      inline def setPostLoadHook(
        value: (/* matcherfn */ typings.istanbulMiddleware.mod.Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn
      ): Self = StObject.set(x, "postLoadHook", js.Any.fromFunction3(value))
      
      inline def setPostLoadHookUndefined: Self = StObject.set(x, "postLoadHook", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait ResetOnGet extends StObject {
    
    var resetOnGet: js.UndefOr[Boolean] = js.undefined
  }
  object ResetOnGet {
    
    inline def apply(): ResetOnGet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetOnGet]
    }
    
    extension [Self <: ResetOnGet](x: Self) {
      
      inline def setResetOnGet(value: Boolean): Self = StObject.set(x, "resetOnGet", value.asInstanceOf[js.Any])
      
      inline def setResetOnGetUndefined: Self = StObject.set(x, "resetOnGet", js.undefined)
    }
  }
}
