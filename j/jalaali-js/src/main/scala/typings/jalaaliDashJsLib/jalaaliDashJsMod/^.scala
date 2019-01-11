package typings
package jalaaliDashJsLib.jalaaliDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jalaali-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def d2g(jdn: scala.Double): jalaaliDashJsLib.jalaaliDashJsMod.GregorianDateObject = js.native
  def d2j(jdn: scala.Double): jalaaliDashJsLib.jalaaliDashJsMod.JalaaliDateObject = js.native
  def g2d(gy: scala.Double, gm: scala.Double, gd: scala.Double): scala.Double = js.native
  def isLeapJalaaliYear(jy: scala.Double): scala.Boolean = js.native
  def isValidJalaaliDate(jy: scala.Double, jm: scala.Double, jd: scala.Double): scala.Boolean = js.native
  def j2d(jy: scala.Double, jm: scala.Double, jd: scala.Double): scala.Double = js.native
  def jalCal(jy: scala.Double): jalaaliDashJsLib.jalaaliDashJsMod.JalCalResult = js.native
  def jalaaliMonthLength(jy: scala.Double, jm: scala.Double): scala.Double = js.native
  def toGregorian(jy: scala.Double, jm: scala.Double, jd: scala.Double): jalaaliDashJsLib.jalaaliDashJsMod.GregorianDateObject = js.native
  def toJalaali(date: stdLib.Date): jalaaliDashJsLib.jalaaliDashJsMod.JalaaliDateObject = js.native
  def toJalaali(gy: scala.Double, gm: scala.Double, gd: scala.Double): jalaaliDashJsLib.jalaaliDashJsMod.JalaaliDateObject = js.native
}

