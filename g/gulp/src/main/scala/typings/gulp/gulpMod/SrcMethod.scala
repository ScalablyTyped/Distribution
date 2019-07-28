package typings.gulp.gulpMod

import typings.node.NodeJSNs.ReadWriteStream
import typings.vinylDashFs.vinylDashFsMod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SrcMethod extends js.Object {
  def apply(globs: String): ReadWriteStream = js.native
  def apply(globs: String, opt: SrcOptions): ReadWriteStream = js.native
  def apply(globs: js.Array[String]): ReadWriteStream = js.native
  def apply(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
}

