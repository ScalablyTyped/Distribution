package typings.hexoDashFs.hexoDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lstat")
@js.native
object lstat extends js.Object {
  def apply(path: PathLike): typings.bluebird.bluebirdMod.^[typings.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
}

