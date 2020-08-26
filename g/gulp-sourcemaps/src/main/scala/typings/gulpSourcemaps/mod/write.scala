package typings.gulpSourcemaps.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-sourcemaps", "write")
@js.native
object write extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(opts: WriteOptions): ReadWriteStream = js.native
  def apply(path: js.UndefOr[scala.Nothing], opts: WriteOptions): ReadWriteStream = js.native
  def apply(path: String): ReadWriteStream = js.native
  def apply(path: String, opts: WriteOptions): ReadWriteStream = js.native
}

