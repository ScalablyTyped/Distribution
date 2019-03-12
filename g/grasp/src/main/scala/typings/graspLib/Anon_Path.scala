package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[nodeLib.fsMod.Stats]
}

object Anon_Path {
  @scala.inline
  def apply(__promisify__ : nodeLib.fsMod.PathLike => js.Promise[nodeLib.fsMod.Stats]): Anon_Path = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_Path]
  }
}

