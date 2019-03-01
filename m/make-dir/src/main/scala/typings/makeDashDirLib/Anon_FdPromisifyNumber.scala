package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FdPromisifyNumber extends js.Object {
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def `__promisify__`(fd: scala.Double): js.Promise[scala.Unit]
}

object Anon_FdPromisifyNumber {
  @scala.inline
  def apply(`__promisify__`: js.Function1[scala.Double, js.Promise[scala.Unit]]): Anon_FdPromisifyNumber = {
    val __obj = js.Dynamic.literal(`__promisify__` = `__promisify__`)
  
    __obj.asInstanceOf[Anon_FdPromisifyNumber]
  }
}

