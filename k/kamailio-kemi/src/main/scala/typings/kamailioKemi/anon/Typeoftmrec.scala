package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftmrec extends js.Object {
  def is_leap_year(y: Double): Double
  def is_leap_year_now(): Double
  def `match`(rv: String): Double
  def match_timestamp(rv: String, ti: Double): Double
  def time_period_match(period: String): Double
  def time_period_match_timestamp(period: String, ti: Double): Double
}

object Typeoftmrec {
  @scala.inline
  def apply(
    is_leap_year: Double => Double,
    is_leap_year_now: () => Double,
    `match`: String => Double,
    match_timestamp: (String, Double) => Double,
    time_period_match: String => Double,
    time_period_match_timestamp: (String, Double) => Double
  ): Typeoftmrec = {
    val __obj = js.Dynamic.literal(is_leap_year = js.Any.fromFunction1(is_leap_year), is_leap_year_now = js.Any.fromFunction0(is_leap_year_now), match_timestamp = js.Any.fromFunction2(match_timestamp), time_period_match = js.Any.fromFunction1(time_period_match), time_period_match_timestamp = js.Any.fromFunction2(time_period_match_timestamp))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Typeoftmrec]
  }
}

