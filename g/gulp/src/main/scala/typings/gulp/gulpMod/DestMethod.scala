package typings.gulp.gulpMod

import typings.node.NodeJS.ReadWriteStream
import typings.vinyl.vinylMod.File
import typings.vinylDashFs.vinylDashFsMod.DestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestMethod extends js.Object {
  def apply(folder: String): ReadWriteStream = js.native
  def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
}

