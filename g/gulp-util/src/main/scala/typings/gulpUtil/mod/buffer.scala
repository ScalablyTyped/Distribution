package typings.gulpUtil.mod

import typings.node.NodeJS.ReadWriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", "buffer")
@js.native
object buffer extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(cb: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ReadWriteStream = js.native
}

