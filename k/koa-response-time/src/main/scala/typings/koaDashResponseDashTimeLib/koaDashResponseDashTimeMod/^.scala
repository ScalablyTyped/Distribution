package typings
package koaDashResponseDashTimeLib.koaDashResponseDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-response-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Add X-Response-Time header field.
    * @param options options dictionary. { hrtime }
    *
    *        hrtime: boolean.
    *          `true` to use time in nanoseconds.
    *          `false` to use time in milliseconds.
    *          Default is `false` to keep back compatible.
    * @api public
    */
  def apply(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(options: KoaResponseTimeOptions): koaLib.koaMod.Middleware[_, js.Object] = js.native
}

