package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "DateTime")
@js.native
class DateTime ()
  extends luxonLib.luxonMod.luxonNs.DateTime

@JSImport("luxon", "DateTime")
@js.native
object DateTime extends js.Object {
  val DATETIME_FULL: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_FULL_WITH_SECONDS: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_HUGE: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_HUGE_WITH_SECONDS: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_MED: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_MED_WITH_SECONDS: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_SHORT: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATETIME_SHORT_WITH_SECONDS: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATE_FULL: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATE_HUGE: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATE_MED: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val DATE_SHORT: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_24_SIMPLE: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_24_WITH_LONG_OFFSET: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_24_WITH_SECONDS: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_24_WITH_SHORT_OFFSET: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_SIMPLE: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_WITH_LONG_OFFSET: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_WITH_SECONDS: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  val TIME_WITH_SHORT_OFFSET: luxonLib.luxonMod.luxonNs.DateTimeFormatOptions = js.native
  def fromFormat(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromFormat(text: java.lang.String, format: java.lang.String, opts: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromFormatExplain(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.luxonNs.ExplainedFormat = js.native
  def fromFormatExplain(text: java.lang.String, format: java.lang.String, opts: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.ExplainedFormat = js.native
  def fromHTTP(text: java.lang.String): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromHTTP(text: java.lang.String, options: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromISO(text: java.lang.String): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromISO(text: java.lang.String, options: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromJSDate(date: stdLib.Date): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromJSDate(date: stdLib.Date, options: luxonLib.luxonMod.luxonNs.DateTimeJSOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromMillis(ms: scala.Double): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromMillis(ms: scala.Double, options: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromObject(obj: luxonLib.luxonMod.luxonNs.DateObject): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromRFC2822(text: java.lang.String): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromRFC2822(text: java.lang.String, options: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromSQL(text: java.lang.String): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromSQL(text: java.lang.String, options: luxonLib.luxonMod.luxonNs.DateTimeOptions): luxonLib.luxonMod.luxonNs.DateTime = js.native
  /**
    * @deprecated since 0.3.0. Use fromFormat instead
    */
  def fromString(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def fromString(
    text: java.lang.String,
    format: java.lang.String,
    options: luxonLib.luxonMod.luxonNs.DateTimeOptions
  ): luxonLib.luxonMod.luxonNs.DateTime = js.native
  /**
    * @deprecated 0.3.0. Use fromFormatExplain instead
    */
  def fromStringExplain(text: java.lang.String, format: java.lang.String): luxonLib.luxonMod.luxonNs.ExplainedFormat = js.native
  def fromStringExplain(
    text: java.lang.String,
    format: java.lang.String,
    options: luxonLib.luxonMod.luxonNs.DateTimeOptions
  ): luxonLib.luxonMod.luxonNs.ExplainedFormat = js.native
  def invalid(reason: js.Any): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def local(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    millisecond: js.UndefOr[scala.Double]
  ): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def max(): js.UndefOr[scala.Nothing] = js.native
  def max(dateTimes: luxonLib.luxonMod.luxonNs.DateTime*): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def min(): js.UndefOr[scala.Nothing] = js.native
  def min(dateTimes: luxonLib.luxonMod.luxonNs.DateTime*): luxonLib.luxonMod.luxonNs.DateTime = js.native
  def utc(
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    millisecond: js.UndefOr[scala.Double]
  ): luxonLib.luxonMod.luxonNs.DateTime = js.native
}

