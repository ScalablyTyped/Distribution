package typings.gulpDashTerser

import typings.node.NodeJS.ReadWriteStream
import typings.terser.terserMod.MinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-terser", JSImport.Namespace)
@js.native
object gulpDashTerserMod extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(options: MinifyOptions): ReadWriteStream = js.native
}

