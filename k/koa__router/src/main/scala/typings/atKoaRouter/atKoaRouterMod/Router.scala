package typings.atKoaRouter.atKoaRouterMod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router[StateT, CustomT] extends js.Object {
  var params: js.Object = js.native
  var stack: js.Array[Layer] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * Run middleware for named route parameters. Useful for auto-loading or validation.
    */
  def param(param: String, middleware: ParamMiddleware): Router[StateT, CustomT] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
  /**
    * Lookup route with given `name`.
    */
  def route(name: String): Layer = js.native
  @JSName("route")
  def route_Boolean(name: String): Boolean = js.native
  /**
    * Returns router middleware which dispatches a route matching the request.
    */
  def routes(): Middleware[StateT, CustomT] = js.native
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
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    name: String,
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    path: String,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    path: js.Array[String | RegExp],
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    path: RegExp,
    middleware: typings.koa.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
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
  def url(name: String, params: js.Any): String = js.native
  def url(name: String, params: js.Any, options: UrlOptionsQuery): String = js.native
  @JSName("url")
  def url_Error(name: String, params: js.Any): Error = js.native
  @JSName("url")
  def url_Error(name: String, params: js.Any, options: UrlOptionsQuery): Error = js.native
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

