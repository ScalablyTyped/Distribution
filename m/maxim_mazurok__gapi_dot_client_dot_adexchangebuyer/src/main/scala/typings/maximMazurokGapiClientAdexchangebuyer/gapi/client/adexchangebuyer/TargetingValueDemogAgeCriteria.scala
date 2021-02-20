package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValueDemogAgeCriteria extends StObject {
  
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object TargetingValueDemogAgeCriteria {
  
  @scala.inline
  def apply(): TargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueDemogAgeCriteria]
  }
  
  @scala.inline
  implicit class TargetingValueDemogAgeCriteriaMutableBuilder[Self <: TargetingValueDemogAgeCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemogAgeCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogAgeCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogAgeCriteriaIdsUndefined: Self = StObject.set(x, "demogAgeCriteriaIds", js.undefined)
    
    @scala.inline
    def setDemogAgeCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogAgeCriteriaIds", js.Array(value :_*))
  }
}
