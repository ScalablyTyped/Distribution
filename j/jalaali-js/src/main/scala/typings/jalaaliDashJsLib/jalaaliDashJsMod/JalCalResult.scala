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

