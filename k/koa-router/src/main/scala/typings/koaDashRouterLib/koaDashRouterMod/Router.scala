package typings
package koaDashRouterLib.koaDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var params: js.Object = js.native
  var stack: js.Array[koaDashRouterLib.koaDashRouterMod.RouterNs.Layer] = js.native
  /**
    * Register route with all methods.
    */
  def all(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def all(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def all(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def all(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def all(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * Returns separate middleware for responding to `OPTIONS` requests with
    * an `Allow` header containing the allowed methods, as well as responding
    * with `405 Method Not Allowed` and `501 Not Implemented` as appropriate.
    */
  def allowedMethods(): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def allowedMethods(options: koaDashRouterLib.koaDashRouterMod.RouterNs.IRouterAllowedMethodsOptions): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Alias for `router.delete()` because delete is a reserved word
    */
  def del(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def del(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def del(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def del(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def del(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * HTTP delete method
    */
  def delete(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def delete(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def delete(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def delete(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def delete(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * HTTP get method
    */
  def get(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def get(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def get(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def get(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def get(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * HTTP head method
    */
  def head(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def head(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def head(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def head(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def head(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * HTTP link method
    */
  def link(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def link(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def link(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def link(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def link(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * Match given `path` and return corresponding routes.
    */
  def `match`(path: java.lang.String, method: java.lang.String): koaDashRouterLib.koaDashRouterMod.RouterNs.IRoutesMatch = js.native
  /**
    * Returns router middleware which dispatches a route matching the request.
    */
  def middleware(): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * HTTP options method
    */
  def options(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def options(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def options(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def options(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def options(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * Run middleware for named route parameters. Useful for auto-loading or validation.
    */
  def param(param: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IParamMiddleware): Router = js.native
  /**
    * HTTP path method
    */
  def patch(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def patch(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def patch(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def patch(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def patch(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * HTTP post method
    */
  def post(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def post(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def post(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def post(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def post(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * Set the path prefix for a Router instance that was already initialized.
    */
  def prefix(prefix: java.lang.String): Router = js.native
  /**
    * HTTP put method
    */
  def put(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def put(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def put(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def put(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def put(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  /**
    * Redirect `source` to `destination` URL with optional 30x status `code`.
    *
    * Both `source` and `destination` can be route names.
    */
  def redirect(source: java.lang.String, destination: java.lang.String): Router = js.native
  def redirect(source: java.lang.String, destination: java.lang.String, code: scala.Double): Router = js.native
  /**
    * Create and register a route.
    */
  def register(
    path: java.lang.String,
    methods: js.Array[java.lang.String],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware
  ): koaDashRouterLib.koaDashRouterMod.RouterNs.Layer = js.native
  def register(
    path: java.lang.String,
    methods: js.Array[java.lang.String],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware,
    opts: js.Object
  ): koaDashRouterLib.koaDashRouterMod.RouterNs.Layer = js.native
  def register(
    path: stdLib.RegExp,
    methods: js.Array[java.lang.String],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware
  ): koaDashRouterLib.koaDashRouterMod.RouterNs.Layer = js.native
  def register(
    path: stdLib.RegExp,
    methods: js.Array[java.lang.String],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware,
    opts: js.Object
  ): koaDashRouterLib.koaDashRouterMod.RouterNs.Layer = js.native
  /**
    * Lookup route with given `name`.
    */
  def route(name: java.lang.String): koaDashRouterLib.koaDashRouterMod.RouterNs.Layer = js.native
  @JSName("route")
  def route_Boolean(name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns router middleware which dispatches a route matching the request.
    */
  def routes(): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * HTTP unlink method
    */
  def unlink(
    name: java.lang.String,
    path: java.lang.String,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def unlink(
    name: java.lang.String,
    path: stdLib.RegExp,
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def unlink(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def unlink(
    path: js.Array[java.lang.String | stdLib.RegExp],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def unlink(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
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
  def url(name: java.lang.String, params: js.Any): java.lang.String = js.native
  def url(
    name: java.lang.String,
    params: js.Any,
    options: koaDashRouterLib.koaDashRouterMod.RouterNs.IUrlOptionsQuery
  ): java.lang.String = js.native
  @JSName("url")
  def url_Error(name: java.lang.String, params: js.Any): nodeLib.Error = js.native
  @JSName("url")
  def url_Error(
    name: java.lang.String,
    params: js.Any,
    options: koaDashRouterLib.koaDashRouterMod.RouterNs.IUrlOptionsQuery
  ): nodeLib.Error = js.native
  /**
    * Use given middleware.
    *
    * Middleware run in the order they are defined by `.use()`. They are invoked
    * sequentially, requests start at the first middleware and work their way
    * "down" the middleware stack.
    */
  def use(middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def use(path: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
  def use(
    path: js.Array[java.lang.String],
    middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*
  ): Router = js.native
  def use(path: stdLib.RegExp, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware*): Router = js.native
}

