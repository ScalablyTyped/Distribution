package typings.gulpDashImagemin.gulpDashImageminMod

import typings.imagemin.imageminMod.Plugin
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-imagemin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val gifsicle: PluginFactory[typings.imageminDashGifsicle.imageminDashGifsicleMod.Options] = js.native
  val jpegtran: PluginFactory[typings.imageminDashJpegtran.imageminDashJpegtranMod.Options] = js.native
  val optipng: PluginFactory[typings.imageminDashOptipng.imageminDashOptipngMod.Options] = js.native
  val svgo: PluginFactory[typings.imageminDashSvgo.imageminDashSvgoMod.Options] = js.native
  def apply(): Transform = js.native
  def apply(pluginsOrOptions: js.Array[Plugin] | Options): Transform = js.native
  def apply(plugins: js.Array[Plugin]): Transform = js.native
  def apply(plugins: js.Array[Plugin], options: Options): Transform = js.native
}

