package typings
package jalaaliDashJsLib.jalaaliDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JalCalResult extends js.Object {
  /** Gregorian year of the beginning of Jalaali year */
  var gy: scala.Double
  /** Number of years since the last leap year (0 to 4) */
  var leap: scala.Double
  /** The March day of Farvardin the 1st (1st day of jy) */
  var march: scala.Double
}

object JalCalResult {
  @scala.inline
  def apply(gy: scala.Double, leap: scala.Double, march: scala.Double): JalCalResult = {
    val __obj = js.Dynamic.literal(gy = gy, leap = leap, march = march)
  
    __obj.asInstanceOf[JalCalResult]
  }
}

