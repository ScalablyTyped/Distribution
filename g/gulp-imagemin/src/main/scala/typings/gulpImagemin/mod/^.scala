package typings.gulpImagemin.mod

import typings.imagemin.mod.Plugin
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-imagemin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Transform = js.native
  def apply(pluginsOrOptions: js.Array[Plugin]): Transform = js.native
  def apply(pluginsOrOptions: Options): Transform = js.native
  def apply(plugins: js.Array[Plugin], options: Options): Transform = js.native
}

