package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Environment
@js.native
trait FakeTimers extends js.Object {
  def advanceTimersByTime(msToRun: Double): Unit = js.native
  def advanceTimersToNextTimer(): Unit = js.native
  def advanceTimersToNextTimer(steps: Double): Unit = js.native
  def clearAllTimers(): Unit = js.native
  def getTimerCount(): Double = js.native
  def runAllImmediates(): Unit = js.native
  def runAllTicks(): Unit = js.native
  def runAllTimers(): Unit = js.native
  def runOnlyPendingTimers(): Unit = js.native
  def runTimersToTime(msToRun: Double): Unit = js.native
  def runWithRealTimers(callback: js.Any): Unit = js.native
  def useFakeTimers(): Unit = js.native
  def useRealTimers(): Unit = js.native
}

