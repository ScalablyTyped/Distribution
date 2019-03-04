package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewPath extends js.Object {
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def __promisify__(oldPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

object Anon_NewPath {
  @scala.inline
  def apply(
    __promisify__ : js.Function2[nodeLib.fsMod.PathLike, nodeLib.fsMod.PathLike, js.Promise[scala.Unit]]
  ): Anon_NewPath = {
    val __obj = js.Dynamic.literal(__promisify__ = __promisify__)
  
    __obj.asInstanceOf[Anon_NewPath]
  }
}

