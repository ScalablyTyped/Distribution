package typings.hexoDashFs.hexoDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "copyFile")
@js.native
object copyFile extends js.Object {
  def apply(src: PathLike, dest: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def apply(src: PathLike, dest: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.bluebirdMod.^[Unit] = js.native
}

