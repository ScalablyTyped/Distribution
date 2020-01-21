package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a time of day. The date and time zone are either not significant
  * or are specified elsewhere. An API may choose to allow leap seconds.
  * Related types are google.type.Date and `google.protobuf.Timestamp`.
  */
@js.native
trait SchemaTimeOfDay extends js.Object {
  /**
    * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
    * to allow the value &quot;24:00:00&quot; for scenarios like business
    * closing time.
    */
  var hours: js.UndefOr[Double] = js.native
  /**
    * Minutes of hour of day. Must be from 0 to 59.
    */
  var minutes: js.UndefOr[Double] = js.native
  /**
    * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
    */
  var nanos: js.UndefOr[Double] = js.native
  /**
    * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
    * allow the value 60 if it allows leap-seconds.
    */
  var seconds: js.UndefOr[Double] = js.native
}

object SchemaTimeOfDay {
  @scala.inline
  def apply(
    hours: Int | Double = null,
    minutes: Int | Double = null,
    nanos: Int | Double = null,
    seconds: Int | Double = null
  ): SchemaTimeOfDay = {
    val __obj = js.Dynamic.literal()
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimeOfDay]
  }
}

