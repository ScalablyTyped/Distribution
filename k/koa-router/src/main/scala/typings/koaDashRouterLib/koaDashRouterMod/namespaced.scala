package typings
package koaDashRouterLib.koaDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-router", JSImport.Namespace)
@js.native
/**
  * Create a new router.
  */
class namespaced[StateT, CustomT] () extends Router[StateT, CustomT] {
  def this(opt: koaDashRouterLib.koaDashRouterMod.RouterNs.IRouterOptions) = this()
}

@JSImport("koa-router", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Generate URL from url pattern and given `params`.
    */
  def url(path: java.lang.String, params: js.Object): java.lang.String = js.native
  def url(path: stdLib.RegExp, params: js.Object): java.lang.String = js.native
}

