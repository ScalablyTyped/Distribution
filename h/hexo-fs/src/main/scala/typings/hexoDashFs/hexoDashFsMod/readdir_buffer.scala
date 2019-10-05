package typings.hexoDashFs.hexoDashFsMod

import typings.bluebird.bluebirdMod.^
import typings.hexoDashFs.hexoDashFsStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readdir")
@js.native
object readdir_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): ^[js.Array[Buffer]] = js.native
}

