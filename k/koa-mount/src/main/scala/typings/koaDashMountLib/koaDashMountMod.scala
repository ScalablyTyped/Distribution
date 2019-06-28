package typings
package koaDashMountLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-mount", JSImport.Namespace)
@js.native
object koaDashMountMod extends js.Object {
  def apply[StateT, CustomT](app: (koaLib.koaMod.Middleware[StateT, CustomT]) | (koaLib.koaMod.^[StateT, CustomT])): koaLib.koaMod.Middleware[StateT, CustomT] = js.native
  def apply[StateT, CustomT](
    prefix: java.lang.String,
    app: (koaLib.koaMod.Middleware[StateT, CustomT]) | (koaLib.koaMod.^[StateT, CustomT])
  ): koaLib.koaMod.Middleware[StateT, CustomT] = js.native
}

