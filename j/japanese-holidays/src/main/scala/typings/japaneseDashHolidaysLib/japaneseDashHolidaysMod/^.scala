package typings
package japaneseDashHolidaysLib.japaneseDashHolidaysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("japanese-holidays", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getHolidaysOf(year: scala.Double): js.Array[japaneseDashHolidaysLib.japaneseDashHolidaysMod.Holiday] = js.native
  def getHolidaysOf(year: scala.Double, furikae: scala.Boolean): js.Array[japaneseDashHolidaysLib.japaneseDashHolidaysMod.Holiday] = js.native
  def isHoliday(date: stdLib.Date): js.UndefOr[java.lang.String] = js.native
  def isHoliday(date: stdLib.Date, furikae: scala.Boolean): js.UndefOr[java.lang.String] = js.native
  def isHolidayAt(date: stdLib.Date): js.UndefOr[java.lang.String] = js.native
  def isHolidayAt(date: stdLib.Date, furikae: scala.Boolean): js.UndefOr[java.lang.String] = js.native
}

