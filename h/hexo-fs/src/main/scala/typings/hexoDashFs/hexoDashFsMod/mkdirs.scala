package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "mkdirs")
@js.native
object mkdirs extends js.Object {
  def apply(path: PathLike): ^[Unit] = js.native
  def apply(path: PathLike, callback: js.Function1[/* err */ js.Any, Unit]): ^[Unit] = js.native
}

