package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information on how frequently and when to run a query.
  */
@js.native
trait SchemaQuerySchedule extends js.Object {
  /**
    * Datetime to periodically run the query until.
    */
  var endTimeMs: js.UndefOr[String] = js.native
  /**
    * How often the query is run.
    */
  var frequency: js.UndefOr[String] = js.native
  /**
    * Time of day at which a new report will be generated, represented as
    * minutes past midnight. Range is 0 to 1439. Only applies to scheduled
    * reports.
    */
  var nextRunMinuteOfDay: js.UndefOr[Double] = js.native
  /**
    * Canonical timezone code for report generation time. Defaults to
    * America/New_York.
    */
  var nextRunTimezoneCode: js.UndefOr[String] = js.native
}

object SchemaQuerySchedule {
  @scala.inline
  def apply(
    endTimeMs: String = null,
    frequency: String = null,
    nextRunMinuteOfDay: js.UndefOr[Double] = js.undefined,
    nextRunTimezoneCode: String = null
  ): SchemaQuerySchedule = {
    val __obj = js.Dynamic.literal()
    if (endTimeMs != null) __obj.updateDynamic("endTimeMs")(endTimeMs.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (!js.isUndefined(nextRunMinuteOfDay)) __obj.updateDynamic("nextRunMinuteOfDay")(nextRunMinuteOfDay.get.asInstanceOf[js.Any])
    if (nextRunTimezoneCode != null) __obj.updateDynamic("nextRunTimezoneCode")(nextRunTimezoneCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuerySchedule]
  }
}

