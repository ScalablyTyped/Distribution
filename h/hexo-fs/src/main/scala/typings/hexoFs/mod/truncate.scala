package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "truncate")
@js.native
object truncate extends js.Object {
  def apply(path: PathLike): typings.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, len: Double): typings.bluebird.mod.^[Unit] = js.native
}

