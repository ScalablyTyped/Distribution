package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "truncate")
@js.native
object truncate extends js.Object {
  def apply(path: PathLike): ^[Unit] = js.native
  def apply(path: PathLike, len: Double): ^[Unit] = js.native
}

