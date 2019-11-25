package typings.hexoDashFs.hexoDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "exists")
@js.native
object exists extends js.Object {
  def apply(path: PathLike): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def apply(path: PathLike, callback: js.Function1[/* exist */ Boolean, Unit]): typings.bluebird.bluebirdMod.^[Boolean] = js.native
}

