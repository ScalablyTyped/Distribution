package typings.locks.locksMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locks", "Mutex")
@js.native
/** Construct a new mutex lock. */
class Mutex () extends js.Object {
  /** Flag indicating whether the lock is currently taken. */
  var isLocked: Boolean = js.native
  /** Take the lock. */
  def lock(callback: js.Function0[Unit]): Unit = js.native
  /** Clear any waiting lock callbacks. */
  def resetQueue(): Unit = js.native
  /** Wait the specified number of milliseconds to take the lock. If error is set, the lock wasn't taken. */
  def timedlock(ttl: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Try taking the lock. If false, the lock wasn't taken. */
  def tryLock(): Boolean = js.native
  /** Release the current lock. */
  def unlock(): Unit = js.native
}

