package typings.gracefulFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "linkSync")
@js.native
object linkSync extends js.Object {
  def apply(existingPath: PathLike, newPath: PathLike): Unit = js.native
}

