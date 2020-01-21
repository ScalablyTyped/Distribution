package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValueDemogGenderCriteria extends js.Object {
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetingValueDemogGenderCriteria {
  @scala.inline
  def apply(demogGenderCriteriaIds: js.Array[String] = null): SchemaTargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    if (demogGenderCriteriaIds != null) __obj.updateDynamic("demogGenderCriteriaIds")(demogGenderCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueDemogGenderCriteria]
  }
}

