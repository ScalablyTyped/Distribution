package typings.koaJoiRouter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.Next
import typings.koaJoiRouter.anon.ContinueOnError
import typings.koaJoiRouter.anon.FnCall
import typings.koaJoiRouter.anon.TypeofJoi
import typings.koaRouter.mod.IMiddleware
import typings.koaRouter.mod.IParamMiddleware
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-joi-router", JSImport.Namespace)
  @js.native
  val ^ : createRouter = js.native
  
  trait Config extends StObject {
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var pre: js.UndefOr[Handler] = js.undefined
    
    var validate: js.UndefOr[ContinueOnError] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPre(value: Handler): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreFunction2(value: (/* ctx */ Context, /* next */ Next) => Any): Self = StObject.set(x, "pre", js.Any.fromFunction2(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setValidate(value: ContinueOnError): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type FullHandler = js.Function2[/* ctx */ Context, /* next */ Next, Any]
  
  type Handler = FullHandler | NestedHandler
  
  @js.native
  trait Method extends StObject {
    
    def apply(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def apply(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def apply(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def apply(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  }
  
  @js.native
  trait NestedHandler
    extends StObject
       with ReadonlyArray[Handler]
  
  /* Rewritten from type alias, can be one of: 
    - typings.koaJoiRouter.anon.Body
    - typings.koaJoiRouter.anon.Headers
  */
  trait OutputValidation extends StObject
  object OutputValidation {
    
    inline def Body(): typings.koaJoiRouter.anon.Body = {
      val __obj = js.Dynamic.literal(body = null)
      __obj.asInstanceOf[typings.koaJoiRouter.anon.Body]
    }
    
    inline def Headers(): typings.koaJoiRouter.anon.Headers = {
      val __obj = js.Dynamic.literal(headers = null)
      __obj.asInstanceOf[typings.koaJoiRouter.anon.Headers]
    }
  }
  
  @js.native
  trait Router extends StObject {
    
    def delete(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def delete(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def delete(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def delete(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("delete")
    var delete_Original: Method = js.native
    
    def get(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def get(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def get(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def get(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("get")
    var get_Original: Method = js.native
    
    def head(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def head(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def head(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def head(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("head")
    var head_Original: Method = js.native
    
    def middleware(): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def options(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def options(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def options(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def options(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("options")
    var options_Original: Method = js.native
    
    def param(param: String, middleware: IParamMiddleware[Any, js.Object]): typings.koaRouter.mod.Router[Any, js.Object] = js.native
    @JSName("param")
    var param_Original: js.Function2[
        /* param */ String, 
        /* middleware */ IParamMiddleware[Any, js.Object], 
        typings.koaRouter.mod.Router[Any, js.Object]
      ] = js.native
    
    def patch(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def patch(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def patch(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def patch(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("patch")
    var patch_Original: Method = js.native
    
    def post(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def post(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def post(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def post(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("post")
    var post_Original: Method = js.native
    
    def prefix(prefix: String): typings.koaRouter.mod.Router[Any, js.Object] = js.native
    @JSName("prefix")
    var prefix_Original: js.Function1[/* prefix */ String, typings.koaRouter.mod.Router[Any, js.Object]] = js.native
    
    def put(path: String, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def put(path: String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    def put(path: js.RegExp, handlerOrConfig: Config, handlers: Handler*): Router = js.native
    def put(path: js.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
    @JSName("put")
    var put_Original: Method = js.native
    
    def route(spec: js.Array[Spec]): Router = js.native
    def route(spec: Spec): Router = js.native
    
    var router: typings.koaRouter.mod.^[Any, js.Object] = js.native
    
    var routes: js.Array[Spec] = js.native
    
    def use(middleware: (IMiddleware[Any, js.Object])*): typings.koaRouter.mod.Router[Any, js.Object] = js.native
    def use(path: String, middleware: (IMiddleware[Any, js.Object])*): typings.koaRouter.mod.Router[Any, js.Object] = js.native
    def use(path: js.Array[String], middleware: (IMiddleware[Any, js.Object])*): typings.koaRouter.mod.Router[Any, js.Object] = js.native
    def use(path: js.RegExp, middleware: (IMiddleware[Any, js.Object])*): typings.koaRouter.mod.Router[Any, js.Object] = js.native
    @JSName("use")
    var use_Original: FnCall = js.native
  }
  
  trait Spec
    extends StObject
       with Config {
    
    var handler: Handler
    
    var method: String | js.Array[String]
    
    var path: String | js.RegExp
  }
  object Spec {
    
    inline def apply(handler: Handler, method: String | js.Array[String], path: String | js.RegExp): Spec = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spec]
    }
    
    extension [Self <: Spec](x: Self) {
      
      inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerFunction2(value: (/* ctx */ Context, /* next */ Next) => Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
      
      inline def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setPath(value: String | js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = createRouter
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: createRouter = ^
  
  @js.native
  trait createRouter extends StObject {
    
    def apply(): Router = js.native
    
    var Joi: TypeofJoi = js.native
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Request extends StObject {
      
      var body: js.UndefOr[Any] = js.undefined
      
      var params: StringDictionary[String]
    }
    object Request {
      
      inline def apply(params: StringDictionary[String]): Request = {
        val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      }
    }
  }
}
