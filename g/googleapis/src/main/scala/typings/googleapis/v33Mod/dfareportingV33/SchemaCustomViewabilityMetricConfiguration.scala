package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes, like playtime and percent onscreen, that define the Custom
  * Viewability Metric.
  */
@js.native
trait SchemaCustomViewabilityMetricConfiguration extends js.Object {
  /**
    * Whether the video must be audible to count an impression.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * The time in milliseconds the video must play for the Custom Viewability
    * Metric to count an impression. If both this and timePercent are
    * specified, the earlier of the two will be used.
    */
  var timeMillis: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must play for the Custom Viewability Metric
    * to count an impression. If both this and timeMillis are specified, the
    * earlier of the two will be used.
    */
  var timePercent: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must be on screen for the Custom Viewability
    * Metric to count an impression.
    */
  var viewabilityPercent: js.UndefOr[Double] = js.native
}

object SchemaCustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(
    audible: js.UndefOr[Boolean] = js.undefined,
    timeMillis: js.UndefOr[Double] = js.undefined,
    timePercent: js.UndefOr[Double] = js.undefined,
    viewabilityPercent: js.UndefOr[Double] = js.undefined
  ): SchemaCustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeMillis)) __obj.updateDynamic("timeMillis")(timeMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timePercent)) __obj.updateDynamic("timePercent")(timePercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewabilityPercent)) __obj.updateDynamic("viewabilityPercent")(viewabilityPercent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomViewabilityMetricConfiguration]
  }
}

