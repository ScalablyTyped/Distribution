package typings.koaRouter

import typings.koa.mod.Next
import typings.koa.mod.ParameterizedContext
import typings.koaRouter.anon.RouterContextany
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@koa/router", JSImport.Namespace)
  @js.native
  /**
    * Create a new router.
    */
  class ^[StateT, CustomT] ()
    extends StObject
       with Router[StateT, CustomT] {
    def this(opt: RouterOptions) = this()
  }
  @JSImport("@koa/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@koa/router", "Layer")
  @js.native
  class Layer protected () extends StObject {
    def this(path: String, methods: js.Array[String], middleware: js.Array[Middleware[js.Any, js.Object]]) = this()
    def this(path: String, methods: js.Array[String], middleware: Middleware[js.Any, js.Object]) = this()
    def this(path: RegExp, methods: js.Array[String], middleware: js.Array[Middleware[js.Any, js.Object]]) = this()
    def this(path: RegExp, methods: js.Array[String], middleware: Middleware[js.Any, js.Object]) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[Middleware[js.Any, js.Object]],
      opts: LayerOptions
    ) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: Middleware[js.Any, js.Object],
      opts: LayerOptions
    ) = this()
    def this(
      path: RegExp,
      methods: js.Array[String],
      middleware: js.Array[Middleware[js.Any, js.Object]],
      opts: LayerOptions
    ) = this()
    def this(
      path: RegExp,
      methods: js.Array[String],
      middleware: Middleware[js.Any, js.Object],
      opts: LayerOptions
    ) = this()
    
    /**
      * Returns array of regexp url path captures.
      */
    def captures(path: String): js.Array[String] = js.native
    
    /**
      * Returns whether request `path` matches route.
      */
    def `match`(path: String): Boolean = js.native
    
    var methods: js.Array[String] = js.native
    
    var name: String = js.native
    
    var opts: LayerOptions = js.native
    
    /**
      * Run validations on route named parameters.
      */
    def param(param: String, fn: Middleware[js.Any, js.Object]): Layer = js.native
    
    var paramNames: js.Array[ParamName] = js.native
    
    /**
      * Returns map of URL parameters for given `path` and `paramNames`.
      */
    def params(path: String, captures: js.Array[String]): js.Object = js.native
    def params(path: String, captures: js.Array[String], existingParams: js.Object): js.Object = js.native
    def params(path: RegExp, captures: js.Array[String]): js.Object = js.native
    def params(path: RegExp, captures: js.Array[String], existingParams: js.Object): js.Object = js.native
    
    var path: String = js.native
    
    var regexp: RegExp = js.native
    
    /**
      * Prefix route path.
      */
    def setPrefix(prefix: String): Layer = js.native
    
    var stack: js.Array[Middleware[js.Any, js.Object]] = js.native
    
    /**
      * Generate URL for route using given `params`.
      */
    def url(params: js.Object): String = js.native
  }
  
  @JSImport("@koa/router", "ParamName")
  @js.native
  class ParamName () extends StObject {
    
    var asterisk: Boolean = js.native
    
    var delimiter: String = js.native
    
    var name: String = js.native
    
    var optional: Boolean = js.native
    
    var partial: Boolean = js.native
    
    var pattern: String = js.native
    
    var prefix: String = js.native
    
    var repeat: String = js.native
  }
  
  /**
    * Generate URL from url pattern and given `params`.
    */
  /* static member */
  @scala.inline
  def url(path: String, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def url(path: RegExp, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait LayerOptions extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCaptures: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object LayerOptions {
    
    @scala.inline
    def apply(name: String): LayerOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerOptions]
    }
    
    @scala.inline
    implicit class LayerOptionsMutableBuilder[Self <: LayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setIgnoreCaptures(value: Boolean): Self = StObject.set(x, "ignoreCaptures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCapturesUndefined: Self = StObject.set(x, "ignoreCaptures", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Middleware[StateT, CustomT] = typings.koa.mod.Middleware[StateT, CustomT & (RouterParamContext[StateT, CustomT])]
  
  type ParamMiddleware = js.Function3[/* param */ String, /* ctx */ RouterContextany, /* next */ Next, js.Any]
  
  @js.native
  trait Router[StateT, CustomT] extends StObject {
    
    /**
      * Register route with all methods.
      */
    def all(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def all[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Returns separate middleware for responding to `OPTIONS` requests with
      * an `Allow` header containing the allowed methods, as well as responding
      * with `405 Method Not Allowed` and `501 Not Implemented` as appropriate.
      */
    def allowedMethods(): Middleware[StateT, CustomT] = js.native
    def allowedMethods(options: RouterAllowedMethodsOptions): Middleware[StateT, CustomT] = js.native
    
    /**
      * Alias for `router.delete()` because delete is a reserved word
      */
    def del(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def del[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP delete method
      */
    def delete(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def delete[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP get method
      */
    def get(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def get[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP head method
      */
    def head(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def head[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP link method
      */
    def link(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def link[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Match given `path` and return corresponding routes.
      */
    def `match`(path: String, method: String): RoutesMatch = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def middleware(): Middleware[StateT, CustomT] = js.native
    
    /**
      * HTTP options method
      */
    def options(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def options[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Run middleware for named route parameters. Useful for auto-loading or validation.
      */
    def param(param: String, middleware: ParamMiddleware): Router[StateT, CustomT] = js.native
    
    var params: js.Object = js.native
    
    /**
      * HTTP patch method
      */
    def patch(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def patch[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * HTTP post method
      */
    def post(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def post[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Set the path prefix for a Router instance that was already initialized.
      */
    def prefix(prefix: String): Router[StateT, CustomT] = js.native
    
    /**
      * HTTP put method
      */
    def put(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def put[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    /**
      * Redirect `source` to `destination` URL with optional 30x status `code`.
      *
      * Both `source` and `destination` can be route names.
      */
    def redirect(source: String, destination: String): Router[StateT, CustomT] = js.native
    def redirect(source: String, destination: String, code: Double): Router[StateT, CustomT] = js.native
    
    def register(path: String, methods: js.Array[String], middleware: js.Array[Middleware[StateT, CustomT]]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[Middleware[StateT, CustomT]],
      opts: LayerOptions
    ): Layer = js.native
    /**
      * Create and register a route.
      */
    def register(path: String, methods: js.Array[String], middleware: Middleware[StateT, CustomT]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: Middleware[StateT, CustomT],
      opts: LayerOptions
    ): Layer = js.native
    def register(path: RegExp, methods: js.Array[String], middleware: js.Array[Middleware[StateT, CustomT]]): Layer = js.native
    def register(
      path: RegExp,
      methods: js.Array[String],
      middleware: js.Array[Middleware[StateT, CustomT]],
      opts: LayerOptions
    ): Layer = js.native
    def register(path: RegExp, methods: js.Array[String], middleware: Middleware[StateT, CustomT]): Layer = js.native
    def register(
      path: RegExp,
      methods: js.Array[String],
      middleware: Middleware[StateT, CustomT],
      opts: LayerOptions
    ): Layer = js.native
    
    def route(name: String): Boolean = js.native
    /**
      * Lookup route with given `name`.
      */
    @JSName("route")
    def route_Layer(name: String): Layer = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def routes(): Middleware[StateT, CustomT] = js.native
    
    var stack: js.Array[Layer] = js.native
    
    /**
      * HTTP unlink method
      */
    def unlink(name: String, path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(name: String, path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: js.Array[String | RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink[T, U](
      name: String,
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      name: String,
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      path: String,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      path: js.Array[String | RegExp],
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    def unlink[T, U](
      path: RegExp,
      middleware: typings.koa.mod.Middleware[T, U],
      routeHandler: Middleware[StateT & T, CustomT & U]
    ): Router[StateT & T, CustomT & U] = js.native
    
    def url(name: String): Error = js.native
    def url(name: String, params: js.Any): Error = js.native
    def url(name: String, params: js.Any, options: UrlOptionsQuery): Error = js.native
    def url(name: String, params: Unit, options: UrlOptionsQuery): Error = js.native
    /**
      * Generate URL for route. Takes either map of named `params` or series of
      * arguments (for regular expression routes)
      *
      * router = new Router();
      * router.get('user', "/users/:id", ...
      *
      * router.url('user', { id: 3 });
      * // => "/users/3"
      *
      * Query can be generated from third argument:
      *
      * router.url('user', { id: 3 }, { query: { limit: 1 } });
      * // => "/users/3?limit=1"
      *
      * router.url('user', { id: 3 }, { query: "limit=1" });
      * // => "/users/3?limit=1"
      *
      */
    @JSName("url")
    def url_String(name: String): String = js.native
    @JSName("url")
    def url_String(name: String, params: js.Any): String = js.native
    @JSName("url")
    def url_String(name: String, params: js.Any, options: UrlOptionsQuery): String = js.native
    @JSName("url")
    def url_String(name: String, params: Unit, options: UrlOptionsQuery): String = js.native
    
    /**
      * Use given middleware.
      *
      * Middleware run in the order they are defined by `.use()`. They are invoked
      * sequentially, requests start at the first middleware and work their way
      * "down" the middleware stack.
      */
    def use(middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: js.Array[String], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  }
  
  trait RouterAllowedMethodsOptions extends StObject {
    
    /**
      * throw the returned value in place of the default MethodNotAllowed error
      */
    var methodNotAllowed: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /**
      * throw the returned value in place of the default NotImplemented error
      */
    var notImplemented: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /**
      * throw error instead of setting status and header
      */
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object RouterAllowedMethodsOptions {
    
    @scala.inline
    def apply(): RouterAllowedMethodsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterAllowedMethodsOptions]
    }
    
    @scala.inline
    implicit class RouterAllowedMethodsOptionsMutableBuilder[Self <: RouterAllowedMethodsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodNotAllowed(value: () => js.Any): Self = StObject.set(x, "methodNotAllowed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMethodNotAllowedUndefined: Self = StObject.set(x, "methodNotAllowed", js.undefined)
      
      @scala.inline
      def setNotImplemented(value: () => js.Any): Self = StObject.set(x, "notImplemented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotImplementedUndefined: Self = StObject.set(x, "notImplemented", js.undefined)
      
      @scala.inline
      def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  type RouterContext[StateT, CustomT] = ParameterizedContext[StateT, CustomT & (RouterParamContext[StateT, CustomT])]
  
  trait RouterOptions extends StObject {
    
    /**
      * Methods which should be supported by the router.
      */
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Prefix for all routes.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    var routerPath: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not routing should be case-sensitive.
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not routes should matched strictly.
      *
      * If strict matching is enabled, the trailing slash is taken into
      * account when matching routes.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouterOptions {
    
    @scala.inline
    def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRouterPath(value: String): Self = StObject.set(x, "routerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterPathUndefined: Self = StObject.set(x, "routerPath", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait RouterParamContext[StateT, CustomT] extends StObject {
    
    /**
      * Matched route
      */
    var _matchedRoute: js.UndefOr[String | RegExp] = js.undefined
    
    var _matchedRouteName: js.UndefOr[String] = js.undefined
    
    /**
      * url params
      */
    var params: js.Any
    
    /**
      * the router instance
      */
    var router: Router[StateT, CustomT]
  }
  object RouterParamContext {
    
    @scala.inline
    def apply[StateT, CustomT](params: js.Any, router: Router[StateT, CustomT]): RouterParamContext[StateT, CustomT] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterParamContext[StateT, CustomT]]
    }
    
    @scala.inline
    implicit class RouterParamContextMutableBuilder[Self <: RouterParamContext[?, ?], StateT, CustomT] (val x: Self & (RouterParamContext[StateT, CustomT])) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: Router[StateT, CustomT]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRoute(value: String | RegExp): Self = StObject.set(x, "_matchedRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRouteName(value: String): Self = StObject.set(x, "_matchedRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRouteNameUndefined: Self = StObject.set(x, "_matchedRouteName", js.undefined)
      
      @scala.inline
      def set_matchedRouteUndefined: Self = StObject.set(x, "_matchedRoute", js.undefined)
    }
  }
  
  trait RoutesMatch extends StObject {
    
    var path: js.Array[Layer]
    
    var pathAndMethod: js.Array[Layer]
    
    var route: Boolean
  }
  object RoutesMatch {
    
    @scala.inline
    def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): RoutesMatch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutesMatch]
    }
    
    @scala.inline
    implicit class RoutesMatchMutableBuilder[Self <: RoutesMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[Layer]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathAndMethod(value: js.Array[Layer]): Self = StObject.set(x, "pathAndMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathAndMethodVarargs(value: Layer*): Self = StObject.set(x, "pathAndMethod", js.Array(value :_*))
      
      @scala.inline
      def setPathVarargs(value: Layer*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRoute(value: Boolean): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlOptionsQuery extends StObject {
    
    var query: js.Object | String
  }
  object UrlOptionsQuery {
    
    @scala.inline
    def apply(query: js.Object | String): UrlOptionsQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlOptionsQuery]
    }
    
    @scala.inline
    implicit class UrlOptionsQueryMutableBuilder[Self <: UrlOptionsQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
