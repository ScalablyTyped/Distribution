package typings
package lessDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("less-middleware", JSImport.Namespace)
@js.native
object lessDashMiddlewareMod extends js.Object {
  /**
    * Middleware created to allow processing of Less files for Connect JS framework
    * and by extension the Express JS framework
    */
  def apply(source: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def apply(source: java.lang.String, options: lessDashMiddlewareLib.Anon_CacheFile): expressLib.expressMod.RequestHandler = js.native
}

