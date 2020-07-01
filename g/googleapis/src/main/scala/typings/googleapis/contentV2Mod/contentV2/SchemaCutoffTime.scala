package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCutoffTime extends js.Object {
  /**
    * Hour of the cutoff time until which an order has to be placed to be
    * processed in the same day. Required.
    */
  var hour: js.UndefOr[Double] = js.native
  /**
    * Minute of the cutoff time until which an order has to be placed to be
    * processed in the same day. Required.
    */
  var minute: js.UndefOr[Double] = js.native
  /**
    * Timezone identifier for the cutoff time. A list of identifiers can be
    * found in  the AdWords API documentation. E.g. &quot;Europe/Zurich&quot;.
    * Required.
    */
  var timezone: js.UndefOr[String] = js.native
}

object SchemaCutoffTime {
  @scala.inline
  def apply(
    hour: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    timezone: String = null
  ): SchemaCutoffTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCutoffTime]
  }
}

