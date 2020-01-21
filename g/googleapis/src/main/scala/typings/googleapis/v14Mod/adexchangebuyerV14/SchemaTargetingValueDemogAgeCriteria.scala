package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValueDemogAgeCriteria extends js.Object {
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetingValueDemogAgeCriteria {
  @scala.inline
  def apply(demogAgeCriteriaIds: js.Array[String] = null): SchemaTargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    if (demogAgeCriteriaIds != null) __obj.updateDynamic("demogAgeCriteriaIds")(demogAgeCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueDemogAgeCriteria]
  }
}

