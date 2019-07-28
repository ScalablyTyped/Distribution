package typings.grasp

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrmdir extends js.Object {
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike): js.Promise[Unit]
}

object Typeofrmdir {
  @scala.inline
  def apply(__promisify__ : PathLike => js.Promise[Unit]): Typeofrmdir = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeofrmdir]
  }
}

