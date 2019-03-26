package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.createRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  @JSName("delete")
  var delete_Original: Method = js.native
  @JSName("get")
  var get_Original: Method = js.native
  @JSName("head")
  var head_Original: Method = js.native
  @JSName("options")
  var options_Original: Method = js.native
  @JSName("param")
  var param_Original: js.Function2[
    /* param */ java.lang.String, 
    /* middleware */ koaDashRouterLib.koaDashRouterMod.RouterNs.IParamMiddleware, 
    koaDashRouterLib.koaDashRouterMod.Router[_, js.Object]
  ] = js.native
  @JSName("patch")
  var patch_Original: Method = js.native
  @JSName("post")
  var post_Original: Method = js.native
  @JSName("prefix")
  var prefix_Original: js.Function1[
    /* prefix */ java.lang.String, 
    koaDashRouterLib.koaDashRouterMod.Router[_, js.Object]
  ] = js.native
  @JSName("put")
  var put_Original: Method = js.native
  var routes: js.Array[Spec] = js.native
  @JSName("use")
  var use_Original: koaDashJoiDashRouterLib.Anon_Middleware = js.native
  def delete(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def delete(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def delete(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def delete(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def get(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def get(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def get(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def get(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def head(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def head(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def head(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def head(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def middleware(): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def options(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def options(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def options(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def options(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def param(param: java.lang.String, middleware: koaDashRouterLib.koaDashRouterMod.RouterNs.IParamMiddleware): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def patch(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def patch(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def patch(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def patch(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def post(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def post(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def prefix(prefix: java.lang.String): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def put(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def put(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def put(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def put(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def route(spec: js.Array[Spec]): Router = js.native
  def route(spec: Spec): Router = js.native
  def use(middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def use(
    path: java.lang.String,
    middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def use(
    path: js.Array[java.lang.String],
    middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def use(
    path: stdLib.RegExp,
    middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
}

