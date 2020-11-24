package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValueDemogGenderCriteria extends js.Object {
  
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object TargetingValueDemogGenderCriteria {
  
  @scala.inline
  def apply(): TargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDemogGenderCriteria]
  }
  
  @scala.inline
  implicit class TargetingValueDemogGenderCriteriaOps[Self <: TargetingValueDemogGenderCriteria] (val x: Self) extends AnyVal {
    
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
