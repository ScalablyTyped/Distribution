package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueDemogGenderCriteria extends StObject {
  
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object TargetingValueDemogGenderCriteria {
  
  @scala.inline
  def apply(): TargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDemogGenderCriteria]
  }
  
  @scala.inline
  implicit class TargetingValueDemogGenderCriteriaMutableBuilder[Self <: TargetingValueDemogGenderCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemogGenderCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogGenderCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogGenderCriteriaIdsUndefined: Self = StObject.set(x, "demogGenderCriteriaIds", js.undefined)
    
    @scala.inline
    def setDemogGenderCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogGenderCriteriaIds", js.Array(value :_*))
  }
}
