package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueDemogGenderCriteria extends StObject {
  
  var demogGenderCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTargetingValueDemogGenderCriteria {
  
  inline def apply(): SchemaTargetingValueDemogGenderCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogGenderCriteria]
  }
  
  extension [Self <: SchemaTargetingValueDemogGenderCriteria](x: Self) {
    
    inline def setDemogGenderCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogGenderCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setDemogGenderCriteriaIdsUndefined: Self = StObject.set(x, "demogGenderCriteriaIds", js.undefined)
    
    inline def setDemogGenderCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogGenderCriteriaIds", js.Array(value :_*))
  }
}
