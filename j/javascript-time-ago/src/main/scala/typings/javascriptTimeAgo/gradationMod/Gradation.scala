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
    factor: js.UndefOr[Double] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    threshold_for_day: js.UndefOr[Double] = js.undefined,
    threshold_for_hour: js.UndefOr[Double] = js.undefined,
    threshold_for_minute: js.UndefOr[Double] = js.undefined,
    threshold_for_month: js.UndefOr[Double] = js.undefined,
    threshold_for_now: js.UndefOr[Double] = js.undefined,
    threshold_for_second: js.UndefOr[Double] = js.undefined,
    threshold_for_week: js.UndefOr[Double] = js.undefined,
    threshold_for_year: js.UndefOr[Double] = js.undefined,
    unit: Unit = null
  ): Gradation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_day)) __obj.updateDynamic("threshold_for_day")(threshold_for_day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_hour)) __obj.updateDynamic("threshold_for_hour")(threshold_for_hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_minute)) __obj.updateDynamic("threshold_for_minute")(threshold_for_minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_month)) __obj.updateDynamic("threshold_for_month")(threshold_for_month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_now)) __obj.updateDynamic("threshold_for_now")(threshold_for_now.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_second)) __obj.updateDynamic("threshold_for_second")(threshold_for_second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_week)) __obj.updateDynamic("threshold_for_week")(threshold_for_week.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold_for_year)) __obj.updateDynamic("threshold_for_year")(threshold_for_year.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradation]
  }
}

