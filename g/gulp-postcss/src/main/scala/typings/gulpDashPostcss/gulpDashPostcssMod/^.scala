package typings.gulpDashPostcss.gulpDashPostcssMod

import typings.gulpDashPostcss.Anon_Options
import typings.node.NodeJSNs.ReadWriteStream
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-postcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(callback: js.Function1[/* file */ File, Anon_Options]): ReadWriteStream = js.native
  def apply(plugins: js.Array[_]): ReadWriteStream = js.native
  def apply(plugins: js.Array[_], options: Options): ReadWriteStream = js.native
}

