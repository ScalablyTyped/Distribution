package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Mode extends js.Object {
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, mode: scala.Double): js.Promise[scala.Unit] = js.native
}

