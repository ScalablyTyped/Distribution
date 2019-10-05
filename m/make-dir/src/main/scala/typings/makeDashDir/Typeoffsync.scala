package typings.makeDashDir

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffsync extends js.Object {
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[Unit] = js.native
}

