package typings
package laterLib.laterMod.laterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateProvider extends js.Object {
  /**
    * Set later to use UTC time.
    */
  def UTC(): scala.Unit
  /**
    * Set later to use local time.
    */
  def localTime(): scala.Unit
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
    Y: js.UndefOr[scala.Double],
    M: js.UndefOr[scala.Double],
    D: js.UndefOr[scala.Double],
    h: js.UndefOr[scala.Double],
    m: js.UndefOr[scala.Double],
    s: js.UndefOr[scala.Double]
  ): stdLib.Date
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
  def nextRollover(d: stdLib.Date, `val`: scala.Double, constraint: Modifier, period: TimePeriod): stdLib.Date
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
    Y: js.UndefOr[scala.Double],
    M: js.UndefOr[scala.Double],
    D: js.UndefOr[scala.Double],
    h: js.UndefOr[scala.Double],
    m: js.UndefOr[scala.Double],
    s: js.UndefOr[scala.Double]
  ): stdLib.Date
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
  def prevRollover(d: stdLib.Date, `val`: scala.Double, constraint: Modifier, period: TimePeriod): stdLib.Date
}

object DateProvider {
  @scala.inline
  def apply(
    UTC: () => scala.Unit,
    localTime: () => scala.Unit,
    next: (js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double]) => stdLib.Date,
    nextRollover: (stdLib.Date, scala.Double, Modifier, TimePeriod) => stdLib.Date,
    prev: (js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double], js.UndefOr[scala.Double]) => stdLib.Date,
    prevRollover: (stdLib.Date, scala.Double, Modifier, TimePeriod) => stdLib.Date
  ): DateProvider = {
    val __obj = js.Dynamic.literal(UTC = js.Any.fromFunction0(UTC), localTime = js.Any.fromFunction0(localTime), next = js.Any.fromFunction6(next), nextRollover = js.Any.fromFunction4(nextRollover), prev = js.Any.fromFunction6(prev), prevRollover = js.Any.fromFunction4(prevRollover))
  
    __obj.asInstanceOf[DateProvider]
  }
}

