package typings
package koaDashMountLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-mount", JSImport.Namespace)
@js.native
object koaDashMountMod extends js.Object {
  def apply(app: (koaLib.koaMod.Middleware[_, js.Object]) | (koaLib.koaMod.^[_, js.Object])): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(
    prefix: java.lang.String,
    app: (koaLib.koaMod.Middleware[_, js.Object]) | (koaLib.koaMod.^[_, js.Object])
  ): koaLib.koaMod.Middleware[_, js.Object] = js.native
}

