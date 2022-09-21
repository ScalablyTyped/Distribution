package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueDemogAgeCriteria extends StObject {
  
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTargetingValueDemogAgeCriteria {
  
  inline def apply(): SchemaTargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogAgeCriteria]
  }
  
  extension [Self <: SchemaTargetingValueDemogAgeCriteria](x: Self) {
    
    inline def setDemogAgeCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "demogAgeCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setDemogAgeCriteriaIdsNull: Self = StObject.set(x, "demogAgeCriteriaIds", null)
    
    inline def setDemogAgeCriteriaIdsUndefined: Self = StObject.set(x, "demogAgeCriteriaIds", js.undefined)
    
    inline def setDemogAgeCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "demogAgeCriteriaIds", js.Array(value*))
  }
}
