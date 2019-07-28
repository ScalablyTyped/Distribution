package typings.koaDashFavicon

import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-favicon", JSImport.Namespace)
@js.native
object koaDashFaviconMod extends js.Object {
  /**
    * Returns a middleware serving the favicon found on the given path.
    */
  def apply(path: String): Middleware[_, js.Object] = js.native
  def apply(path: String, options: Anon_Maxage): Middleware[_, js.Object] = js.native
}

