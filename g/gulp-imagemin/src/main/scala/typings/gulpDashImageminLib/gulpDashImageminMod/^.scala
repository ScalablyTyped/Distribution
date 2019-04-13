package typings
package gulpDashImageminLib.gulpDashImageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-imagemin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val gifsicle: PluginFactory[imageminDashGifsicleLib.imageminDashGifsicleMod.Options] = js.native
  val jpegtran: PluginFactory[imageminDashJpegtranLib.imageminDashJpegtranMod.Options] = js.native
  val optipng: PluginFactory[imageminDashOptipngLib.imageminDashOptipngMod.Options] = js.native
  val svgo: PluginFactory[imageminDashSvgoLib.imageminDashSvgoMod.Options] = js.native
  def apply(): nodeLib.streamMod.Transform = js.native
  def apply(pluginsOrOptions: js.Array[imageminLib.imageminMod.Plugin] | Options): nodeLib.streamMod.Transform = js.native
  def apply(plugins: js.Array[imageminLib.imageminMod.Plugin]): nodeLib.streamMod.Transform = js.native
  def apply(plugins: js.Array[imageminLib.imageminMod.Plugin], options: Options): nodeLib.streamMod.Transform = js.native
}

