package typings.koaRouter.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@koa/router", "Layer")
@js.native
class Layer protected () extends js.Object {
  def this(path: String, methods: js.Array[String], middleware: js.Array[Middleware[_, js.Object]]) = this()
  def this(path: String, methods: js.Array[String], middleware: Middleware[_, js.Object]) = this()
  def this(path: RegExp, methods: js.Array[String], middleware: js.Array[Middleware[_, js.Object]]) = this()
  def this(path: RegExp, methods: js.Array[String], middleware: Middleware[_, js.Object]) = this()
  def this(
    path: String,
    methods: js.Array[String],
    middleware: js.Array[Middleware[_, js.Object]],
    opts: LayerOptions
  ) = this()
  def this(path: String, methods: js.Array[String], middleware: Middleware[_, js.Object], opts: LayerOptions) = this()
  def this(
    path: RegExp,
    methods: js.Array[String],
    middleware: js.Array[Middleware[_, js.Object]],
    opts: LayerOptions
  ) = this()
  def this(path: RegExp, methods: js.Array[String], middleware: Middleware[_, js.Object], opts: LayerOptions) = this()
  
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
  def param(param: String, fn: Middleware[_, js.Object]): Layer = js.native
  
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
  
  var stack: js.Array[Middleware[_, js.Object]] = js.native
  
  /**
    * Generate URL for route using given `params`.
    */
  def url(params: js.Object): String = js.native
}
