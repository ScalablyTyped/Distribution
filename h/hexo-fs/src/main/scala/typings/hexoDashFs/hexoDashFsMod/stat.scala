package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "stat")
@js.native
object stat extends js.Object {
  def apply(path: PathLike): ^[typings.gracefulDashFs.gracefulDashFsMod.Stats] = js.native
}

