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
  def apply(): SchemaAnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsSummary]
  }
  @scala.inline
  implicit class SchemaAnalyticsSummaryOps[Self <: SchemaAnalyticsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllTime(value: SchemaAnalyticsSnapshot): Self = this.set("allTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllTime: Self = this.set("allTime", js.undefined)
    @scala.inline
    def setDay(value: SchemaAnalyticsSnapshot): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setMonth(value: SchemaAnalyticsSnapshot): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setTwoHours(value: SchemaAnalyticsSnapshot): Self = this.set("twoHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwoHours: Self = this.set("twoHours", js.undefined)
    @scala.inline
    def setWeek(value: SchemaAnalyticsSnapshot): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
  }
  
}

