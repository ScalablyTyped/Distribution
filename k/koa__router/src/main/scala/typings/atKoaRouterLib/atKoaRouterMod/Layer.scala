package typings
package atKoaRouterLib.atKoaRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@koa/router", "Layer")
@js.native
class Layer protected () extends js.Object {
  def this(path: java.lang.String, methods: js.Array[java.lang.String], middleware: Middleware[_, js.Object]) = this()
  def this(path: java.lang.String, methods: js.Array[java.lang.String], middleware: js.Array[Middleware[_, js.Object]]) = this()
  def this(path: stdLib.RegExp, methods: js.Array[java.lang.String], middleware: Middleware[_, js.Object]) = this()
  def this(path: stdLib.RegExp, methods: js.Array[java.lang.String], middleware: js.Array[Middleware[_, js.Object]]) = this()
  def this(path: java.lang.String, methods: js.Array[java.lang.String], middleware: Middleware[_, js.Object], opts: LayerOptions) = this()
  def this(path: java.lang.String, methods: js.Array[java.lang.String], middleware: js.Array[Middleware[_, js.Object]], opts: LayerOptions) = this()
  def this(path: stdLib.RegExp, methods: js.Array[java.lang.String], middleware: Middleware[_, js.Object], opts: LayerOptions) = this()
  def this(path: stdLib.RegExp, methods: js.Array[java.lang.String], middleware: js.Array[Middleware[_, js.Object]], opts: LayerOptions) = this()
  var methods: js.Array[java.lang.String] = js.native
  var name: java.lang.String = js.native
  var opts: LayerOptions = js.native
  var paramNames: js.Array[ParamName] = js.native
  var path: java.lang.String = js.native
  var regexp: stdLib.RegExp = js.native
  var stack: js.Array[Middleware[_, js.Object]] = js.native
  /**
    * Returns array of regexp url path captures.
    */
  def captures(path: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Returns whether request `path` matches route.
    */
  def `match`(path: java.lang.String): scala.Boolean = js.native
  /**
    * Run validations on route named parameters.
    */
  def param(param: java.lang.String, fn: Middleware[_, js.Object]): Layer = js.native
  /**
    * Returns map of URL parameters for given `path` and `paramNames`.
    */
  def params(path: java.lang.String, captures: js.Array[java.lang.String]): js.Object = js.native
  def params(path: java.lang.String, captures: js.Array[java.lang.String], existingParams: js.Object): js.Object = js.native
  def params(path: stdLib.RegExp, captures: js.Array[java.lang.String]): js.Object = js.native
  def params(path: stdLib.RegExp, captures: js.Array[java.lang.String], existingParams: js.Object): js.Object = js.native
  /**
    * Prefix route path.
    */
  def setPrefix(prefix: java.lang.String): Layer = js.native
  /**
    * Generate URL for route using given `params`.
    */
  def url(params: js.Object): java.lang.String = js.native
}

