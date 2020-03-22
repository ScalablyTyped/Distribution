package typings.javascriptTimeAgo.gradationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradation extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var threshold_for_day: js.UndefOr[Double] = js.undefined
  var threshold_for_hour: js.UndefOr[Double] = js.undefined
  var threshold_for_minute: js.UndefOr[Double] = js.undefined
  var threshold_for_month: js.UndefOr[Double] = js.undefined
  var threshold_for_now: js.UndefOr[Double] = js.undefined
  var threshold_for_second: js.UndefOr[Double] = js.undefined
  var threshold_for_week: js.UndefOr[Double] = js.undefined
  var threshold_for_year: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
}

object Gradation {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    granularity: Int | Double = null,
    threshold: Int | Double = null,
    threshold_for_day: Int | Double = null,
    threshold_for_hour: Int | Double = null,
    threshold_for_minute: Int | Double = null,
    threshold_for_month: Int | Double = null,
    threshold_for_now: Int | Double = null,
    threshold_for_second: Int | Double = null,
    threshold_for_week: Int | Double = null,
    threshold_for_year: Int | Double = null,
    unit: Unit = null
  ): Gradation = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (threshold_for_day != null) __obj.updateDynamic("threshold_for_day")(threshold_for_day.asInstanceOf[js.Any])
    if (threshold_for_hour != null) __obj.updateDynamic("threshold_for_hour")(threshold_for_hour.asInstanceOf[js.Any])
    if (threshold_for_minute != null) __obj.updateDynamic("threshold_for_minute")(threshold_for_minute.asInstanceOf[js.Any])
    if (threshold_for_month != null) __obj.updateDynamic("threshold_for_month")(threshold_for_month.asInstanceOf[js.Any])
    if (threshold_for_now != null) __obj.updateDynamic("threshold_for_now")(threshold_for_now.asInstanceOf[js.Any])
    if (threshold_for_second != null) __obj.updateDynamic("threshold_for_second")(threshold_for_second.asInstanceOf[js.Any])
    if (threshold_for_week != null) __obj.updateDynamic("threshold_for_week")(threshold_for_week.asInstanceOf[js.Any])
    if (threshold_for_year != null) __obj.updateDynamic("threshold_for_year")(threshold_for_year.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradation]
  }
}

