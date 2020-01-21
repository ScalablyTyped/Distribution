package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "copyFile")
@js.native
object copyFile extends js.Object {
  def apply(src: PathLike, dest: String): typings.bluebird.mod.^[Unit] = js.native
  def apply(src: PathLike, dest: String, callback: js.Function1[/* err */ js.Any, Unit]): typings.bluebird.mod.^[Unit] = js.native
}

