package typings.japaneseHolidays.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("japanese-holidays", "getHolidaysOf")
@js.native
object getHolidaysOf extends js.Object {
  def apply(year: Double): js.Array[Holiday] = js.native
  def apply(year: Double, furikae: Boolean): js.Array[Holiday] = js.native
}

