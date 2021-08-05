package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueDemogGenderCriteria extends StObject {
  
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object TargetingValueDemogGenderCriteria {
  
  inline def apply(): TargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDemogGenderCriteria]
  }
  
  extension [Self <: TargetingValueDemogGenderCriteria](x: Self) {
    
    inline def setDemogGenderCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogGenderCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setDemogGenderCriteriaIdsUndefined: Self = StObject.set(x, "demogGenderCriteriaIds", js.undefined)
    
    inline def setDemogGenderCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogGenderCriteriaIds", js.Array(value :_*))
  }
}
