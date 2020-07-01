package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Frequency cap.
  */
@js.native
trait SchemaFrequencyCap extends js.Object {
  /**
    * The maximum number of impressions that can be served to a user within the
    * specified time period.
    */
  var maxImpressions: js.UndefOr[Double] = js.native
  /**
    * The amount of time, in the units specified by time_unit_type. Defines the
    * amount of time over which impressions per user are counted and capped.
    */
  var numTimeUnits: js.UndefOr[Double] = js.native
  /**
    * The time unit. Along with num_time_units defines the amount of time over
    * which impressions per user are counted and capped.
    */
  var timeUnitType: js.UndefOr[String] = js.native
}

object SchemaFrequencyCap {
  @scala.inline
  def apply(
    maxImpressions: js.UndefOr[Double] = js.undefined,
    numTimeUnits: js.UndefOr[Double] = js.undefined,
    timeUnitType: String = null
  ): SchemaFrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImpressions)) __obj.updateDynamic("maxImpressions")(maxImpressions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numTimeUnits)) __obj.updateDynamic("numTimeUnits")(numTimeUnits.get.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFrequencyCap]
  }
}

