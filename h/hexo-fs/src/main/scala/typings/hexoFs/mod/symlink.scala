package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "symlink")
@js.native
object symlink extends js.Object {
  def apply(target: PathLike, path: PathLike): typings.bluebird.mod.^[Unit] = js.native
  def apply(target: PathLike, path: PathLike, `type`: String): typings.bluebird.mod.^[Unit] = js.native
}

