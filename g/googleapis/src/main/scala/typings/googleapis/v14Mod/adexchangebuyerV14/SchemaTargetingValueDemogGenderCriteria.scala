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
  def apply(): SchemaTargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogGenderCriteria]
  }
  @scala.inline
  implicit class SchemaTargetingValueDemogGenderCriteriaOps[Self <: SchemaTargetingValueDemogGenderCriteria] (val x: Self) extends AnyVal {
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
    def setDemogGenderCriteriaIdsVarargs(value: String*): Self = this.set("demogGenderCriteriaIds", js.Array(value :_*))
    @scala.inline
    def setDemogGenderCriteriaIds(value: js.Array[String]): Self = this.set("demogGenderCriteriaIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDemogGenderCriteriaIds: Self = this.set("demogGenderCriteriaIds", js.undefined)
  }
  
}

