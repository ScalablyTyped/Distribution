package typings.later.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateProvider extends js.Object {
  /**
    * Set later to use UTC time.
    */
  def UTC(): Unit = js.native
  /**
    * Set later to use local time.
    */
  def localTime(): Unit = js.native
  /**
    * Builds and returns a new Date using the specified values.  Date
    * returned is either using Local time or UTC based on isLocal.
    *
    * @param [Y]: Four digit year
    * @param [M]: Month between 1 and 12, defaults to 1
    * @param [D]: Date between 1 and 31, defaults to 1
    * @param [h]: Hour between 0 and 23, defaults to 0
    * @param [m]: Minute between 0 and 59, defaults to 0
    * @param [s]: Second between 0 and 59, defaults to 0
    */
  def next(
    Y: js.UndefOr[Double],
    M: js.UndefOr[Double],
    D: js.UndefOr[Double],
    h: js.UndefOr[Double],
    m: js.UndefOr[Double],
    s: js.UndefOr[Double]
  ): Date = js.native
  /**
    * Determines if a value will cause a particular constraint to rollover to the
    * next largest time period. Used primarily when a constraint has a
    * variable extent.
    *
    * @param d: Date
    * @param val: Value
    * @param constraint: A modifier
    * @param period: A time period
    */
  def nextRollover(d: Date, `val`: Double, constraint: Modifier, period: TimePeriod): Date = js.native
  /**
    * Builds and returns a new Date using the specified values.  Date
    * returned is either using Local time or UTC based on isLocal.
    *
    * @param [Y]: Four digit year
    * @param [M]: Month between 0 and 11, defaults to 11
    * @param [D]: Date between 1 and 31, defaults to last day of month
    * @param [h]: Hour between 0 and 23, defaults to 23
    * @param [m]: Minute between 0 and 59, defaults to 59
    * @param [s]: Second between 0 and 59, defaults to 59
    */
  def prev(
    Y: js.UndefOr[Double],
    M: js.UndefOr[Double],
    D: js.UndefOr[Double],
    h: js.UndefOr[Double],
    m: js.UndefOr[Double],
    s: js.UndefOr[Double]
  ): Date = js.native
  /**
    * Determines if a value will cause a particular constraint to rollover to the
    * previous largest time period. Used primarily when a constraint has a
    * variable extent.
    *
    * @param d: Date
    * @param val: Value
    * @param constraint: A modifier
    * @param period: A time period
    */
  def prevRollover(d: Date, `val`: Double, constraint: Modifier, period: TimePeriod): Date = js.native
}

object DateProvider {
  @scala.inline
  def apply(
    UTC: () => Unit,
    localTime: () => Unit,
    next: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => Date,
    nextRollover: (Date, Double, Modifier, TimePeriod) => Date,
    prev: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => Date,
    prevRollover: (Date, Double, Modifier, TimePeriod) => Date
  ): DateProvider = {
    val __obj = js.Dynamic.literal(UTC = js.Any.fromFunction0(UTC), localTime = js.Any.fromFunction0(localTime), next = js.Any.fromFunction6(next), nextRollover = js.Any.fromFunction4(nextRollover), prev = js.Any.fromFunction6(prev), prevRollover = js.Any.fromFunction4(prevRollover))
    __obj.asInstanceOf[DateProvider]
  }
  @scala.inline
  implicit class DateProviderOps[Self <: DateProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUTC(value: () => Unit): Self = this.set("UTC", js.Any.fromFunction0(value))
    @scala.inline
    def setLocalTime(value: () => Unit): Self = this.set("localTime", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(
      value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => Date
    ): Self = this.set("next", js.Any.fromFunction6(value))
    @scala.inline
    def setNextRollover(value: (Date, Double, Modifier, TimePeriod) => Date): Self = this.set("nextRollover", js.Any.fromFunction4(value))
    @scala.inline
    def setPrev(
      value: (js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]) => Date
    ): Self = this.set("prev", js.Any.fromFunction6(value))
    @scala.inline
    def setPrevRollover(value: (Date, Double, Modifier, TimePeriod) => Date): Self = this.set("prevRollover", js.Any.fromFunction4(value))
  }
  
}

