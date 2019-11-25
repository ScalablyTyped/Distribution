package typings.hexoDashFs.hexoDashFsMod

import typings.hexoDashFs.hexoDashFsStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readlink")
@js.native
object readlink_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): typings.bluebird.bluebirdMod.^[Buffer] = js.native
}

