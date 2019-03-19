package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Isleapyear extends js.Object {
  def is_leap_year(y: scala.Double): scala.Double
  def is_leap_year_now(): scala.Double
  def `match`(rv: java.lang.String): scala.Double
  def match_timestamp(rv: java.lang.String, ti: scala.Double): scala.Double
  def time_period_match(period: java.lang.String): scala.Double
  def time_period_match_timestamp(period: java.lang.String, ti: scala.Double): scala.Double
}

object Anon_Isleapyear {
  @scala.inline
  def apply(
    is_leap_year: scala.Double => scala.Double,
    is_leap_year_now: () => scala.Double,
    `match`: java.lang.String => scala.Double,
    match_timestamp: (java.lang.String, scala.Double) => scala.Double,
    time_period_match: java.lang.String => scala.Double,
    time_period_match_timestamp: (java.lang.String, scala.Double) => scala.Double
  ): Anon_Isleapyear = {
    val __obj = js.Dynamic.literal(is_leap_year = js.Any.fromFunction1(is_leap_year), is_leap_year_now = js.Any.fromFunction0(is_leap_year_now), match_timestamp = js.Any.fromFunction2(match_timestamp), time_period_match = js.Any.fromFunction1(time_period_match), time_period_match_timestamp = js.Any.fromFunction2(time_period_match_timestamp))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Anon_Isleapyear]
  }
}

