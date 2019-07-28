package typings.jalaaliDashJs.jalaaliDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GregorianDateObject extends js.Object {
  /** Gregorian day */
  var gd: Double
  /** Gregorian month */
  var gm: Double
  /** Gregorian year */
  var gy: Double
}

object GregorianDateObject {
  @scala.inline
  def apply(gd: Double, gm: Double, gy: Double): GregorianDateObject = {
    val __obj = js.Dynamic.literal(gd = gd, gm = gm, gy = gy)
  
    __obj.asInstanceOf[GregorianDateObject]
  }
}

