package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueDemogAgeCriteria extends StObject {
  
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object TargetingValueDemogAgeCriteria {
  
  inline def apply(): TargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDemogAgeCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetingValueDemogAgeCriteria] (val x: Self) extends AnyVal {
    
    inline def setDemogAgeCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogAgeCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setDemogAgeCriteriaIdsUndefined: Self = StObject.set(x, "demogAgeCriteriaIds", js.undefined)
    
    inline def setDemogAgeCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogAgeCriteriaIds", js.Array(value*))
  }
}
