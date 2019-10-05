package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "chmod")
@js.native
object chmod extends js.Object {
  def apply(path: PathLike, mode: String): ^[Unit] = js.native
  def apply(path: PathLike, mode: Double): ^[Unit] = js.native
}

