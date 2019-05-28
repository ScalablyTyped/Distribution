package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffchmod extends js.Object {
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(fd: scala.Double, mode: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, mode: scala.Double): js.Promise[scala.Unit] = js.native
}

