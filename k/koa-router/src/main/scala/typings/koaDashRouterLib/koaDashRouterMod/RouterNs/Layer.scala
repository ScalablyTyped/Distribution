package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  var methods: js.Array[java.lang.String] = js.native
  var name: java.lang.String = js.native
  var opts: ILayerOptions = js.native
  var paramNames: js.Array[ParamName] = js.native
  var path: java.lang.String = js.native
  var regexp: stdLib.RegExp = js.native
  var stack: js.Array[IMiddleware] = js.native
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
  def param(param: java.lang.String, fn: IMiddleware): Layer = js.native
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

