package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExistingPath extends js.Object {
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def link(existingPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

object Anon_ExistingPath {
  @scala.inline
  def apply(link: js.Function2[nodeLib.fsMod.PathLike, nodeLib.fsMod.PathLike, js.Promise[scala.Unit]]): Anon_ExistingPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Anon_ExistingPath]
  }
}

