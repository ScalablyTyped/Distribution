package typings.gracefulDashFs.gracefulDashFsMod

import typings.gracefulDashFs.gracefulDashFsStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readlinkSync")
@js.native
object readlinkSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): Buffer = js.native
}

