package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lchmod")
@js.native
object lchmod extends js.Object {
  def apply(path: PathLike, mode: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, mode: Double): typings.bluebird.mod.^[Unit] = js.native
}

