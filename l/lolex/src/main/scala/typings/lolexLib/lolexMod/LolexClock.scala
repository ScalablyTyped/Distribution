package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LolexClock[TTimerId /* <: TimerId */] extends js.Object {
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  @JSName("Date")
  var Date_Original: stdLib.DateConstructor = js.native
  /**
    * Current clock time.
    */
  var now: scala.Double = js.native
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  def Date(): java.lang.String = js.native
  /**
    * Clears a timer, as long as it was created using setImmediate.
    *
    * @param id   Timer ID or object.
    */
  def clearImmediate(id: TTimerId): scala.Unit = js.native
  /**
    * Clears a timer, as long as it was created using setInterval.
    *
    * @param id   Timer ID or object.
    */
  def clearInterval(id: TTimerId): scala.Unit = js.native
  /**
    * Clears a timer, as long as it was created using setTimeout.
    *
    * @param id   Timer ID or object.
    */
  def clearTimeout(id: TTimerId): scala.Unit = js.native
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    */
  def next(): scala.Unit = js.native
  /**
    * Simulates process.nextTick();
    */
  def nextTick(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Runs all pending timers until there are none remaining.
    *
    * @remarks  If new timers are added while it is executing they will be run as well.
    */
  def runAll(): scala.Unit = js.native
  /**
    * Takes note of the last scheduled timer when it is run, and advances the clock to
    * that time firing callbacks as necessary.
    */
  def runToLast(): scala.Unit = js.native
  /**
    * Schedules the callback to be fired once 0 milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @remarks You'll still have to call clock.tick() for the callback to fire.
    * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
    */
  def setImmediate(callback: js.Function0[_]): TTimerId = js.native
  /**
    * Schedules a callback to be fired every time timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait between callbacks.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  def setInterval(callback: js.Function0[_], timeout: scala.Double, args: js.Any*): TTimerId = js.native
  /**
    * Simulates a user changing the system clock.
    *
    * @param now   New system time.
    * @remarks This affects the current time but it does not in itself cause timers to fire.
    */
  def setSystemTime(): scala.Unit = js.native
  def setSystemTime(now: scala.Double): scala.Unit = js.native
  def setSystemTime(now: stdLib.Date): scala.Unit = js.native
  /**
    * Schedules a callback to be fired once timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait to run the callback.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  def setTimeout(callback: js.Function0[_], timeout: scala.Double, args: js.Any*): TTimerId = js.native
  def tick(time: java.lang.String): scala.Unit = js.native
  /**
    * Advance the clock, firing callbacks if necessary.
    *
    * @param time   How many ticks to advance by.
    */
  def tick(time: scala.Double): scala.Unit = js.native
  /**
    * Restores the original methods on the context that was passed to lolex.install,
    * or the native timers if no context was given.
    */
  def uninstall(): scala.Unit = js.native
}

