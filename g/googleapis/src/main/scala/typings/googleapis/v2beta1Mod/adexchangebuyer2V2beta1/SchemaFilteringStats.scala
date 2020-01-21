package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly Filtering reasons for this creative during a period of a single
  * day (from midnight to midnight Pacific).
  */
@js.native
trait SchemaFilteringStats extends js.Object {
  /**
    * The day during which the data was collected. The data is collected from
    * 00:00:00 to 23:59:59 PT. During switches from PST to PDT and back, the
    * day may contain 23 or 25 hours of data instead of the usual 24.
    */
  var date: js.UndefOr[SchemaDate] = js.native
  /**
    * The set of filtering reasons for this date.
    */
  var reasons: js.UndefOr[js.Array[SchemaReason]] = js.native
}

object SchemaFilteringStats {
  @scala.inline
  def apply(date: SchemaDate = null, reasons: js.Array[SchemaReason] = null): SchemaFilteringStats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilteringStats]
  }
}

