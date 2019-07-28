package typings.jalaaliDashJs.jalaaliDashJsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jalaali-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def d2g(jdn: Double): GregorianDateObject = js.native
  def d2j(jdn: Double): JalaaliDateObject = js.native
  def g2d(gy: Double, gm: Double, gd: Double): Double = js.native
  def isLeapJalaaliYear(jy: Double): Boolean = js.native
  def isValidJalaaliDate(jy: Double, jm: Double, jd: Double): Boolean = js.native
  def j2d(jy: Double, jm: Double, jd: Double): Double = js.native
  def jalCal(jy: Double): JalCalResult = js.native
  def jalaaliMonthLength(jy: Double, jm: Double): Double = js.native
  def toGregorian(jy: Double, jm: Double, jd: Double): GregorianDateObject = js.native
  def toJalaali(date: Date): JalaaliDateObject = js.native
  def toJalaali(gy: Double, gm: Double, gd: Double): JalaaliDateObject = js.native
}

