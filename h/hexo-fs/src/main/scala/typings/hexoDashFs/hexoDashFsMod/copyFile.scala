package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "copyFile")
@js.native
object copyFile extends js.Object {
  def apply(src: PathLike, dest: String): ^[Unit] = js.native
  def apply(src: PathLike, dest: String, callback: js.Function1[/* err */ js.Any, Unit]): ^[Unit] = js.native
}

