package typings.gracefulFs.mod

import typings.gracefulFs.gracefulFsStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readdirSync")
@js.native
object readdirSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

