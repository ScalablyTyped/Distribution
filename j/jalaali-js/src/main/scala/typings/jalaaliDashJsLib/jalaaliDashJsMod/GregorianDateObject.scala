package typings
package jalaaliDashJsLib.jalaaliDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GregorianDateObject extends js.Object {
  /** Gregorian day */
  var gd: scala.Double
  /** Gregorian month */
  var gm: scala.Double
  /** Gregorian year */
  var gy: scala.Double
}

object GregorianDateObject {
  @scala.inline
  def apply(gd: scala.Double, gm: scala.Double, gy: scala.Double): GregorianDateObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gd")(gd)
    __obj.updateDynamic("gm")(gm)
    __obj.updateDynamic("gy")(gy)
    __obj.asInstanceOf[GregorianDateObject]
  }
}

