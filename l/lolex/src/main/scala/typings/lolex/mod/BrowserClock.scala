package typings.lolex.mod

import org.scalablytyped.runtime.Instantiable1
import typings.lolex.anon.Now
import typings.std.DateConstructor
import typings.std.global.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lolex clock for a browser environment.
  */
/* Inlined lolex.lolex.LolexClock<number> & {  performance :{now (): number}} */
@js.native
trait BrowserClock extends Clock {
  
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  def Date(): String = js.native
  /**
    * Implements the Date object but using this clock to provide the correct time.
    */
  @JSName("Date")
  var Date_Original: DateConstructor with (Instantiable1[/* value */ Double, Date]) = js.native
  
  /**
    * Cancel animation frame request.
    *
    * @param id   The id returned from requestAnimationFrame method.
    */
  def cancelAnimationFrame(id: Double): Unit = js.native
  
  /**
    * Clears a timer, as long as it was created using requestIdleCallback.
    *
    * @param id   Timer ID or object.
    */
  def cancelIdleCallback(id: Double): Unit = js.native
  
  /**
    * Clears a timer, as long as it was created using setImmediate.
    *
    * @param id   Timer ID or object.
    */
  def clearImmediate(id: Double): Unit = js.native
  
  /**
    * Clears a timer, as long as it was created using setInterval.
    *
    * @param id   Timer ID or object.
    */
  def clearInterval(id: Double): Unit = js.native
  
  /**
    * Clears a timer, as long as it was created using setTimeout.
    *
    * @param id   Timer ID or object.
    */
  def clearTimeout(id: TimerId): Unit = js.native
  
  /**
    * Get the number of waiting timers.
    *
    * @returns number of waiting timers.
    */
  def countTimers(): Double = js.native
  
  /**
    * Maximum number of timers that will be run when calling runAll().
    */
  var loopLimit: Double = js.native
  
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    */
  def next(): Unit = js.native
  
  /**
    * Advances the clock to the the moment of the first scheduled timer, firing it.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    */
  def nextAsync(): js.Promise[Unit] = js.native
  
  /**
    * Current clock time.
    */
  var now: Double = js.native
  
  /**
    * Mimics performance.now().
    */
  var performance: Now = js.native
  
  /**
    * Schedule callback to run in the next animation frame.
    *
    * @param callback   Callback to be fired.
    * @returns Request id.
    */
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
  
  /**
    * Queues the callback to be fired during idle periods to perform background and low priority work on the main event loop.
    *
    * @param callback   Callback to be fired.
    * @param timeout   The maximum number of ticks before the callback must be fired.
    * @remarks Callbacks which have a timeout option will be fired no later than time in milliseconds.
    */
  def requestIdleCallback(callback: js.Function0[Unit]): Double = js.native
  def requestIdleCallback(callback: js.Function0[Unit], timeout: Double): Double = js.native
  
  /**
    * Removes all timers and tick without firing them and restore now to its original value.
    */
  def reset(): Unit = js.native
  
  /**
    * Runs all pending timers until there are none remaining.
    *
    * @remarks  If new timers are added while it is executing they will be run as well.
    */
  def runAll(): Unit = js.native
  
  /**
    * Runs all pending timers until there are none remaining.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    *
    * @remarks  If new timers are added while it is executing they will be run as well.
    */
  def runAllAsync(): js.Promise[Unit] = js.native
  
  /**
    * Advanced the clock to the next animation frame while firing all scheduled callbacks.
    */
  def runToFrame(): Unit = js.native
  
  /**
    * Takes note of the last scheduled timer when it is run, and advances the clock to
    * that time firing callbacks as necessary.
    */
  def runToLast(): Unit = js.native
  
  /**
    * Takes note of the last scheduled timer when it is run, and advances the clock to
    * that time firing callbacks as necessary.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    */
  def runToLastAsync(): js.Promise[Unit] = js.native
  
  /**
    * Schedules the callback to be fired once 0 milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @remarks You'll still have to call clock.tick() for the callback to fire.
    * @remarks If called during a tick the callback won't fire until 1 millisecond has ticked by.
    */
  def setImmediate(callback: js.Function0[Unit]): Double = js.native
  
  /**
    * Schedules a callback to be fired every time timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait between callbacks.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  def setInterval(callback: js.Function0[Unit], timeout: Double, args: js.Any*): Double = js.native
  
  /**
    * Simulates a user changing the system clock.
    *
    * @param now   New system time.
    * @remarks This affects the current time but it does not in itself cause timers to fire.
    */
  def setSystemTime(): Unit = js.native
  def setSystemTime(now: Double): Unit = js.native
  def setSystemTime(now: typings.std.Date): Unit = js.native
  
  /**
    * Schedules a callback to be fired once timeout milliseconds have ticked by.
    *
    * @param callback   Callback to be fired.
    * @param timeout   How many ticks to wait to run the callback.
    * @param args   Any extra arguments to pass to the callback.
    * @returns Time identifier for cancellation.
    */
  def setTimeout(callback: js.Function0[Unit], timeout: Double, args: js.Any*): Double = js.native
  
  def tick(time: String): Unit = js.native
  /**
    * Advance the clock, firing callbacks if necessary.
    *
    * @param time   How many ticks to advance by.
    */
  def tick(time: Double): Unit = js.native
  
  def tickAsync(time: String): js.Promise[Unit] = js.native
  /**
    * Advance the clock, firing callbacks if necessary.
    *
    * Also breaks the event loop, allowing any scheduled promise callbacks to execute _before_ running the timers.
    *
    * @param time   How many ticks to advance by.
    */
  def tickAsync(time: Double): js.Promise[Unit] = js.native
}
