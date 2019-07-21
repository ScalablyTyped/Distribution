package typings
package atKoaRouterLib.atKoaRouterMod

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
  def all(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def all(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def all(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def all(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def all(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def all[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def all[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
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
  def del(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def del(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def del(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def del(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def del(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def del[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def del[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * HTTP delete method
    */
  def delete(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def delete(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def delete(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def delete(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def delete(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def delete[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def delete[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * HTTP get method
    */
  def get(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def get(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def get(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def get(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def get(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def get[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def get[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * HTTP head method
    */
  def head(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def head(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def head(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def head(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def head(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def head[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def head[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * HTTP link method
    */
  def link(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def link(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def link(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def link(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def link(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def link[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def link[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * Match given `path` and return corresponding routes.
    */
  def `match`(path: java.lang.String, method: java.lang.String): RoutesMatch = js.native
  /**
    * Returns router middleware which dispatches a route matching the request.
    */
  def middleware(): Middleware[StateT, CustomT] = js.native
  /**
    * HTTP options method
    */
  def options(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def options(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def options(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def options(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def options(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def options[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def options[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * Run middleware for named route parameters. Useful for auto-loading or validation.
    */
  def param(param: java.lang.String, middleware: ParamMiddleware): Router[StateT, CustomT] = js.native
  /**
    * HTTP patch method
    */
  def patch(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def patch(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def patch(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def patch(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def patch(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def patch[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def patch[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * HTTP post method
    */
  def post(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def post(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def post(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def post(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def post(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def post[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def post[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * Set the path prefix for a Router instance that was already initialized.
    */
  def prefix(prefix: java.lang.String): Router[StateT, CustomT] = js.native
  /**
    * HTTP put method
    */
  def put(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def put(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def put(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def put(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def put(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def put[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def put[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  /**
    * Redirect `source` to `destination` URL with optional 30x status `code`.
    *
    * Both `source` and `destination` can be route names.
    */
  def redirect(source: java.lang.String, destination: java.lang.String): Router[StateT, CustomT] = js.native
  def redirect(source: java.lang.String, destination: java.lang.String, code: scala.Double): Router[StateT, CustomT] = js.native
  /**
    * Create and register a route.
    */
  def register(
    path: java.lang.String,
    methods: js.Array[java.lang.String],
    middleware: Middleware[StateT, CustomT]
  ): Layer = js.native
  def register(
    path: java.lang.String,
    methods: js.Array[java.lang.String],
    middleware: Middleware[StateT, CustomT],
    opts: LayerOptions
  ): Layer = js.native
  def register(
    path: java.lang.String,
    methods: js.Array[java.lang.String],
    middleware: js.Array[Middleware[StateT, CustomT]]
  ): Layer = js.native
  def register(
    path: java.lang.String,
    methods: js.Array[java.lang.String],
    middleware: js.Array[Middleware[StateT, CustomT]],
    opts: LayerOptions
  ): Layer = js.native
  def register(path: stdLib.RegExp, methods: js.Array[java.lang.String], middleware: Middleware[StateT, CustomT]): Layer = js.native
  def register(
    path: stdLib.RegExp,
    methods: js.Array[java.lang.String],
    middleware: Middleware[StateT, CustomT],
    opts: LayerOptions
  ): Layer = js.native
  def register(
    path: stdLib.RegExp,
    methods: js.Array[java.lang.String],
    middleware: js.Array[Middleware[StateT, CustomT]]
  ): Layer = js.native
  def register(
    path: stdLib.RegExp,
    methods: js.Array[java.lang.String],
    middleware: js.Array[Middleware[StateT, CustomT]],
    opts: LayerOptions
  ): Layer = js.native
  /**
    * Lookup route with given `name`.
    */
  def route(name: java.lang.String): Layer = js.native
  @JSName("route")
  def route_Boolean(name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns router middleware which dispatches a route matching the request.
    */
  def routes(): Middleware[StateT, CustomT] = js.native
  /**
    * HTTP unlink method
    */
  def unlink(name: java.lang.String, path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def unlink(name: java.lang.String, path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def unlink(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def unlink(path: js.Array[java.lang.String | stdLib.RegExp], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def unlink(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def unlink[T, U](
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    path: java.lang.String,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def unlink[T, U](
    path: stdLib.RegExp,
    middleware: koaLib.koaMod.Middleware[T, U],
    routeHandler: Middleware[StateT with T, CustomT with U]
  ): Router[StateT with T, CustomT with U] = js.native
  def url(name: java.lang.String, params: js.Any): stdLib.Error = js.native
  def url(name: java.lang.String, params: js.Any, options: UrlOptionsQuery): stdLib.Error = js.native
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
  def url_String(name: java.lang.String, params: js.Any): java.lang.String = js.native
  @JSName("url")
  def url_String(name: java.lang.String, params: js.Any, options: UrlOptionsQuery): java.lang.String = js.native
  /**
    * Use given middleware.
    *
    * Middleware run in the order they are defined by `.use()`. They are invoked
    * sequentially, requests start at the first middleware and work their way
    * "down" the middleware stack.
    */
  def use(middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def use(path: java.lang.String, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def use(path: js.Array[java.lang.String], middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  def use(path: stdLib.RegExp, middleware: (Middleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
}

