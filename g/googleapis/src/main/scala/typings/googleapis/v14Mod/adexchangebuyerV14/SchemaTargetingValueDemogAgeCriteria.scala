package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetingValueDemogAgeCriteria extends StObject {
  
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTargetingValueDemogAgeCriteria {
  
  @scala.inline
  def apply(): SchemaTargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogAgeCriteria]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueDemogAgeCriteriaMutableBuilder[Self <: SchemaTargetingValueDemogAgeCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemogAgeCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogAgeCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemogAgeCriteriaIdsUndefined: Self = StObject.set(x, "demogAgeCriteriaIds", js.undefined)
    
    @scala.inline
    def setDemogAgeCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogAgeCriteriaIds", js.Array(value :_*))
  }
}
