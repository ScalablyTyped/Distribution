package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LolexClock[TTimerId /* <: TimerId */] extends GlobalTimers[TTimerId] {
  /**
    * Maximum number of timers that will be run when calling runAll().
    */
  var loopLimit: scala.Double = js.native
  /**
    * Current clock time.
    */
  var now: scala.Double = js.native
  /**
    * Cancel animation frame request.
    *
    * @param id   The id returned from requestAnimationFrame method.
    */
  def cancelAnimationFrame(id: TTimerId): scala.Unit = js.native
  /**
  	 * Get the number of waiting timers.
  	 *
  	 * @returns number of waiting timers.
  	 */
  def countTimers(): scala.Double = js.native
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    */
  def next(): scala.Unit = js.native
  /**
    * Schedule callback to run in the next animation frame.
    *
    * @param callback   Callback to be fired.
    * @returns Request id.
    */
  def requestAnimationFrame(callback: js.Function1[/* time */ scala.Double, scala.Unit]): TTimerId = js.native
  /**
    * Removes all timers and tick without firing them and restore now to its original value.
    */
  def reset(): scala.Unit = js.native
  /**
    * Runs all pending timers until there are none remaining.
    *
    * @remarks  If new timers are added while it is executing they will be run as well.
    */
  def runAll(): scala.Unit = js.native
  /**
  	 * Advanced the clock to the next animation frame while firing all scheduled callbacks.
  	 */
  def runToFrame(): scala.Unit = js.native
  /**
    * Takes note of the last scheduled timer when it is run, and advances the clock to
    * that time firing callbacks as necessary.
    */
  def runToLast(): scala.Unit = js.native
  /**
    * Simulates a user changing the system clock.
    *
    * @param now   New system time.
    * @remarks This affects the current time but it does not in itself cause timers to fire.
    */
  def setSystemTime(): scala.Unit = js.native
  def setSystemTime(now: scala.Double): scala.Unit = js.native
  def setSystemTime(now: stdLib.Date): scala.Unit = js.native
  def tick(time: java.lang.String): scala.Unit = js.native
  /**
    * Advance the clock, firing callbacks if necessary.
    *
    * @param time   How many ticks to advance by.
    */
  def tick(time: scala.Double): scala.Unit = js.native
}

