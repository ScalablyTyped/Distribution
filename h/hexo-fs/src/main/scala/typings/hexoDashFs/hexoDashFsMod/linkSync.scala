package typings.hexoDashFs.hexoDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "linkSync")
@js.native
object linkSync extends js.Object {
  /**
    * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(existingPath: PathLike, newPath: PathLike): Unit = js.native
}

