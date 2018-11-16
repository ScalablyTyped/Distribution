package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Environment

trait FakeTimers extends js.Object {
  def advanceTimersByTime(msToRun: scala.Double): scala.Unit
  def clearAllTimers(): scala.Unit
  def runAllImmediates(): scala.Unit
  def runAllTicks(): scala.Unit
  def runAllTimers(): scala.Unit
  def runOnlyPendingTimers(): scala.Unit
  def runTimersToTime(msToRun: scala.Double): scala.Unit
  def runWithRealTimers(callback: js.Any): scala.Unit
  def useFakeTimers(): scala.Unit
  def useRealTimers(): scala.Unit
}

