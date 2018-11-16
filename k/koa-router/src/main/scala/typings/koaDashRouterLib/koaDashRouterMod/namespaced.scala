package typings
package koaDashRouterLib.koaDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-router", JSImport.Namespace)
@js.native
class namespaced () extends Router {
  /**
       * Create a new router.
       */
  def this(opt: koaDashRouterLib.koaDashRouterMod.RouterNs.IRouterOptions) = this()
}

@JSImport("koa-router", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * Generate URL from url pattern and given `params`.
       */
  def url(path: java.lang.String, params: js.Object): java.lang.String = js.native
  /**
       * Generate URL from url pattern and given `params`.
       */
  def url(path: stdLib.RegExp, params: js.Object): java.lang.String = js.native
}

