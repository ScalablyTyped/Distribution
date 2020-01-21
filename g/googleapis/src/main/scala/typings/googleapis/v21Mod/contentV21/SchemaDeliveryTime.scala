package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryTime extends js.Object {
  /**
    * Business days cutoff time definition. If not configured the cutoff time
    * will be defaulted to 8AM PST.
    */
  var cutoffTime: js.UndefOr[SchemaCutoffTime] = js.native
  /**
    * Holiday cutoff definitions. If configured, they specify order cutoff
    * times for holiday-specific shipping.
    */
  var holidayCutoffs: js.UndefOr[js.Array[SchemaHolidayCutoff]] = js.native
  /**
    * Maximum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped. Must be greater than or equal
    * to minHandlingTimeInDays.
    */
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Maximum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Minimum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped.
    */
  var minHandlingTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Minimum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Either
    * {min,max}transitTimeInDays or transitTimeTable must be set, but not both.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Transit time table, number of business days spent in transit based on row
    * and column dimensions. Either {min,max}transitTimeInDays or
    * transitTimeTable can be set, but not both.
    */
  var transitTimeTable: js.UndefOr[SchemaTransitTable] = js.native
}

object SchemaDeliveryTime {
  @scala.inline
  def apply(
    cutoffTime: SchemaCutoffTime = null,
    holidayCutoffs: js.Array[SchemaHolidayCutoff] = null,
    maxHandlingTimeInDays: Int | Double = null,
    maxTransitTimeInDays: Int | Double = null,
    minHandlingTimeInDays: Int | Double = null,
    minTransitTimeInDays: Int | Double = null,
    transitTimeTable: SchemaTransitTable = null
  ): SchemaDeliveryTime = {
    val __obj = js.Dynamic.literal()
    if (cutoffTime != null) __obj.updateDynamic("cutoffTime")(cutoffTime.asInstanceOf[js.Any])
    if (holidayCutoffs != null) __obj.updateDynamic("holidayCutoffs")(holidayCutoffs.asInstanceOf[js.Any])
    if (maxHandlingTimeInDays != null) __obj.updateDynamic("maxHandlingTimeInDays")(maxHandlingTimeInDays.asInstanceOf[js.Any])
    if (maxTransitTimeInDays != null) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.asInstanceOf[js.Any])
    if (minHandlingTimeInDays != null) __obj.updateDynamic("minHandlingTimeInDays")(minHandlingTimeInDays.asInstanceOf[js.Any])
    if (minTransitTimeInDays != null) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.asInstanceOf[js.Any])
    if (transitTimeTable != null) __obj.updateDynamic("transitTimeTable")(transitTimeTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeliveryTime]
  }
}

