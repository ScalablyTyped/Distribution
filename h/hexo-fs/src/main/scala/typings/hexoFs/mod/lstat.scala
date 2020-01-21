package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lstat")
@js.native
object lstat extends js.Object {
  def apply(path: PathLike): typings.bluebird.mod.^[typings.gracefulFs.mod.Stats] = js.native
}

