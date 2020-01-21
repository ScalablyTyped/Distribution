package typings.hexoFs.mod

import typings.hexoFs.hexoFsStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "realpath")
@js.native
object realpath_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): typings.bluebird.mod.^[Buffer] = js.native
}

