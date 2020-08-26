package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValue extends js.Object {
  /**
    * The creative size value to exclude/include.
    */
  var creativeSizeValue: js.UndefOr[SchemaTargetingValueCreativeSize] = js.native
  /**
    * The daypart targeting to include / exclude. Filled in when the key is
    * GOOG_DAYPART_TARGETING.
    */
  var dayPartTargetingValue: js.UndefOr[SchemaTargetingValueDayPartTargeting] = js.native
  var demogAgeCriteriaValue: js.UndefOr[SchemaTargetingValueDemogAgeCriteria] = js.native
  var demogGenderCriteriaValue: js.UndefOr[SchemaTargetingValueDemogGenderCriteria] = js.native
  /**
    * The long value to exclude/include.
    */
  var longValue: js.UndefOr[String] = js.native
  /**
    * The string value to exclude/include.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object SchemaTargetingValue {
  @scala.inline
  def apply(): SchemaTargetingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValue]
  }
  @scala.inline
  implicit class SchemaTargetingValueOps[Self <: SchemaTargetingValue] (val x: Self) extends AnyVal {
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
    def setCreativeSizeValue(value: SchemaTargetingValueCreativeSize): Self = this.set("creativeSizeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeSizeValue: Self = this.set("creativeSizeValue", js.undefined)
    @scala.inline
    def setDayPartTargetingValue(value: SchemaTargetingValueDayPartTargeting): Self = this.set("dayPartTargetingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayPartTargetingValue: Self = this.set("dayPartTargetingValue", js.undefined)
    @scala.inline
    def setDemogAgeCriteriaValue(value: SchemaTargetingValueDemogAgeCriteria): Self = this.set("demogAgeCriteriaValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDemogAgeCriteriaValue: Self = this.set("demogAgeCriteriaValue", js.undefined)
    @scala.inline
    def setDemogGenderCriteriaValue(value: SchemaTargetingValueDemogGenderCriteria): Self = this.set("demogGenderCriteriaValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDemogGenderCriteriaValue: Self = this.set("demogGenderCriteriaValue", js.undefined)
    @scala.inline
    def setLongValue(value: String): Self = this.set("longValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongValue: Self = this.set("longValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

