package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lchown")
@js.native
object lchown extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double): ^[Unit] = js.native
}

