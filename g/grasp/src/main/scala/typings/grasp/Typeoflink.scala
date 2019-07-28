package typings.grasp

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflink extends js.Object {
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit]
}

object Typeoflink {
  @scala.inline
  def apply(link: (PathLike, PathLike) => js.Promise[Unit]): Typeoflink = {
    val __obj = js.Dynamic.literal(link = js.Any.fromFunction2(link))
  
    __obj.asInstanceOf[Typeoflink]
  }
}

