package typings.gracefulDashFs.gracefulDashFsMod

import typings.node.Anon_AutoCloseEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typings.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: String): typings.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: Anon_AutoCloseEncoding): typings.node.fsMod.WriteStream = js.native
}

