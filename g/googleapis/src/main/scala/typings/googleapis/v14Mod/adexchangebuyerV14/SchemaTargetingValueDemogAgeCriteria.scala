package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetingValueDemogAgeCriteria extends js.Object {
  
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTargetingValueDemogAgeCriteria {
  
  @scala.inline
  def apply(): SchemaTargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogAgeCriteria]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueDemogAgeCriteriaOps[Self <: SchemaTargetingValueDemogAgeCriteria] (val x: Self) extends AnyVal {
    
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
    def setDemogAgeCriteriaIdsVarargs(value: String*): Self = this.set("demogAgeCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setDemogAgeCriteriaIds(value: js.Array[String]): Self = this.set("demogAgeCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemogAgeCriteriaIds: Self = this.set("demogAgeCriteriaIds", js.undefined)
  }
}
