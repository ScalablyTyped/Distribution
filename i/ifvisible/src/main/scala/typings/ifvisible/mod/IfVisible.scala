package typings.ifvisible.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfVisible extends js.Object {
  
  /**
    * Registers a callback function to blur event
    * @param callback function to run when event fires
    */
  def blur(): IfVisible = js.native
  def blur(callback: js.Function0[Unit]): IfVisible = js.native
  
  /**
    * Registers a callback function to focus event
    * @param callback function to run when event fires
    */
  def focus(): IfVisible = js.native
  def focus(callback: js.Function0[Unit]): IfVisible = js.native
  
  /**
    * Returns the current duration time in milliseconds
    */
  def getIdleDuration(): Double = js.native
  
  /**
    * Returns detailed information about current idle status
    */
  def getIdleInfo(): IdleInfo = js.native
  
  /**
    * Registers a callback function to idle event
    * @param callback function to run when event fires
    */
  def idle(): IfVisible = js.native
  def idle(callback: js.Function0[Unit]): IfVisible = js.native
  
  /**
    * Given the event, it check if page is in that state for example
    * ifvisible.now('idle') return boolean to state if you are idle or not
    */
  def now(): Boolean = js.native
  def now(check: String): Boolean = js.native
  
  /**
    * Unregister given event of name
    * @param name name of the event
    * @param handler function to remove from registered events
    */
  def off(name: String): Unit = js.native
  def off(name: String, handler: js.Function0[Unit]): Unit = js.native
  
  /**
    * Register any event
    * @param name Name of the event
    * @param callback Function to run when event fires
    */
  def on(name: String, callback: js.Function1[/* status */ js.UndefOr[String], Unit]): Double = js.native
  
  /**
    * Utility to run a given function at every given seconds intervals.
    * This method is smart and it will stop executing when the page is not active
    * @param seconds duration to wait between each interval in seconds
    * @param callback callback function run on every iteration
    */
  def onEvery(seconds: Double, callback: js.Function0[Unit]): OnEveryReturn = js.native
  
  /**
    * Let's you change duration that page becomes idle dynamically
    * @param seconds new duration in seconds
    */
  def setIdleDuration(seconds: Double): Double = js.native
  
  /**
    * Registers a callback function to wakeup event
    * @param callback function to run when event fires
    */
  def wakeup(): IfVisible = js.native
  def wakeup(callback: js.Function0[Unit]): IfVisible = js.native
}
