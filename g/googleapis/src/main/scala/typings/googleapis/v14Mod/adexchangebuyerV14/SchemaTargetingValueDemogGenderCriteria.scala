package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetingValueDemogGenderCriteria extends StObject {
  
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTargetingValueDemogGenderCriteria {
  
  @scala.inline
  def apply(): SchemaTargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogGenderCriteria]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueDemogGenderCriteriaMutableBuilder[Self <: SchemaTargetingValueDemogGenderCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemogGenderCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogGenderCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogGenderCriteriaIdsUndefined: Self = StObject.set(x, "demogGenderCriteriaIds", js.undefined)
    
    @scala.inline
    def setDemogGenderCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogGenderCriteriaIds", js.Array(value :_*))
  }
}
