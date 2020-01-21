package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An absolute date range, specified by its start date and end date. The
  * supported range of dates begins 30 days before today and ends today.
  * Validity checked upon filter set creation. If a filter set with an absolute
  * date range is run at a later date more than 30 days after start_date, it
  * will fail.
  */
@js.native
trait SchemaAbsoluteDateRange extends js.Object {
  /**
    * The end date of the range (inclusive). Must be within the 30 days leading
    * up to current date, and must be equal to or after start_date.
    */
  var endDate: js.UndefOr[SchemaDate] = js.native
  /**
    * The start date of the range (inclusive). Must be within the 30 days
    * leading up to current date, and must be equal to or before end_date.
    */
  var startDate: js.UndefOr[SchemaDate] = js.native
}

object SchemaAbsoluteDateRange {
  @scala.inline
  def apply(endDate: SchemaDate = null, startDate: SchemaDate = null): SchemaAbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAbsoluteDateRange]
  }
}

