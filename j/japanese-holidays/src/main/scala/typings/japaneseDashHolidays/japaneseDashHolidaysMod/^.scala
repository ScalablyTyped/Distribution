package typings.japaneseDashHolidays.japaneseDashHolidaysMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("japanese-holidays", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getHolidaysOf(year: Double): js.Array[Holiday] = js.native
  def getHolidaysOf(year: Double, furikae: Boolean): js.Array[Holiday] = js.native
  def isHoliday(date: Date): js.UndefOr[String] = js.native
  def isHoliday(date: Date, furikae: Boolean): js.UndefOr[String] = js.native
  def isHolidayAt(date: Date): js.UndefOr[String] = js.native
  def isHolidayAt(date: Date, furikae: Boolean): js.UndefOr[String] = js.native
}

