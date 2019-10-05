package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lchmod")
@js.native
object lchmod extends js.Object {
  def apply(path: PathLike, mode: String): ^[Unit] = js.native
  def apply(path: PathLike, mode: Double): ^[Unit] = js.native
}

