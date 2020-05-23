package typings.gracefulFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "existsSync")
@js.native
object existsSync extends js.Object {
  def apply(path: PathLike): Boolean = js.native
}

