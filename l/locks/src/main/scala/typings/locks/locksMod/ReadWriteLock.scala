package typings.locks.locksMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locks", "ReadWriteLock")
@js.native
/** Construct a new reader writer lock */
class ReadWriteLock () extends js.Object {
  /** Flag indicating whether the reader writer lock is holding the read lock */
  var isReadLocked: Boolean = js.native
  /** Flag indicating whether the reader writer lock is holding the write lock */
  var isWriteLocked: Boolean = js.native
  /** Get the read lock */
  def readLock(callback: js.Function0[Unit]): Unit = js.native
  /** Wait the specified number of milliseconds to take the read lock. If error is set, the lock wasn't taken. */
  def timedReadLock(ttl: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Wait the specified number of milliseconds to take the write lock. If error is set, the lock wasn't taken. */
  def timedWriteLock(ttl: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Try taking the read lock. If false, the lock wasn't taken. */
  def tryReadLock(): Boolean = js.native
  /** Try taking the write lock. If false, the lock wasn't taken. */
  def tryWriteLock(): Boolean = js.native
  /** Release the write lock if taken, or one of the taken read locks. */
  def unlock(): Unit = js.native
  /** Get the write lock */
  def writeLock(callback: js.Function0[Unit]): Unit = js.native
}

