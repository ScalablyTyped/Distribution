package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Daypart targeting message that specifies if the ad can be shown only during
  * certain parts of a day/week.
  */
@js.native
trait SchemaDayPart extends js.Object {
  /**
    * The day of the week to target. If unspecified, applicable to all days.
    */
  var dayOfWeek: js.UndefOr[String] = js.native
  /**
    * The ending time of the day for the ad to show (minute level granularity).
    * The end time is exclusive. This field is not available for filtering in
    * PQL queries.
    */
  var endTime: js.UndefOr[SchemaTimeOfDay] = js.native
  /**
    * The starting time of day for the ad to show (minute level granularity).
    * The start time is inclusive. This field is not available for filtering in
    * PQL queries.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.native
}

object SchemaDayPart {
  @scala.inline
  def apply(): SchemaDayPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDayPart]
  }
  @scala.inline
  implicit class SchemaDayPartOps[Self <: SchemaDayPart] (val x: Self) extends AnyVal {
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
    def setDayOfWeek(value: String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setEndTime(value: SchemaTimeOfDay): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: SchemaTimeOfDay): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

