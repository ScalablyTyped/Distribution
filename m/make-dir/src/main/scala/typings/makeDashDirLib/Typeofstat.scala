package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofstat extends js.Object {
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[nodeLib.fsMod.Stats]
}

object Typeofstat {
  @scala.inline
  def apply(__promisify__ : nodeLib.fsMod.PathLike => js.Promise[nodeLib.fsMod.Stats]): Typeofstat = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeofstat]
  }
}

