package typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "existsSync")
@js.native
object existsSync extends js.Object {
  /**
    * Synchronously tests whether or not the given path exists by checking with the file system.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): Boolean = js.native
}

