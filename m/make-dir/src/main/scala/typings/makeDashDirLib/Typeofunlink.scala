package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofunlink extends js.Object {
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

object Typeofunlink {
  @scala.inline
  def apply(__promisify__ : nodeLib.fsMod.PathLike => js.Promise[scala.Unit]): Typeofunlink = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeofunlink]
  }
}

