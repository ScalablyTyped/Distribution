package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftmrec extends js.Object {
  def is_leap_year(y: Double): Double = js.native
  def is_leap_year_now(): Double = js.native
  def `match`(rv: String): Double = js.native
  def match_timestamp(rv: String, ti: Double): Double = js.native
  def time_period_match(period: String): Double = js.native
  def time_period_match_timestamp(period: String, ti: Double): Double = js.native
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
  @scala.inline
  implicit class TypeoftmrecOps[Self <: Typeoftmrec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIs_leap_year(value: Double => Double): Self = this.set("is_leap_year", js.Any.fromFunction1(value))
    @scala.inline
    def setIs_leap_year_now(value: () => Double): Self = this.set("is_leap_year_now", js.Any.fromFunction0(value))
    @scala.inline
    def setMatch(value: String => Double): Self = this.set("match", js.Any.fromFunction1(value))
    @scala.inline
    def setMatch_timestamp(value: (String, Double) => Double): Self = this.set("match_timestamp", js.Any.fromFunction2(value))
    @scala.inline
    def setTime_period_match(value: String => Double): Self = this.set("time_period_match", js.Any.fromFunction1(value))
    @scala.inline
    def setTime_period_match_timestamp(value: (String, Double) => Double): Self = this.set("time_period_match_timestamp", js.Any.fromFunction2(value))
  }
  
}

