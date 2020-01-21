package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSeason extends js.Object {
  /**
    * Inclusive end date of the recurrence period.
    */
  var end: js.UndefOr[SchemaMonthDay] = js.native
  /**
    * Optionally present list of prorations for the season. Each proration is a
    * one-off discounted entry into a subscription. Each proration contains the
    * first date on which the discount is available and the new pricing
    * information.
    */
  var prorations: js.UndefOr[js.Array[SchemaProrate]] = js.native
  /**
    * Inclusive start date of the recurrence period.
    */
  var start: js.UndefOr[SchemaMonthDay] = js.native
}

object SchemaSeason {
  @scala.inline
  def apply(
    end: SchemaMonthDay = null,
    prorations: js.Array[SchemaProrate] = null,
    start: SchemaMonthDay = null
  ): SchemaSeason = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (prorations != null) __obj.updateDynamic("prorations")(prorations.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSeason]
  }
}

