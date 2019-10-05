package typings.hexoDashFs.hexoDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "unlinkSync")
@js.native
object unlinkSync extends js.Object {
  /**
    * Synchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike): Unit = js.native
}

