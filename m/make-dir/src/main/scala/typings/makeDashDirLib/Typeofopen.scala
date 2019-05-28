package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofopen extends js.Object {
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, flags: java.lang.String): js.Promise[scala.Double] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: java.lang.String): js.Promise[scala.Double] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: scala.Double): js.Promise[scala.Double] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, flags: scala.Double): js.Promise[scala.Double] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: java.lang.String): js.Promise[scala.Double] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: scala.Double): js.Promise[scala.Double] = js.native
}

