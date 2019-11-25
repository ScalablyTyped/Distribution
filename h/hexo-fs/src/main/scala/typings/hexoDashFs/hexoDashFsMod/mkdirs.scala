package typings.hexoDashFs.hexoDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "mkdirs")
@js.native
object mkdirs extends js.Object {
  def apply(path: PathLike): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(path: PathLike, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
}

