package typings
package gulpDashImageminLib.gulpDashImageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-imagemin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val gifsicle: gulpDashImageminLib.gulpDashImageminMod.imageminNs.PluginFactory[imageminDashGifsicleLib.imageminDashGifsicleMod.imageminGifsicleNs.Options] = js.native
  val jpegtran: gulpDashImageminLib.gulpDashImageminMod.imageminNs.PluginFactory[imageminDashJpegtranLib.imageminDashJpegtranMod.imageminJpegtranNs.Options] = js.native
  val optipng: gulpDashImageminLib.gulpDashImageminMod.imageminNs.PluginFactory[imageminDashOptipngLib.imageminDashOptipngMod.imageminOptipngNs.Options] = js.native
  val svgo: gulpDashImageminLib.gulpDashImageminMod.imageminNs.PluginFactory[imageminDashSvgoLib.imageminDashSvgoMod.imageminSvgoNs.Options] = js.native
  def apply(): nodeLib.streamMod.Transform = js.native
  def apply(
    pluginsOrOptions: js.Array[imageminLib.imageminMod.imageminNs.Plugin] | gulpDashImageminLib.gulpDashImageminMod.imageminNs.Options
  ): nodeLib.streamMod.Transform = js.native
  def apply(plugins: js.Array[imageminLib.imageminMod.imageminNs.Plugin]): nodeLib.streamMod.Transform = js.native
  def apply(
    plugins: js.Array[imageminLib.imageminMod.imageminNs.Plugin],
    options: gulpDashImageminLib.gulpDashImageminMod.imageminNs.Options
  ): nodeLib.streamMod.Transform = js.native
}

