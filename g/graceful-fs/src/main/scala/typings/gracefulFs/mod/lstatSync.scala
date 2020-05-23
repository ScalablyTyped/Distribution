package typings.gracefulFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "lstatSync")
@js.native
object lstatSync extends js.Object {
  def apply(path: PathLike): typings.node.fsMod.Stats = js.native
}

