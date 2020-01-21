package typings.googleapis.v21Mod.contentV21

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
  def apply(hour: Int | Double = null, minute: Int | Double = null, timezone: String = null): SchemaCutoffTime = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCutoffTime]
  }
}

