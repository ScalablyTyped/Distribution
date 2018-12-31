package typings
package locksLib.locksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locks", "Mutex")
@js.native
/** Construct a new mutex lock. */
class Mutex () extends js.Object {
  /** Flag indicating whether the lock is currently taken. */
  var isLocked: scala.Boolean = js.native
  /** Take the lock. */
  def lock(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Clear any waiting lock callbacks. */
  def resetQueue(): scala.Unit = js.native
  /** Wait the specified number of milliseconds to take the lock. If error is set, the lock wasn't taken. */
  def timedlock(ttl: scala.Double, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Try taking the lock. If false, the lock wasn't taken. */
  def tryLock(): scala.Boolean = js.native
  /** Release the current lock. */
  def unlock(): scala.Unit = js.native
}

