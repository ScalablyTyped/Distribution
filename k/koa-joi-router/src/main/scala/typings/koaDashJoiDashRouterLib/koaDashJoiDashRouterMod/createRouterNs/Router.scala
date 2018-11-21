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
  var param: js.Function2[
    /* param */ java.lang.String, 
    /* middleware */ koaDashRouterLib.koaDashRouterMod.RouterNs.IParamMiddleware, 
    koaDashRouterLib.koaDashRouterMod.Router
  ] = js.native
  @JSName("patch")
  var patch_Original: Method = js.native
  @JSName("post")
  var post_Original: Method = js.native
  var prefix: js.Function1[/* prefix */ java.lang.String, koaDashRouterLib.koaDashRouterMod.Router] = js.native
  @JSName("put")
  var put_Original: Method = js.native
  var routes: js.Array[Spec] = js.native
  var use: (js.Function1[
    /* repeated */koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware, 
    koaDashRouterLib.koaDashRouterMod.Router
  ]) | (js.Function2[
    /* path */ java.lang.String, 
    /* repeated */koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware, 
    koaDashRouterLib.koaDashRouterMod.Router
  ]) | (js.Function2[
    /* path */ js.Array[java.lang.String], 
    /* repeated */koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware, 
    koaDashRouterLib.koaDashRouterMod.Router
  ]) | (js.Function2[
    /* path */ stdLib.RegExp, 
    /* repeated */koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware, 
    koaDashRouterLib.koaDashRouterMod.Router
  ]) = js.native
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
  def middleware(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def options(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def options(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def options(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def options(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def patch(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def patch(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def patch(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def patch(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def post(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def post(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def post(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def put(path: java.lang.String, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def put(path: java.lang.String, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def put(path: stdLib.RegExp, handlerOrConfig: js.Object, handlers: Handler*): Router = js.native
  def put(path: stdLib.RegExp, handlerOrConfig: Handler, handlers: Handler*): Router = js.native
  def route(spec: js.Array[Spec]): Router = js.native
  def route(spec: Spec): Router = js.native
}

