package typings.gulpLoadPlugins.mod

import typings.gulpLoadPlugins.IGulpPlugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-load-plugins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Loads in any gulp plugins and attaches them to an object, freeing you up from having to manually require each gulp plugin. */
  def apply[T /* <: IGulpPlugins */](): T = js.native
  def apply[T /* <: IGulpPlugins */](options: IOptions): T = js.native
}

