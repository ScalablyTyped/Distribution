package typings
package locksLib.locksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locks", "ReadWriteLock")
@js.native
class ReadWriteLock () extends js.Object {
  /** Flag indicating whether the reader writer lock is holding the read lock */
  var isReadLocked: scala.Boolean = js.native
  /** Flag indicating whether the reader writer lock is holding the write lock */
  var isWriteLocked: scala.Boolean = js.native
  /** Get the read lock */
  def readLock(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Wait the specified number of milliseconds to take the read lock. If error is set, the lock wasn't taken. */
  def timedReadLock(ttl: scala.Double, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Wait the specified number of milliseconds to take the write lock. If error is set, the lock wasn't taken. */
  def timedWriteLock(ttl: scala.Double, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Try taking the read lock. If false, the lock wasn't taken. */
  def tryReadLock(): scala.Boolean = js.native
  /** Try taking the write lock. If false, the lock wasn't taken. */
  def tryWriteLock(): scala.Boolean = js.native
  /** Release the write lock if taken, or one of the taken read locks. */
  def unlock(): scala.Unit = js.native
  /** Get the write lock */
  def writeLock(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

