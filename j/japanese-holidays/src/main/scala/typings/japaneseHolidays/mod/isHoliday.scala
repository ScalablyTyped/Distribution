package typings.japaneseHolidays.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("japanese-holidays", "isHoliday")
@js.native
object isHoliday extends js.Object {
  def apply(date: Date): js.UndefOr[String] = js.native
  def apply(date: Date, furikae: Boolean): js.UndefOr[String] = js.native
}

