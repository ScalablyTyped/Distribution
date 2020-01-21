package typings.hexoFs.mod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "stat")
@js.native
object stat extends js.Object {
  def apply(path: PathLike): typings.bluebird.mod.^[typings.gracefulFs.mod.Stats] = js.native
}

