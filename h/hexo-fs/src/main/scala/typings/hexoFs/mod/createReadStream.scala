package typings.hexoFs.mod

import typings.node.AnonAutoClose
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typings.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typings.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AnonAutoClose): typings.node.fsMod.ReadStream = js.native
}

