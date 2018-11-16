package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.timezone")
@js.native
object timezoneNs extends js.Object {
  def abbr(targetDate: stdLib.Date, timezone: java.lang.String): java.lang.String = js.native
  @JSName("apply")
  def apply(targetDate: stdLib.Date, offset: java.lang.String): stdLib.Date = js.native
  @JSName("apply")
  def apply(targetDate: stdLib.Date, offset: scala.Double): stdLib.Date = js.native
  def convert(targetDate: stdLib.Date, fromOffset: java.lang.String, toOffset: java.lang.String): stdLib.Date = js.native
  def convert(targetDate: stdLib.Date, fromOffset: java.lang.String, toOffset: scala.Double): stdLib.Date = js.native
  def convert(targetDate: stdLib.Date, fromOffset: scala.Double, toOffset: java.lang.String): stdLib.Date = js.native
  def convert(targetDate: stdLib.Date, fromOffset: scala.Double, toOffset: scala.Double): stdLib.Date = js.native
  def offset(utcTime: scala.Double, timezone: java.lang.String): scala.Double = js.native
  def offset(utcTime: stdLib.Date, timezone: java.lang.String): scala.Double = js.native
  def remove(targetDate: stdLib.Date, offset: java.lang.String): stdLib.Date = js.native
  def remove(targetDate: stdLib.Date, offset: scala.Double): stdLib.Date = js.native
  def toLocalDate(targetDate: scala.Double): stdLib.Date = js.native
  def toLocalDate(targetDate: stdLib.Date): stdLib.Date = js.native
}

