package typings.atIonicUtilsDashFs.atIonicUtilsDashFsMod

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "lchownSync")
@js.native
object lchownSync extends js.Object {
  /**
    * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, uid: Double, gid: Double): Unit = js.native
}

