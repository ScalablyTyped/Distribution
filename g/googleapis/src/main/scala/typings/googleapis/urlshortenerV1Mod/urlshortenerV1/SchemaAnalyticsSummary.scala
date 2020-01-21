package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnalyticsSummary extends js.Object {
  /**
    * Click analytics over all time.
    */
  var allTime: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last day.
    */
  var day: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last month.
    */
  var month: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last two hours.
    */
  var twoHours: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
  /**
    * Click analytics over the last week.
    */
  var week: js.UndefOr[SchemaAnalyticsSnapshot] = js.native
}

object SchemaAnalyticsSummary {
  @scala.inline
  def apply(
    allTime: SchemaAnalyticsSnapshot = null,
    day: SchemaAnalyticsSnapshot = null,
    month: SchemaAnalyticsSnapshot = null,
    twoHours: SchemaAnalyticsSnapshot = null,
    week: SchemaAnalyticsSnapshot = null
  ): SchemaAnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    if (allTime != null) __obj.updateDynamic("allTime")(allTime.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (twoHours != null) __obj.updateDynamic("twoHours")(twoHours.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyticsSummary]
  }
}

