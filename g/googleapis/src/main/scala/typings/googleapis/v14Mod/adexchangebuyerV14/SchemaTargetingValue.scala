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
  def apply(
    creativeSizeValue: SchemaTargetingValueCreativeSize = null,
    dayPartTargetingValue: SchemaTargetingValueDayPartTargeting = null,
    demogAgeCriteriaValue: SchemaTargetingValueDemogAgeCriteria = null,
    demogGenderCriteriaValue: SchemaTargetingValueDemogGenderCriteria = null,
    longValue: String = null,
    stringValue: String = null
  ): SchemaTargetingValue = {
    val __obj = js.Dynamic.literal()
    if (creativeSizeValue != null) __obj.updateDynamic("creativeSizeValue")(creativeSizeValue.asInstanceOf[js.Any])
    if (dayPartTargetingValue != null) __obj.updateDynamic("dayPartTargetingValue")(dayPartTargetingValue.asInstanceOf[js.Any])
    if (demogAgeCriteriaValue != null) __obj.updateDynamic("demogAgeCriteriaValue")(demogAgeCriteriaValue.asInstanceOf[js.Any])
    if (demogGenderCriteriaValue != null) __obj.updateDynamic("demogGenderCriteriaValue")(demogGenderCriteriaValue.asInstanceOf[js.Any])
    if (longValue != null) __obj.updateDynamic("longValue")(longValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValue]
  }
}

