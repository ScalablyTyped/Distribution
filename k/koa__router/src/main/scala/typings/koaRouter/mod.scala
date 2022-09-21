package typings.koaRouter

import org.scalablytyped.runtime.TopLevel
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Next
import typings.koa.mod.ParameterizedContext
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@koa/router", JSImport.Namespace)
  @js.native
  /**
    * Create a new router.
    */
  open class ^[StateT, ContextT] ()
    extends StObject
       with Router[StateT, ContextT] {
    def this(opt: RouterOptions) = this()
  }
  @JSImport("@koa/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@koa/router", "Layer")
  @js.native
  open class Layer protected () extends StObject {
    def this(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[Middleware[DefaultState, DefaultContext, Any]]
    ) = this()
    def this(path: String, methods: js.Array[String], middleware: Middleware[DefaultState, DefaultContext, Any]) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[Middleware[DefaultState, DefaultContext, Any]]
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: Middleware[DefaultState, DefaultContext, Any]
    ) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[Middleware[DefaultState, DefaultContext, Any]],
      opts: LayerOptions
    ) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: Middleware[DefaultState, DefaultContext, Any],
      opts: LayerOptions
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[Middleware[DefaultState, DefaultContext, Any]],
      opts: LayerOptions
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: Middleware[DefaultState, DefaultContext, Any],
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
    
    var name: String | Null = js.native
    
    var opts: LayerOptions = js.native
    
    /**
      * Run validations on route named parameters.
      *
      * @example
      *
      * ```javascript
      * router
      *   .param('user', function (id, ctx, next) {
      *     ctx.user = users[id];
      *     if (!ctx.user) return ctx.status = 404;
      *     next();
      *   })
      *   .get('/users/:user', function (ctx, next) {
      *     ctx.body = ctx.user;
      *   });
      * ```
      */
    def param(param: String, middleware: ParamMiddleware[DefaultState, DefaultContext, Any]): Layer = js.native
    
    var paramNames: js.Array[ParamName] = js.native
    
    /**
      * Returns map of URL parameters for given `path` and `paramNames`.
      */
    def params[ParamT /* <: String */](path: String, captures: js.Array[ParamT]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in ParamT ]:? string}
      */ typings.koaRouter.koaRouterStrings.Layer & TopLevel[Any] = js.native
    def params[ParamT /* <: String */](path: String, captures: js.Array[ParamT], params: Record[String, Any]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in ParamT ]:? string}
      */ typings.koaRouter.koaRouterStrings.Layer & TopLevel[Any] = js.native
    def params[ParamT /* <: String */](path: js.RegExp, captures: js.Array[ParamT]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in ParamT ]:? string}
      */ typings.koaRouter.koaRouterStrings.Layer & TopLevel[Any] = js.native
    def params[ParamT /* <: String */](path: js.RegExp, captures: js.Array[ParamT], params: Record[String, Any]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in ParamT ]:? string}
      */ typings.koaRouter.koaRouterStrings.Layer & TopLevel[Any] = js.native
    
    var path: String = js.native
    
    var regexp: js.RegExp = js.native
    
    /**
      * Prefix route path.
      */
    def setPrefix(prefix: String): Layer = js.native
    
    var stack: js.Array[Middleware[DefaultState, DefaultContext, Any]] = js.native
    
    /**
      * Generate URL for route using given `params`.
      *
      * @example
      *
      * ```javascript
      * const route = new Layer('/users/:id', ['GET'], fn);
      *
      * route.url({ id: 123 }); // => "/users/123"
      * ```
      */
    def url(params: js.Object): String = js.native
  }
  
  @JSImport("@koa/router", "ParamName")
  @js.native
  open class ParamName () extends StObject {
    
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
    * Generate URL for route. Takes a route name and map of named `params`.
    *
    * @example
    *
    * ```javascript
    * router.get('user', '/users/:id', (ctx, next) => {
    *   // ...
    * });
    *
    * router.url('user', 3);
    * // => "/users/3"
    *
    * router.url('user', { id: 3 });
    * // => "/users/3"
    *
    * router.use((ctx, next) => {
    *   // redirect to named route
    *   ctx.redirect(ctx.router.url('sign-in'));
    * })
    *
    * router.url('user', { id: 3 }, { query: { limit: 1 } });
    * // => "/users/3?limit=1"
    *
    * router.url('user', { id: 3 }, { query: "limit=1" });
    * // => "/users/3?limit=1"
    * ```
    */
  /* static member */
  inline def url(path: String, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def url(path: js.RegExp, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(path.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait LayerOptions extends StObject {
    
    /**
      * (default: false)
      */
    var end: js.UndefOr[Boolean] = js.undefined
    
    var ignoreCaptures: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Route name
      */
    var name: String | Null
    
    /**
      * (default: '')
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Case sensitive (default: false)
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Require the trailing slash (default: false)
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object LayerOptions {
    
    inline def apply(): LayerOptions = {
      val __obj = js.Dynamic.literal(name = null)
      __obj.asInstanceOf[LayerOptions]
    }
    
    extension [Self <: LayerOptions](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setIgnoreCaptures(value: Boolean): Self = StObject.set(x, "ignoreCaptures", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCapturesUndefined: Self = StObject.set(x, "ignoreCaptures", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Middleware[StateT, ContextT, BodyT] = typings.koa.mod.Middleware[StateT, ContextT & (RouterParamContext[StateT, ContextT]), BodyT]
  
  type ParamMiddleware[StateT, ContextT, BodyT] = js.Function3[
    /* param */ String, 
    /* ctx */ RouterContext[StateT, ContextT, BodyT], 
    /* next */ Next, 
    Any
  ]
  
  @js.native
  trait Router[StateT, ContextT] extends StObject {
    
    /**
      * Register route with all methods.
      */
    def all[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def all[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * Register route with all methods.
      */
    def all[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def all[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def all[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * Returns separate middleware for responding to `OPTIONS` requests with
      * an `Allow` header containing the allowed methods, as well as responding
      * with `405 Method Not Allowed` and `501 Not Implemented` as appropriate.
      *
      * @example
      *
      * ```javascript
      * var Koa = require('koa');
      * var Router = require('koa-router');
      *
      * var app = new Koa();
      * var router = new Router();
      *
      * app.use(router.routes());
      * app.use(router.allowedMethods());
      * ```
      *
      * **Example with [Boom](https://github.com/hapijs/boom)**
      *
      * ```javascript
      * var Koa = require('koa');
      * var Router = require('koa-router');
      * var Boom = require('boom');
      *
      * var app = new Koa();
      * var router = new Router();
      *
      * app.use(router.routes());
      * app.use(router.allowedMethods({
      *   throw: true,
      *   notImplemented: () => new Boom.notImplemented(),
      *   methodNotAllowed: () => new Boom.methodNotAllowed()
      * }));
      * ```
      */
    def allowedMethods(): Middleware[StateT, ContextT, Any] = js.native
    def allowedMethods(options: RouterAllowedMethodsOptions): Middleware[StateT, ContextT, Any] = js.native
    
    /**
      * Alias for `router.delete()` because delete is a reserved word
      */
    def del[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def del[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * Alias for `router.delete()` because delete is a reserved word
      */
    def del[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def del[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def del[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * HTTP delete method
      */
    def delete[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def delete[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP delete method
      */
    def delete[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def delete[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def delete[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * HTTP get method
      */
    def get[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def get[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP get method
      */
    def get[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def get[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def get[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * HTTP head method
      */
    def head[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def head[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP head method
      */
    def head[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def head[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def head[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * HTTP link method
      */
    def link[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def link[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP link method
      */
    def link[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def link[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def link[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * Match given `path` and return corresponding routes.
      */
    def `match`(path: String, method: String): RoutesMatch = js.native
    
    var methods: js.Array[String] = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def middleware(): Middleware[StateT, ContextT, Any] = js.native
    
    /**
      * HTTP options method
      */
    def options[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def options[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP options method
      */
    def options[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def options[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def options[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    var opts: RouterOptions = js.native
    
    /**
      * Run middleware for named route parameters. Useful for auto-loading or
      * validation.
      *
      * @example
      *
      * ```javascript
      * router
      *   .param('user', (id, ctx, next) => {
      *     ctx.user = users[id];
      *     if (!ctx.user) return ctx.status = 404;
      *     return next();
      *   })
      *   .get('/users/:user', ctx => {
      *     ctx.body = ctx.user;
      *   })
      *   .get('/users/:user/friends', ctx => {
      *     return ctx.user.getFriends().then(function(friends) {
      *       ctx.body = friends;
      *     });
      *   })
      *   // /users/3 => {"id": 3, "name": "Alex"}
      *   // /users/3/friends => [{"id": 4, "name": "TJ"}]
      * ```
      */
    def param[BodyT](param: String, middleware: ParamMiddleware[StateT, ContextT, BodyT]): Router[StateT, ContextT] = js.native
    
    var params: js.Object = js.native
    
    /**
      * HTTP patch method
      */
    def patch[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def patch[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP patch method
      */
    def patch[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def patch[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def patch[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * HTTP post method
      */
    def post[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def post[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP post method
      */
    def post[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def post[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def post[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * Set the path prefix for a Router instance that was already initialized.
      *
      * @example
      *
      * ```javascript
      * router.prefix('/things/:thing_id')
      * ```
      */
    def prefix(prefix: String): Router[StateT, ContextT] = js.native
    
    /**
      * HTTP put method
      */
    def put[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def put[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP put method
      */
    def put[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def put[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def put[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
    /**
      * Redirect `source` to `destination` URL with optional 30x status `code`.
      *
      * Both `source` and `destination` can be route names.
      *
      * ```javascript
      * router.redirect('/login', 'sign-in');
      * ```
      *
      * This is equivalent to:
      *
      * ```javascript
      * router.all('/login', ctx => {
      *   ctx.redirect('/sign-in');
      *   ctx.status = 301;
      * });
      * ```
      */
    def redirect(source: String, destination: String): Router[StateT, ContextT] = js.native
    def redirect(source: String, destination: String, code: Double): Router[StateT, ContextT] = js.native
    
    def register(path: String, methods: js.Array[String], middleware: js.Array[Middleware[StateT, ContextT, Any]]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[Middleware[StateT, ContextT, Any]],
      opts: LayerOptions
    ): Layer = js.native
    /**
      * Create and register a route.
      */
    def register(path: String, methods: js.Array[String], middleware: Middleware[StateT, ContextT, Any]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: Middleware[StateT, ContextT, Any],
      opts: LayerOptions
    ): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[Middleware[StateT, ContextT, Any]]
    ): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[Middleware[StateT, ContextT, Any]],
      opts: LayerOptions
    ): Layer = js.native
    def register(path: js.RegExp, methods: js.Array[String], middleware: Middleware[StateT, ContextT, Any]): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: Middleware[StateT, ContextT, Any],
      opts: LayerOptions
    ): Layer = js.native
    
    /**
      * Lookup route with given `name`.
      */
    def route(name: String): Layer | Boolean = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def routes(): Middleware[StateT, ContextT, Any] = js.native
    
    var stack: js.Array[Layer] = js.native
    
    /**
      * HTTP unlink method
      */
    def unlink[T, U, B](name: String, path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def unlink[T, U, B](name: String, path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    /**
      * HTTP unlink method
      */
    def unlink[T, U, B](path: String, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def unlink[T, U, B](path: js.Array[String | js.RegExp], middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    def unlink[T, U, B](path: js.RegExp, middleware: (Middleware[StateT & T, ContextT & U, B])*): Router[StateT, ContextT] = js.native
    
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
    def url(name: String): js.Error | String = js.native
    def url(name: String, params: Any): js.Error | String = js.native
    def url(name: String, params: Any, options: UrlOptionsQuery): js.Error | String = js.native
    def url(name: String, params: Unit, options: UrlOptionsQuery): js.Error | String = js.native
    
    /**
      * Use given middleware.
      *
      * Middleware run in the order they are defined by `.use()`. They are invoked
      * sequentially, requests start at the first middleware and work their way
      * "down" the middleware stack.
      */
    def use(middleware: (Middleware[StateT, ContextT, Any])*): Router[StateT, ContextT] = js.native
    /**
      * Use given middleware.
      *
      * Middleware run in the order they are defined by `.use()`. They are invoked
      * sequentially, requests start at the first middleware and work their way
      * "down" the middleware stack.
      */
    def use(path: String, middleware: (Middleware[StateT, ContextT, Any])*): Router[StateT, ContextT] = js.native
    def use(path: js.Array[String], middleware: (Middleware[StateT, ContextT, Any])*): Router[StateT, ContextT] = js.native
    def use(path: js.RegExp, middleware: (Middleware[StateT, ContextT, Any])*): Router[StateT, ContextT] = js.native
  }
  
  trait RouterAllowedMethodsOptions extends StObject {
    
    /**
      * throw the returned value in place of the default MethodNotAllowed error
      */
    var methodNotAllowed: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * throw the returned value in place of the default NotImplemented error
      */
    var notImplemented: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * throw error instead of setting status and header
      */
    var `throw`: js.UndefOr[Boolean] = js.undefined
  }
  object RouterAllowedMethodsOptions {
    
    inline def apply(): RouterAllowedMethodsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterAllowedMethodsOptions]
    }
    
    extension [Self <: RouterAllowedMethodsOptions](x: Self) {
      
      inline def setMethodNotAllowed(value: () => Any): Self = StObject.set(x, "methodNotAllowed", js.Any.fromFunction0(value))
      
      inline def setMethodNotAllowedUndefined: Self = StObject.set(x, "methodNotAllowed", js.undefined)
      
      inline def setNotImplemented(value: () => Any): Self = StObject.set(x, "notImplemented", js.Any.fromFunction0(value))
      
      inline def setNotImplementedUndefined: Self = StObject.set(x, "notImplemented", js.undefined)
      
      inline def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  type RouterContext[StateT, ContextT, BodyT] = ParameterizedContext[StateT, ContextT & (RouterParamContext[StateT, ContextT]), BodyT]
  
  trait RouterOptions extends StObject {
    
    /**
      * Only run last matched route's controller when there are multiple matches
      */
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Host for router match
      */
    var host: js.UndefOr[String | js.RegExp] = js.undefined
    
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
    
    inline def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    extension [Self <: RouterOptions](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setHost(value: String | js.RegExp): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRouterPath(value: String): Self = StObject.set(x, "routerPath", value.asInstanceOf[js.Any])
      
      inline def setRouterPathUndefined: Self = StObject.set(x, "routerPath", js.undefined)
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait RouterParamContext[StateT, ContextT] extends StObject {
    
    /**
      * Matched route
      */
    var _matchedRoute: js.UndefOr[String | js.RegExp] = js.undefined
    
    var _matchedRouteName: js.UndefOr[String] = js.undefined
    
    /**
      * url params
      */
    var params: Record[String, String]
    
    /**
      * the router instance
      */
    var router: Router[StateT, ContextT]
  }
  object RouterParamContext {
    
    inline def apply[StateT, ContextT](params: Record[String, String], router: Router[StateT, ContextT]): RouterParamContext[StateT, ContextT] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterParamContext[StateT, ContextT]]
    }
    
    extension [Self <: RouterParamContext[?, ?], StateT, ContextT](x: Self & (RouterParamContext[StateT, ContextT])) {
      
      inline def setParams(value: Record[String, String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: Router[StateT, ContextT]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def set_matchedRoute(value: String | js.RegExp): Self = StObject.set(x, "_matchedRoute", value.asInstanceOf[js.Any])
      
      inline def set_matchedRouteName(value: String): Self = StObject.set(x, "_matchedRouteName", value.asInstanceOf[js.Any])
      
      inline def set_matchedRouteNameUndefined: Self = StObject.set(x, "_matchedRouteName", js.undefined)
      
      inline def set_matchedRouteUndefined: Self = StObject.set(x, "_matchedRoute", js.undefined)
    }
  }
  
  trait RoutesMatch extends StObject {
    
    var path: js.Array[Layer]
    
    var pathAndMethod: js.Array[Layer]
    
    var route: Boolean
  }
  object RoutesMatch {
    
    inline def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): RoutesMatch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutesMatch]
    }
    
    extension [Self <: RoutesMatch](x: Self) {
      
      inline def setPath(value: js.Array[Layer]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathAndMethod(value: js.Array[Layer]): Self = StObject.set(x, "pathAndMethod", value.asInstanceOf[js.Any])
      
      inline def setPathAndMethodVarargs(value: Layer*): Self = StObject.set(x, "pathAndMethod", js.Array(value*))
      
      inline def setPathVarargs(value: Layer*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRoute(value: Boolean): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlOptionsQuery extends StObject {
    
    var query: js.Object | String
  }
  object UrlOptionsQuery {
    
    inline def apply(query: js.Object | String): UrlOptionsQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlOptionsQuery]
    }
    
    extension [Self <: UrlOptionsQuery](x: Self) {
      
      inline def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
