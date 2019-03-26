package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fd extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit]
}

object Anon_Fd {
  @scala.inline
  def apply(__promisify__ : (scala.Double, scala.Double, scala.Double) => js.Promise[scala.Unit]): Anon_Fd = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction3(__promisify__))
  
    __obj.asInstanceOf[Anon_Fd]
  }
}

