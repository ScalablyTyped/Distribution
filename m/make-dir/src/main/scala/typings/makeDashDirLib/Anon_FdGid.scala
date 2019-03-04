package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FdGid extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit]
}

object Anon_FdGid {
  @scala.inline
  def apply(__promisify__ : js.Function3[scala.Double, scala.Double, scala.Double, js.Promise[scala.Unit]]): Anon_FdGid = {
    val __obj = js.Dynamic.literal(__promisify__ = __promisify__)
  
    __obj.asInstanceOf[Anon_FdGid]
  }
}

