package typings.jalaaliJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JalCalResult extends js.Object {
  /** Gregorian year of the beginning of Jalaali year */
  var gy: Double
  /** Number of years since the last leap year (0 to 4) */
  var leap: Double
  /** The March day of Farvardin the 1st (1st day of jy) */
  var march: Double
}

object JalCalResult {
  @scala.inline
  def apply(gy: Double, leap: Double, march: Double): JalCalResult = {
    val __obj = js.Dynamic.literal(gy = gy.asInstanceOf[js.Any], leap = leap.asInstanceOf[js.Any], march = march.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JalCalResult]
  }
}

