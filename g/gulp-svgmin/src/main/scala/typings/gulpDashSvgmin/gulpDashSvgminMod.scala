package typings.gulpDashSvgmin

import typings.node.streamMod.Transform
import typings.svgo.svgoMod.Options
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-svgmin", JSImport.Namespace)
@js.native
object gulpDashSvgminMod extends js.Object {
  def apply(): Transform = js.native
  def apply(cb: js.Function1[/* file */ File, Options]): Transform = js.native
  def apply(options: Options): Transform = js.native
}

