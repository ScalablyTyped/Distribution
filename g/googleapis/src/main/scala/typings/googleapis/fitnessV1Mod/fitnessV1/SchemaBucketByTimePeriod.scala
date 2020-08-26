package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBucketByTimePeriod extends js.Object {
  /**
    * org.joda.timezone.DateTimeZone
    */
  var timeZoneId: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object SchemaBucketByTimePeriod {
  @scala.inline
  def apply(): SchemaBucketByTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByTimePeriod]
  }
  @scala.inline
  implicit class SchemaBucketByTimePeriodOps[Self <: SchemaBucketByTimePeriod] (val x: Self) extends AnyVal {
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
    def setTimeZoneId(value: String): Self = this.set("timeZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZoneId: Self = this.set("timeZoneId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

