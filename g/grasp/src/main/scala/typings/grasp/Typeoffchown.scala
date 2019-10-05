package typings.grasp

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffchown extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def apply(
    fd: Double,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
}

